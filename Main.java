//Main.java
import java.util.*;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

class Main {
	static Boolean running = true;
	static Scanner keyboard = new Scanner(System.in);
	public static void main(String[] args) {	
		Boolean emptyRow = false;
		
		System.out.println("Enter command(s):");

		while(running) {
			if (!emptyRow) System.out.print("> ");
			String query = keyboard.nextLine();
			//take in commands, call parser function on them
			if (!query.isEmpty()) {
				emptyRow = false;
				ANTLRInputStream input = new ANTLRInputStream(query);
		        DMLLexer lexer = new DMLLexer(input);
		        CommonTokenStream tokens = new CommonTokenStream(lexer);
		        DMLParser parser = new DMLParser(tokens);
		        ParseTree tree = parser.program();
		        
		        ParseTreeWalker walker = new ParseTreeWalker();
		        AntlrDMLListener listener = new AntlrDMLListener();
		        walker.walk(listener,tree);
		        
			} else emptyRow = true;
		}
		keyboard.close();
		
		//test code to display all created tables
//		System.out.println();
//		for (int k=0;k<Database.database.size();k++) {
//	        System.out.println("Table Name: " + Database.tableNames.get(k));
//	        for (int j=0;j<Database.database.get(k).size();j++) {
//	        	System.out.print("Row " + j + ": ");
//		        for (int i=0;i<Database.database.get(k).get(0).size();i++) {
//		        	System.out.print(Database.database.get(k).get(j).get(i) + "\t");
//		        }
//		        System.out.println();
//	        }
//	        System.out.println();
//		}
	}
}