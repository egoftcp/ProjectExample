import java.util.*;

public class AntlrDMLListener extends DMLBaseListener {

	@Override
    public void enterCreatecmd(DMLParser.CreatecmdContext ctx) {
    	DMLParser.RelationnameContext tableName = ctx.relationname();
    	DMLParser.TypedattributelistContext typedAttributeList = ctx.typedattributelist();
    	DMLParser.AttributelistContext attributeList = ctx.attributelist();
    	
    	List<DMLParser.AttributenameContext> attributeNames = typedAttributeList.attributename();
    	List<DMLParser.TypeContext> attributeTypes = typedAttributeList.type();
    	Vector<Object> attributeNamesFinal = new Vector<Object>();
    	Vector<String> typesFinal = new Vector<String>();
    	
    	for (int i=0;i<attributeNames.size();i++) {
    		attributeNamesFinal.add(attributeNames.get(i).getText());
    		typesFinal.add(attributeTypes.get(i).getText());
    	}
    	
    	List<DMLParser.AttributenameContext> primaryKeys = attributeList.attributename();
    	Vector<String> primaryKeysFinal = new Vector<String>();
    	
    	for(int i=0;i<primaryKeys.size();i++) {
    		primaryKeysFinal.add(primaryKeys.get(i).getText());
    	}
    	
    	Database.createTable(tableName.getText(),attributeNamesFinal,typesFinal,primaryKeysFinal);
    	
    }
	
	@Override
	public void enterUpdatecmd(DMLParser.UpdatecmdContext ctx) {

		String tableName = ctx.relationname().getText();
		List<DMLParser.AttributenameContext> attrNames = ctx.attributename();
		List<DMLParser.LiteralContext> literals = ctx.literal();
		List<DMLParser.ConjunctionContext> conjunctions = ctx.condition().conjunction();
		handleConjunctions(attrNames,literals,conjunctions,tableName);

		
	}
	public void handleConjunctions(List<DMLParser.AttributenameContext>attrNames, List<DMLParser.LiteralContext> literals, List<DMLParser.ConjunctionContext> conjunctions, String tableName) {
		
		for (int i=0;i<conjunctions.size();i++) {
			compareForUpdate(conjunctions.get(i).comparison(),attrNames,literals,tableName);
		}
	}
	
