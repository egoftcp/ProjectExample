//Database.java
import java.util.*;
import java.io.*;

class Database {

	static Vector<Vector<Vector<Object>>> database = new Vector<Vector<Vector<Object>>>();
	static Vector<String> tableNames = new Vector<String>();
	static Vector<Vector<Object>> tempExprTable = new Vector<Vector<Object>>();
	
	//Places value from relation file into database to be manipulated
	static public void OpenTable(String filename) {
		File file = new File("relations/" + filename + ".db");
		if(file.exists() && !file.isDirectory()) { 
			tableNames.addElement(filename);
			database.addElement(new Vector<Vector<Object>>());
			int tableIndex = database.size() - 1;
			
			String line,type;
			int lineNumber = 0;
			String[] elements;
			Scanner inputFile;
			try {
				inputFile = new Scanner(new FileReader(file));
				while(inputFile.hasNextLine()) {
					line = inputFile.nextLine(); //grab line from file
					elements = line.split("\\|"); //split line into elements
					database.get(tableIndex).addElement(new Vector<Object>()); //add row to table
					for (int i=0;i<elements.length;i++) {
						//set primary key row as Booleans and add values
						if (lineNumber == 2) database.get(tableIndex).get(lineNumber).addElement(Boolean.parseBoolean(elements[i]));
						//cast appropriate type on data rows and add values
						else if (lineNumber > 2) {
							type = (String)database.get(tableIndex).get(1).get(i);
							switch (type) {
								case "Integer":
									database.get(tableIndex).get(lineNumber).addElement(Integer.parseInt(elements[i]));
									break;
								default:
									database.get(tableIndex).get(lineNumber).addElement(elements[i]);
									break;
							}
						}
						else database.get(tableIndex).get(lineNumber).addElement(elements[i]);
					}
					lineNumber++;
				}
				inputFile.close();
				
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
		}
		else System.out.println("File not found!");
	}
	//Check if relation file exists and either allows user to either write over or create the target filename
	static public void WriteTable(String tableName) {
		int tableIndex = tableNames.indexOf(tableName);
		PrintWriter writer;
		try {
			writer = new PrintWriter("relations/" + tableName + ".db");
			for (int i=0;i<database.get(tableIndex).size();i++) {
				for (int j=0;j<database.get(tableIndex).get(0).size();j++) {
					writer.print(database.get(tableIndex).get(i).get(j));
					if (j+1 != database.get(tableIndex).get(0).size()) {
						writer.print("|");
					}
				}
				writer.println();
			}
			writer.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	//Closes and saves relation data from database into file in relations
	static public void CloseTable(String tableName) {
		int tableIndex = tableNames.indexOf(tableName);
		PrintWriter writer;
		File file = new File("relations/" + tableName + ".db");
		if(file.exists() && !file.isDirectory()){
			System.out.println("File is closed.");
			try {																	//Grabs values from database and saves to current open relation file
				writer = new PrintWriter("relations/" + tableName + ".db");
				for (int i=0;i<database.get(tableIndex).size();i++) {
					for (int j=0;j<database.get(tableIndex).get(0).size();j++) {
						writer.print(database.get(tableIndex).get(i).get(j));
						if (j+1 != database.get(tableIndex).get(0).size()) {
							writer.print("|");
						}
					}
					writer.println();
				}
			writer.close();
			} catch (FileNotFoundException e) {										//Standard Error handling
				e.printStackTrace();
			}
		tableNames.removeElementAt(tableIndex);										//Removes elements from database and tableNames Vectors
		database.removeElementAt(tableIndex);
		}
		else System.out.println("File does not exist!");
	}
	//Deletes all values in database
	static public void DeleteTable(String tableName) {
		int tableIndex = tableNames.indexOf(tableName);
		tableNames.removeElementAt(tableIndex);
		database.removeElementAt(tableIndex);
	}
	
	static public void createTable(String tableName, Vector<Object> attrNames, Vector<String> types, Vector<String> primaryKeys) {
		
		tableNames.addElement(tableName);
		database.addElement(new Vector<Vector<Object>>()); //Create new table
		int tableIndex = database.size() - 1;
		
		database.get(tableIndex).addElement(attrNames); //Create and fill first row with attribute names
		database.get(tableIndex).addElement(new Vector<Object>()); //Add second row for attribute types
		database.get(tableIndex).addElement(new Vector<Object>()); //Add third row for primary key bool
		
		Boolean key;
		
		for (int i=0;i<types.size();i++) {  //Fill second and third rows with types and key bools
			String str = types.get(i);
			
			if (str.contains("VARCHAR")) str = "VARCHAR";
			switch (str) {
				case "VARCHAR":
					database.get(tableIndex).get(1).addElement("String");
					break;
				case "INTEGER":
					database.get(tableIndex).get(1).addElement("Integer");
					break;
				default:
					database.get(tableIndex).get(1).addElement("String");
			}
			key = primaryKeys.contains(attrNames.get(i)); //Check to see if type is a primary key
			database.get(tableIndex).get(2).addElement(key); //Set primary key to true/false		
		}
	}
	
	static public void insertInto(String tableName, Vector<Object> literals) {
		int index = tableNames.indexOf(tableName);
		
		if(index > -1) {
			if(literals.size() <= database.get(index).get(0).size()) {
				database.get(index).addElement(new Vector<Object>());
				for(int i = 0; i < literals.size(); i++) {
					System.out.println("Inserting " + literals.get(i) + " to " + database.get(index).get(0).get(i) + " column");
					
					//get current row index
					int rowIndex = database.get(index).size() - 1;
					database.get(index).get(rowIndex).addElement(literals.get(i));
				}
				System.out.println("Done");
			}
			else {
				System.out.println("Error: too many values to insert");
			}
		}
		else {
			System.out.println("Error: table " + tableName + " not found");
		}
	}
	
	static public void insertIntoFromRelation(String tableName, Vector<Vector<Object>> relationTable) {
		int tableIndex = tableNames.indexOf(tableName);
		if(tableIndex > -1) {		
			for(int i = 3; i < relationTable.size(); i++) { 
				database.get(tableIndex).addElement(relationTable.get(i));	
			}
			//TODO: delete duplicates if adding to primaty key column
		}
		else {
			System.out.println("Error: table " + tableName + " not found");
		}
	}
	static public void ShowTable(String tableName){
		int tableIndex= tableNames.indexOf(tableName);
		database.get(tableIndex).get(0);
		Vector<Integer> maxLengthOfColumns = new Vector<Integer>();
		for (int i=0;i<database.get(tableIndex).size();i++) {
			for (int j=0;j<database.get(tableIndex).get(i).size();j++) {
				if (i==0) maxLengthOfColumns.addElement(database.get(tableIndex).get(i).get(j).toString().length());
				else if (database.get(tableIndex).get(i).get(j).toString().length() > maxLengthOfColumns.get(j)) {
					maxLengthOfColumns.setElementAt(database.get(tableIndex).get(i).get(j).toString().length(), j);
				}
			}
			if (i==0) i += 2; //skip second and third rows
		}
        System.out.println("Table Name: " + tableNames.get(tableIndex));
        for (int j=0;j<database.get(tableIndex).size();j++) {
        	if (j != 1 && j != 2) {
		        for (int i=0;i<database.get(tableIndex).get(0).size();i++) {
		        	System.out.print(String.format("%-" + (maxLengthOfColumns.get(i) + 2) + "s", database.get(tableIndex).get(j).get(i)));
		        }
		        System.out.println();
        	}
        }
	    System.out.println();
	}
	
}