	public void compareForUpdate(List<DMLParser.ComparisonContext> comparisons, List<DMLParser.AttributenameContext> attrNames, List<DMLParser.LiteralContext> literals, String tableName) {
		String operator;
		int tableIndex = Database.tableNames.indexOf(tableName);
		
		Vector<Vector<Object>> fullTable = Database.database.get(tableIndex);
		Vector<Vector<Vector<Object>>> foundRowsTables = new Vector<Vector<Vector<Object>>>();
		Vector<Vector<Integer>> rowsToChange = new Vector<Vector<Integer>>();
		
		int columnIndex;
		for (int i=0;i<comparisons.size();i++) {
			columnIndex = fullTable.get(0).indexOf(comparisons.get(i).getChild(0).getText());
			operator = comparisons.get(i).getChild(1).getText();
			switch (operator) {
				case "==":
					for (int j=3;j<fullTable.size();j++) {
						if (fullTable.get(1).get(columnIndex).equals("String")) {
							if (fullTable.get(j).get(columnIndex).equals(comparisons.get(i).getChild(2).getText())) {
								rowsToChange.addElement(new Vector<Integer>());
								foundRowsTables.addElement(new Vector<Vector<Object>>());
								rowsToChange.get(i).addElement(j);
								foundRowsTables.get(i).addElement(fullTable.get(j));
							}
						} else {
							if ((Integer)fullTable.get(j).get(columnIndex) == Integer.parseInt(comparisons.get(i).getChild(2).getText())) {
								rowsToChange.addElement(new Vector<Integer>());
								foundRowsTables.addElement(new Vector<Vector<Object>>());
								rowsToChange.get(i).addElement(j);
								foundRowsTables.get(i).addElement(fullTable.get(j));
							}
						}
					}
					break;
				case "!=":
					for (int j=3;j<fullTable.size();j++) {
						if (fullTable.get(1).get(columnIndex).equals("String")) {
							if (!fullTable.get(j).get(columnIndex).equals(comparisons.get(i).getChild(2).getText())) {
								rowsToChange.addElement(new Vector<Integer>());
								foundRowsTables.addElement(new Vector<Vector<Object>>());
								rowsToChange.get(i).addElement(j);
								foundRowsTables.get(i).addElement(fullTable.get(j));
							}
						} else {
							if ((Integer)fullTable.get(j).get(columnIndex) != Integer.parseInt(comparisons.get(i).getChild(2).getText())) {
								rowsToChange.addElement(new Vector<Integer>());
								foundRowsTables.addElement(new Vector<Vector<Object>>());
								rowsToChange.get(i).addElement(j);
								foundRowsTables.get(i).addElement(fullTable.get(j));
							}
						}
					}
					break;
					
				case "<":
					for (int j=3;j<fullTable.size();j++) {
						if (fullTable.get(1).get(columnIndex).equals("String")) {
							System.out.println("You cannot use the < operator on Strings");
						} else {
							if ((Integer)fullTable.get(j).get(columnIndex) < Integer.parseInt(comparisons.get(i).getChild(2).getText())) {
								rowsToChange.addElement(new Vector<Integer>());
								foundRowsTables.addElement(new Vector<Vector<Object>>());
								rowsToChange.get(i).addElement(j);
								foundRowsTables.get(i).addElement(fullTable.get(j));
							}
						}
					}
					break;
				case ">":
					for (int j=3;j<fullTable.size();j++) {
						if (fullTable.get(1).get(columnIndex).equals("String")) {
							System.out.println("You cannot use the > operator on Strings");
						} else {
							if ((Integer)fullTable.get(j).get(columnIndex) > Integer.parseInt(comparisons.get(i).getChild(2).getText())) {
								rowsToChange.addElement(new Vector<Integer>());
								foundRowsTables.addElement(new Vector<Vector<Object>>());
								rowsToChange.get(i).addElement(j);
								foundRowsTables.get(i).addElement(fullTable.get(j));
							}
						}
					}
					break;
				case "<=":
					for (int j=3;j<fullTable.size();j++) {
						if (fullTable.get(1).get(columnIndex).equals("String")) {
							System.out.println("You cannot use the <= operator on Strings");
						} else {
							if ((Integer)fullTable.get(j).get(columnIndex) <= Integer.parseInt(comparisons.get(i).getChild(2).getText())) {
								rowsToChange.addElement(new Vector<Integer>());
								foundRowsTables.addElement(new Vector<Vector<Object>>());
								rowsToChange.get(i).addElement(j);
								foundRowsTables.get(i).addElement(fullTable.get(j));
							}
						}
					}
					break;
				case ">=":
					for (int j=3;j<fullTable.size();j++) {
						if (fullTable.get(1).get(columnIndex).equals("String")) {
							System.out.println("You cannot use the >= operator on Strings");
						} else {
							if ((Integer)fullTable.get(j).get(columnIndex) >= Integer.parseInt(comparisons.get(i).getChild(2).getText())) {
								rowsToChange.addElement(new Vector<Integer>());
								foundRowsTables.addElement(new Vector<Vector<Object>>());
								rowsToChange.get(i).addElement(j);
								foundRowsTables.get(i).addElement(fullTable.get(j));
							}
						}
					}
					break;
				default:
					break;
			}
		}
		
		for (int i=1;i<rowsToChange.size();i++) {
			if (!rowsToChange.get(i).isEmpty()) rowsToChange.get(0).retainAll(rowsToChange.get(i));
		}

		int finalColumnIndex;
		for (int i=0;i<attrNames.size();i++) {
			if (rowsToChange.size()>0) {
				finalColumnIndex = Database.database.get(tableIndex).get(0).indexOf(attrNames.get(i).getText());
				for (int j=0;j<rowsToChange.get(0).size();j++) {
					Database.database.get(tableIndex).get(rowsToChange.get(0).get(j)).removeElementAt(finalColumnIndex);
					if (isInteger(literals.get(i).getText())) {
						Database.database.get(tableIndex).get(rowsToChange.get(0).get(j)).add(finalColumnIndex,Integer.parseInt(literals.get(i).getText()));
					}
					else {
						Database.database.get(tableIndex).get(rowsToChange.get(0).get(j)).add(finalColumnIndex,literals.get(i).getText());
					}
				}
			}
		}
	}
 
	@Override
	public void enterExitcmd(DMLParser.ExitcmdContext ctx) {
		Main.running = false;
	}
	//Command function for Open
	@Override
	public void enterOpencmd(DMLParser.OpencmdContext ctx) {
		DMLParser.RelationnameContext tableName = ctx.relationname();
		String str = tableName.getText();
		Database.OpenTable(str);
	}
	//Command function for Write
	@Override
	public void enterWritecmd(DMLParser.WritecmdContext ctx) {
		DMLParser.RelationnameContext tableName = ctx.relationname();
		String str = tableName.getText();
		Database.WriteTable(str);
	}
	//Command function for Close
	@Override
	public void enterClosecmd(DMLParser.ClosecmdContext ctx) {
		DMLParser.RelationnameContext tableName = ctx.relationname();
		String str = tableName.getText();
		Database.CloseTable(str);
	}
	
	@Override
	public void enterShowcmd(DMLParser.ShowcmdContext ctx) {
		DMLParser.AtomicexprContext aectx = ctx.atomicexpr();
		if (aectx.getChild(0).getText().equals("(")) {
			Database.database.addElement(exprHandler(aectx.expr()));
			Random rand = new Random();
			Integer value = rand.nextInt(100);
			String tempName = "temp" + value.toString();
			Database.tableNames.addElement(tempName);
			Database.ShowTable(tempName);
		}
		else {
			DMLParser.RelationnameContext tableName = aectx.relationname();
			String str = tableName.getText();
			Database.ShowTable(str);
		}
	}
	
	@Override
	public void enterDeletecmd(DMLParser.DeletecmdContext ctx) {
		String tableName = ctx.relationname().getText();
		List<DMLParser.ConjunctionContext> conjunctions = ctx.condition().conjunction();
		handleConjunctionsForDelete(conjunctions,tableName);
		System.out.println("Deleting rows from " + tableName + "...");

	}
	
	public void handleConjunctionsForDelete(List<DMLParser.ConjunctionContext> conjunctions, String tableName) {
		for (int i=0;i<conjunctions.size();i++) {
			compareForDelete(conjunctions.get(i).comparison(),tableName);
		}
	}
	
	public void compareForDelete(List<DMLParser.ComparisonContext> comparisons, String tableName) {
		String operator;
		int tableIndex = Database.tableNames.indexOf(tableName);
		Vector<Vector<Object>> fullTable = Database.database.get(tableIndex);
		Vector<Vector<Vector<Object>>> foundRowsTables = new Vector<Vector<Vector<Object>>>();
		Vector<Vector<Integer>> rowsToChange = new Vector<Vector<Integer>>();
		
		int columnIndex;
		
		for (int i=0;i<comparisons.size();i++) {
			columnIndex = fullTable.get(0).indexOf(comparisons.get(i).getChild(0).getText());
			operator = comparisons.get(i).getChild(1).getText();
			switch (operator) {
				case "==":
					for (int j=3;j<fullTable.size();j++) {
						if (fullTable.get(1).get(columnIndex).equals("String")) {
							if (fullTable.get(j).get(columnIndex).equals(comparisons.get(i).getChild(2).getText())) {
								rowsToChange.addElement(new Vector<Integer>());
								foundRowsTables.addElement(new Vector<Vector<Object>>());
								rowsToChange.get(i).addElement(j);
								foundRowsTables.get(i).addElement(fullTable.get(j));
							}
						} else {
							if ((Integer)fullTable.get(j).get(columnIndex) == Integer.parseInt(comparisons.get(i).getChild(2).getText())) {
								rowsToChange.addElement(new Vector<Integer>());
								foundRowsTables.addElement(new Vector<Vector<Object>>());
								rowsToChange.get(i).addElement(j);
								foundRowsTables.get(i).addElement(fullTable.get(j));
							}
						}
					}
					break;
				case "!=":
					for (int j=3;j<fullTable.size();j++) {
						if (fullTable.get(1).get(columnIndex).equals("String")) {
							if (!fullTable.get(j).get(columnIndex).equals(comparisons.get(i).getChild(2).getText())) {
								rowsToChange.addElement(new Vector<Integer>());
								foundRowsTables.addElement(new Vector<Vector<Object>>());
								rowsToChange.get(i).addElement(j);
								foundRowsTables.get(i).addElement(fullTable.get(j));
							}
						} else {
							if ((Integer)fullTable.get(j).get(columnIndex) != Integer.parseInt(comparisons.get(i).getChild(2).getText())) {
								rowsToChange.addElement(new Vector<Integer>());
								foundRowsTables.addElement(new Vector<Vector<Object>>());
								rowsToChange.get(i).addElement(j);
								foundRowsTables.get(i).addElement(fullTable.get(j));
							}
						}
					}
					break;
					
				case "<":
					for (int j=3;j<fullTable.size();j++) {
						if (fullTable.get(1).get(columnIndex).equals("String")) {
							System.out.println("You cannot use the < operator on Strings");
						} else {
							if ((Integer)fullTable.get(j).get(columnIndex) < Integer.parseInt(comparisons.get(i).getChild(2).getText())) {
								rowsToChange.addElement(new Vector<Integer>());
								foundRowsTables.addElement(new Vector<Vector<Object>>());
								rowsToChange.get(i).addElement(j);
								foundRowsTables.get(i).addElement(fullTable.get(j));
							}
						}
					}
					break;
				case ">":
					for (int j=3;j<fullTable.size();j++) {
						if (fullTable.get(1).get(columnIndex).equals("String")) {
							System.out.println("You cannot use the > operator on Strings");
						} else {
							if ((Integer)fullTable.get(j).get(columnIndex) > Integer.parseInt(comparisons.get(i).getChild(2).getText())) {
								rowsToChange.addElement(new Vector<Integer>());
								foundRowsTables.addElement(new Vector<Vector<Object>>());
								rowsToChange.get(i).addElement(j);
								foundRowsTables.get(i).addElement(fullTable.get(j));
							}
						}
					}
					break;
				case "<=":
					for (int j=3;j<fullTable.size();j++) {
						if (fullTable.get(1).get(columnIndex).equals("String")) {
							System.out.println("You cannot use the <= operator on Strings");
						} else {
							if ((Integer)fullTable.get(j).get(columnIndex) <= Integer.parseInt(comparisons.get(i).getChild(2).getText())) {
								rowsToChange.addElement(new Vector<Integer>());
								foundRowsTables.addElement(new Vector<Vector<Object>>());
								rowsToChange.get(i).addElement(j);
								foundRowsTables.get(i).addElement(fullTable.get(j));
							}
						}
					}
					break;
				case ">=":
					for (int j=3;j<fullTable.size();j++) {
						if (fullTable.get(1).get(columnIndex).equals("String")) {
							System.out.println("You cannot use the >= operator on Strings");
						} else {
							if ((Integer)fullTable.get(j).get(columnIndex) >= Integer.parseInt(comparisons.get(i).getChild(2).getText())) {
								rowsToChange.addElement(new Vector<Integer>());
								foundRowsTables.addElement(new Vector<Vector<Object>>());
								rowsToChange.get(i).addElement(j);
								foundRowsTables.get(i).addElement(fullTable.get(j));
							}
						}
					}
					break;
				default:
					break;
			}
		}
		for (int i=1;i<rowsToChange.size();i++) {
			if (!rowsToChange.get(i).isEmpty()) rowsToChange.get(0).retainAll(rowsToChange.get(i));
		}
		
		if (!rowsToChange.isEmpty()) {
			for (int j=0;j<rowsToChange.get(0).size();j++) {
				Database.database.get(tableIndex).removeElementAt(rowsToChange.get(0).get(j));
				if (j+1 != rowsToChange.get(0).size()) rowsToChange.get(0).setElementAt(rowsToChange.get(0).elementAt(j+1) - 1, j+1);
			}
		}
	}
	
	
	@Override
	public void enterInsertcmd(DMLParser.InsertcmdContext ctx) {
		DMLParser.RelationnameContext tableNameCtx = ctx.relationname();
		String tableName = tableNameCtx.getText();
		
		String s = ctx.getText();
		if(s.contains("RELATION")) { // VALUES FROM RELATION
			DMLParser.ExprContext exp = ctx.expr();
			Vector<Vector<Object>> table = exprHandler(exp);
			
			Database.insertIntoFromRelation(tableName, table);
		}
		else { // VALUES FROM
			List<DMLParser.LiteralContext> literalsCtx = ctx.literal();
			Vector<Object> literals = new Vector<Object>();
			for(int i = 0; i < literalsCtx.size(); i++) {
				String literal = literalsCtx.get(i).getText();
				
				//check to see if literal is a String or Integer, input correct type
				if (isInteger(literal)) {
					literals.add(Integer.parseInt(literal));
				} else {
					literals.add(literal);
				}
			}
			Database.insertInto(tableName, literals);
		}
	}
	
	public void enterQuery(DMLParser.QueryContext ctx) {
		DMLParser.RelationnameContext tableNameCtx = ctx.relationname();
		String tableName = tableNameCtx.getText();
		int tableIndex = Database.tableNames.indexOf(tableName);
		
		if (tableIndex == -1) {
			Database.tableNames.addElement(tableName);
			
			System.out.println("Storing values from query in new table " + tableName);
			
			DMLParser.ExprContext exp = ctx.expr();
			Database.database.addElement(exprHandler(exp));
		} else {			
			System.out.println("Storing values from query in existing table " + tableName);
			
			DMLParser.ExprContext exp = ctx.expr();
			Vector<Vector<Object>> tempTable = exprHandler(exp);
			Database.database.remove(tableIndex);
			Database.database.add(tableIndex,tempTable);
		}
	}
	
	
	public Vector<Vector<Object>> exprHandler(DMLParser.ExprContext ctx){
		String exp = ctx.getChild(0).getChild(0).getText();
		int index = Database.tableNames.indexOf(exp);
		if (ctx.getChild(0).getChildCount() < 2 && index != -1) return Database.database.get(index);
		
		switch(exp){
		case "project":
			return projection(ctx);
		case "rename":
			return renaming(ctx);
		case "select":
			return selection(ctx);
		default:
			exp = ctx.getChild(0).getChild(1).getText();
			switch(exp) {
			case "+":
				return union(ctx);
			case "-":
				return difference(ctx);
			case "*":
				return product(ctx);
			case "&":
				return natural_join(ctx);
			default:
				return Database.tempExprTable;
			}
		}
	}
	
	public Vector<Vector<Object>> projection (DMLParser.ExprContext ctx) {
		DMLParser.ProjectionContext pctx = ctx.projection();
		DMLParser.AttributelistContext atListCtx = pctx.attributelist();
		
		List<DMLParser.AttributenameContext> list = atListCtx.attributename();
		Vector<String> attrNames = new Vector<String>();
		for (int i=0;i<list.size();i++) {
			attrNames.add(list.get(i).getText());
		}
		
		Vector<Vector<Object>> projectingTable = new Vector<Vector<Object>>();
		
		DMLParser.AtomicexprContext aectx = pctx.atomicexpr();
		
		//check to see if the atomicexpr holds an expr or relationname
		if (aectx.getChildCount() > 2) {
			DMLParser.ExprContext ectx = aectx.expr();
			projectingTable = exprHandler(ectx);
		}
		else {
			DMLParser.RelationnameContext rctx = aectx.relationname();
			int index = Database.tableNames.indexOf(rctx.getText());
			projectingTable = Database.database.get(index);
		}
		
		//DO PROJECTION then return
		Vector<Vector<Object>> projectedTable = new Vector<Vector<Object>>();
		Vector<Integer> projectingColumns = new Vector<Integer>();
		for (int i=0;i<projectingTable.get(0).size();i++) {
			if (attrNames.contains(projectingTable.get(0).get(i))) projectingColumns.addElement(i);
		}
		for (int i=0;i<projectingTable.size();i++) {
			projectedTable.addElement(new Vector<Object>());
			for (int j=0;j<projectingTable.get(0).size();j++) {
				if (projectingColumns.contains(j)) {
					projectedTable.get(i).addElement(projectingTable.get(i).get(j));
				}
			}
		}
		return projectedTable;
		
	}
	public Vector<Vector<Object>> renaming(DMLParser.ExprContext ctx){
		DMLParser.RenamingContext rctx = ctx.renaming();
		DMLParser.AttributelistContext atListCtx = rctx.attributelist();
		
		List<DMLParser.AttributenameContext> list = atListCtx.attributename();
		Vector<String> attrNames = new Vector<String>();
		for (int i=0;i<list.size();i++) {
			attrNames.add(list.get(i).getText());
		}
		
		Vector<Vector<Object>> renamingTable = new Vector<Vector<Object>>();		
		DMLParser.AtomicexprContext aectx = rctx.atomicexpr();
		
		//check to see if the atomicexpr holds an expr or relationname
		if (aectx.getChildCount() > 2) {
			DMLParser.ExprContext ectx = aectx.expr();
			renamingTable = exprHandler(ectx);
		}
		else {
			DMLParser.RelationnameContext rnctx = aectx.relationname();
			int index = Database.tableNames.indexOf(rnctx.getText());
			renamingTable = Database.database.get(index);
		}
		
		//DO RENAMING then return
		Vector<Vector<Object>> renamedTable = new Vector<Vector<Object>>();
		renamedTable.addElement(new Vector<Object>());
		//add renamed attributes row
		for (int i=0;i<attrNames.size();i++) {
			renamedTable.get(0).addElement(attrNames.get(i));
		}
		//copy the rest of the rows
		for (int i=1;i<renamingTable.size();i++) {
			renamedTable.addElement(new Vector<Object>());
			for (int j=0;j<renamingTable.get(0).size();j++) {
				renamedTable.get(i).addElement(renamingTable.get(i).get(j));
			}
		}

		return renamedTable;	
	}
	
	public Vector<Vector<Object>> selection(DMLParser.ExprContext ctx){
		DMLParser.SelectionContext sctx = ctx.selection();
		
		Vector<Vector<Object>> selectingTable = new Vector<Vector<Object>>();		
		DMLParser.AtomicexprContext aectx = sctx.atomicexpr();
		
		//check to see if the atomicexpr holds an expr or relationname
		if (aectx.getChildCount() > 2) {
			DMLParser.ExprContext ectx = aectx.expr();
			selectingTable = exprHandler(ectx);
		}
		else {
			DMLParser.RelationnameContext rnctx = aectx.relationname();
			int index = Database.tableNames.indexOf(rnctx.getText());
			selectingTable = Database.database.get(index);
		}
		
		DMLParser.ConditionContext cdctx = sctx.condition();
		List<DMLParser.ConjunctionContext> conjunctions = cdctx.conjunction();
		Vector<Vector<Vector<Object>>> comparisons = new Vector<Vector<Vector<Object>>>();
		
		Vector<Vector<Object>> selectedTable = new Vector<Vector<Object>>();
		
		for (int i=0;i<conjunctions.size();i++) {
			comparisons.addElement(comparison(conjunctions.get(i).comparison(),selectingTable,selectedTable));
		}
		for (int i=0;i<comparisons.size();i++) {
			if (i==0) {
				for (int j=0;j<comparisons.get(i).size();j++) {
					selectedTable.addElement(comparisons.get(i).get(j));
				}
			}
			else {
				for (int j=3;j<comparisons.get(i).size();j++) {
					selectedTable.addElement(comparisons.get(i).get(j));
				}
			}
		}
		
		return selectedTable;
	}
	
	public Vector<Vector<Object>> union(DMLParser.ExprContext ctx){
		DMLParser.UnionContext uctx = ctx.union();
		// creating the two union tables which will store information from each table
		Vector<Vector<Object>> unioningTable1 = new Vector<Vector<Object>>();
		Vector<Vector<Object>> unioningTable2 = new Vector<Vector<Object>>();
		Vector<Vector<Object>> unionedTable = new Vector<Vector<Object>>();
		// get first thing and second thing of the list of atomic expressions
		DMLParser.AtomicexprContext aectx1 = uctx.atomicexpr().get(0);
		DMLParser.AtomicexprContext aectx2 = uctx.atomicexpr().get(1);
		// check each of the atomic expressions holds an expression or relation name
		if (aectx1.getChildCount() > 2) {
			DMLParser.ExprContext ectx1 = aectx1.expr();
			unioningTable1 = exprHandler(ectx1);
		}
		else {
			DMLParser.RelationnameContext rnctx1 = aectx1.relationname();
			int index1 = Database.tableNames.indexOf(rnctx1.getText());
			unioningTable1 = Database.database.get(index1);
		}
		
		if (aectx2.getChildCount() > 2) {
			DMLParser.ExprContext ectx2 = aectx2.expr();
			unioningTable2 = exprHandler(ectx2);
		}
		else {
			DMLParser.RelationnameContext rnctx2 = aectx2.relationname();
			int index2 = Database.tableNames.indexOf(rnctx2.getText());
			unioningTable2 = Database.database.get(index2);
		}
			
		for(int i=0; i<unioningTable1.size();i++){
			unionedTable.addElement(unioningTable1.get(i));
		}
		
		for (int j=3;j<unioningTable2.size();j++) {
			if (!unionedTable.contains(unioningTable2.get(j))) {
				unionedTable.addElement(unioningTable2.get(j));
			}
		}
		
		return unionedTable;
	}
	
	public Vector<Vector<Object>> difference(DMLParser.ExprContext ctx){
		DMLParser.DifferenceContext dctx = ctx.difference();
		
		Vector<Vector<Object>> operand1_table = new Vector<Vector<Object>>();
		Vector<Vector<Object>> operand2_table = new Vector<Vector<Object>>();
		DMLParser.AtomicexprContext aectx1 = dctx.atomicexpr(0);
		DMLParser.AtomicexprContext aectx2 = dctx.atomicexpr(1);
		
		//check to see if the atomicexpr holds an expr or relationname
		if (aectx1.getChildCount() > 2) {
			DMLParser.ExprContext ectx = aectx1.expr();
			operand1_table = exprHandler(ectx);
		}
		else {
			DMLParser.RelationnameContext rnctx = aectx1.relationname();
			int index = Database.tableNames.indexOf(rnctx.getText());
			operand1_table = Database.database.get(index);
		}
		
		if (aectx2.getChildCount() > 2) {
			DMLParser.ExprContext ectx = aectx2.expr();
			operand2_table = exprHandler(ectx);
		}
		else {
			DMLParser.RelationnameContext rnctx = aectx2.relationname();
			int index = Database.tableNames.indexOf(rnctx.getText());
			operand2_table = Database.database.get(index);
		}
		
		for(int i = 3; i < operand1_table.size(); i++){
			if(operand2_table.contains(operand1_table.get(i))){
				operand1_table.remove(i);
				i--;
			}
		}
		
		return operand1_table;
	}
	public Vector<Vector<Object>> natural_join(DMLParser.ExprContext ctx){
		DMLParser.NaturaljoinContext njctx = ctx.naturaljoin();
		
		Vector<Vector<Object>> natjoin1_table = new Vector<Vector<Object>>();
		Vector<Vector<Object>> natjoin2_table = new Vector<Vector<Object>>();
		DMLParser.AtomicexprContext aectx1 = njctx.atomicexpr(0);
		DMLParser.AtomicexprContext aectx2 = njctx.atomicexpr(1);
		if (aectx1.getChildCount() > 2) {
			DMLParser.ExprContext ectx = aectx1.expr();
			natjoin1_table = exprHandler(ectx);
		}
		else {
			DMLParser.RelationnameContext rnctx = aectx1.relationname();
			int index = Database.tableNames.indexOf(rnctx.getText());
			natjoin1_table = Database.database.get(index);
		}
		
		if (aectx2.getChildCount() > 2) {
			DMLParser.ExprContext ectx = aectx2.expr();
			natjoin2_table = exprHandler(ectx);
		}
		else {
			DMLParser.RelationnameContext rnctx = aectx2.relationname();
			int index = Database.tableNames.indexOf(rnctx.getText());
			natjoin2_table = Database.database.get(index);
		}
		
		Vector<Vector<Object>> natjoin_final = new Vector<Vector<Object>>();
		//First two for-loops and if-statement go through the first rows of first table and find the first one that matches
		for(int i = 0; i < natjoin1_table.get(0).size(); i++){
			for(int j = 0; j < natjoin2_table.get(0).size(); j++){
				if(natjoin1_table.get(0).elementAt(i).equals(natjoin2_table.get(0).elementAt(j))){

					//The next two for-loops and if statement go though each row of each table and if the element in the column found by the first two for loops matches,
					//add the elements in the second list to the first
					for(int k = 0; k < natjoin1_table.size(); k++){
						for(int l = 0; l < natjoin2_table.size(); l++){
							if(natjoin1_table.get(k).elementAt(i).equals(natjoin2_table.get(l).elementAt(j))){
								natjoin_final.addElement(natjoin1_table.get(k));
								natjoin_final.get(natjoin_final.size()-1).addAll(natjoin2_table.get(l));
								l = natjoin2_table.size();
							}
						}
					}
					//we have already attached all lists from table 2 to 1 at the proper place, we want out of the for loops
					j = natjoin2_table.get(0).size();
					i = natjoin1_table.get(0).size();
				}
			}
		}
		
		//moves through the list and, when a replicate column is found, it is removed
		//Vector<Object> no_duplicate_list = new Vector<Object>();
		int size = natjoin_final.get(0).size();
		boolean deleted = false;
		for(int i = 0; i < size; i++){
			for(int j = i+1; j < size; j++){
				if(natjoin_final.get(0).elementAt(i).equals(natjoin_final.get(0).elementAt(j))){
					for(int k = 0; k < natjoin_final.size(); k++){
						natjoin_final.get(k).remove(j);
						deleted = true;
					}
					if (deleted) size--;
					deleted = false;
				}
			}
		}	
	
		return natjoin_final;
	}
	
	
	public Vector<Vector<Object>> product(DMLParser.ExprContext ctx){
		
		DMLParser.ProductContext pctx = ctx.product();
		
		Vector<Vector<Object>> operand1_table = new Vector<Vector<Object>>();
		Vector<Vector<Object>> operand2_table = new Vector<Vector<Object>>();
		DMLParser.AtomicexprContext aectx1 = pctx.atomicexpr(0);
		DMLParser.AtomicexprContext aectx2 = pctx.atomicexpr(1);
		
		//check to see if the atomicexpr holds an expr or relationname
		if (aectx1.getChildCount() > 2) {
			DMLParser.ExprContext ectx = aectx1.expr();
			operand1_table = exprHandler(ectx);
		}
		else {
			DMLParser.RelationnameContext rnctx = aectx1.relationname();
			int index = Database.tableNames.indexOf(rnctx.getText());
			operand1_table = Database.database.get(index);
		}
		
		if (aectx2.getChildCount() > 2) {
			DMLParser.ExprContext ectx = aectx2.expr();
			operand2_table = exprHandler(ectx);
		}
		else {
			DMLParser.RelationnameContext rnctx = aectx2.relationname();
			int index = Database.tableNames.indexOf(rnctx.getText());
			operand2_table = Database.database.get(index);
		}
		
		Vector<Vector<Object>> product_table = new Vector<Vector<Object>>();
		int index = 0;
		
		while(index <= 2){
			product_table.addElement(new Vector<Object>());
			product_table.get(index).addAll(operand1_table.get(index));
			product_table.get(index).addAll(operand2_table.get(index));
			index++;
			}
		for(int k = 3; k < operand1_table.size(); k++){
			for(int l = 3; l < operand2_table.size(); l++){
				product_table.addElement(new Vector<Object>());
				product_table.get(index).addAll(operand1_table.get(k));
				product_table.get(index).addAll(operand2_table.get(l));
				index++;
			}
		}
		
		return product_table;
	}
	
	public Vector<Vector<Object>> comparison(List<DMLParser.ComparisonContext> list, Vector<Vector<Object>> selectingTable, Vector<Vector<Object>> selectedTable) {
		String operator;
		int columnIndex1,columnIndex2;
		String op1,op2;
		Integer intOp2;
		Vector<Vector<Vector<Object>>> options = new Vector<Vector<Vector<Object>>>();
		
		for (int i=0;i<list.size();i++) {
			options.addElement(new Vector<Vector<Object>>());
			op1 = list.get(i).operand(0).attributename().getText();
			columnIndex1 = selectingTable.get(0).indexOf(op1);

			if (list.get(i).operand(1).literal() == null) {
				op2 = list.get(i).operand(1).attributename().getText();
				columnIndex2 = selectingTable.get(0).indexOf(op2);
			} else {
				op2 = list.get(i).getChild(2).getText();
				columnIndex2 = -1;
			}
			for (int j=0;j<3;j++){
				options.get(i).addElement(selectingTable.get(j));
			}
			operator = list.get(i).getChild(1).getText();
			switch (operator) {
				case "==":
					for (int j=3;j<selectingTable.size();j++) {
						if (columnIndex2 != -1) {
							if (selectingTable.get(j).get(columnIndex1).equals(selectingTable.get(j).get(columnIndex2))) {
								options.get(i).addElement(selectingTable.get(j));
							}
						}
						else {
							if (isInteger(op2)) {
								intOp2 = Integer.parseInt(op2);
								if (selectingTable.get(j).get(columnIndex1) == intOp2) {
									options.get(i).addElement(selectingTable.get(j));
								}
							} else {
								if (selectingTable.get(j).get(columnIndex1).equals(op2)) {
									options.get(i).addElement(selectingTable.get(j));
								}
							}
						}
					}
					break;
				case "!=":
					for (int j=3;j<selectingTable.size();j++) {
						if (columnIndex2 != -1) {
							if (!selectingTable.get(j).get(columnIndex1).equals(selectingTable.get(j).get(columnIndex2))) {
								options.get(i).addElement(selectingTable.get(j));
							}
						}
						else {
							if (isInteger(op2)) {
								intOp2 = Integer.parseInt(op2);
								if (selectingTable.get(j).get(columnIndex1) != intOp2) {
									options.get(i).addElement(selectingTable.get(j));
								}
							} else {
								if (!selectingTable.get(j).get(columnIndex1).equals(op2)) {
									options.get(i).addElement(selectingTable.get(j));
								}
							}
						}
					}
					break;
				case "<":
					for (int j=3;j<selectingTable.size();j++) {
						if (columnIndex2 != -1) {
							if ((Integer)selectingTable.get(j).get(columnIndex1) < (Integer)selectingTable.get(j).get(columnIndex2)) {
								options.get(i).addElement(selectingTable.get(j));
							}
						}
						else {
							if (isInteger(op2)) {
								System.out.println(j);
								intOp2 = Integer.parseInt(op2);
								if ((Integer)selectingTable.get(j).get(columnIndex1) < intOp2) {
									options.get(i).addElement(selectingTable.get(j));
								}
							} else {
								System.out.println("You cannot use the < operator on Strings");
							}
						}
					}
					break;
				case ">":
					for (int j=3;j<selectingTable.size();j++) {
						if (columnIndex2 != -1) {
							if ((Integer)selectingTable.get(j).get(columnIndex1) > (Integer)selectingTable.get(j).get(columnIndex2)) {
								options.get(i).addElement(selectingTable.get(j));
							}
						}
						else {
							if (isInteger(op2)) {
								intOp2 = Integer.parseInt(op2);
								if ((Integer)selectingTable.get(j).get(columnIndex1) > intOp2) {
									options.get(i).addElement(selectingTable.get(j));
								}
							} else {
								System.out.println("You cannot use the > operator on Strings");
							}
						}
					}
					break;
				case "<=":
					for (int j=3;j<selectingTable.size();j++) {
						if (columnIndex2 != -1) {
							if ((Integer)selectingTable.get(j).get(columnIndex1) <= (Integer)selectingTable.get(j).get(columnIndex2)) {
								options.get(i).addElement(selectingTable.get(j));
							}
						}
						else {
							if (isInteger(op2)) {
								intOp2 = Integer.parseInt(op2);
								if ((Integer)selectingTable.get(j).get(columnIndex1) <= intOp2) {
									options.get(i).addElement(selectingTable.get(j));
								}
							} else {
								System.out.println("You cannot use the <= operator on Strings");
							}
						}
					}
					break;
				case ">=":
					for (int j=3;j<selectingTable.size();j++) {
						if (columnIndex2 != -1) {
							if ((Integer)selectingTable.get(j).get(columnIndex1) >= (Integer)selectingTable.get(j).get(columnIndex2)) {
								options.get(i).addElement(selectingTable.get(j));
							}
						}
						else {
							if (isInteger(op2)) {
								intOp2 = Integer.parseInt(op2);
								if ((Integer)selectingTable.get(j).get(columnIndex1) >= intOp2) {
									options.get(i).addElement(selectingTable.get(j));
								}
							} else {
								System.out.println("You cannot use the >= operator on Strings");
							}
						}
					}
					break;
				default:
					break;
			}
		}
		selectedTable = removeNonDuplicates(options);
		return selectedTable;
	}
	
	public boolean isInteger (String str) {
		for (int i=0;i<str.length();i++) {
			if (!Character.isDigit(str.charAt(i))) return false;
		}
		return true;
	}
	
	public Vector<Vector<Object>> removeNonDuplicates (Vector<Vector<Vector<Object>>> vec) {
		Vector<Vector<Object>> duplicates = new Vector<Vector<Object>>();
		int rowCount = 0;
		for (int i=0;i<vec.size();i++) {
			for (int j=0;j<vec.get(i).size();j++) {
				duplicates.addElement(new Vector<Object>());
				for (int k=0;k<vec.get(i).get(j).size();k++) {
					duplicates.get(rowCount).addElement(vec.get(i).get(j).get(k));
				}
				rowCount++;
			}
			
		}
		for (int i=0;i<duplicates.size()-1;i++) {
			for (int j=i+1;j<duplicates.size();j++) {
				if (duplicates.get(i).equals(duplicates.get(j))) duplicates.removeElementAt(j);
			}
		}
		return duplicates;
	}
}
