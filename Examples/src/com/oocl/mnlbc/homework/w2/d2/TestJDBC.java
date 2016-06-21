package com.oocl.mnlbc.homework.w2.d2;

public class TestJDBC {
	
	public static void main(String args[]) {
	    JDBCOperation.getAll();
	    
//	    JDBCOperation.insert(new Student("Achilles", "Male", "14"));
	    JDBCOperation.insert(new Student("001", "Achilles", "Male", "14"));
	    JDBCOperation.insert(new Student("002", "Ana", "Male", "14"));
	    JDBCOperation.insert(new Student("003", "John", "Male", "14"));
	    JDBCOperation.insert(new Student("004", "Bean", "Male", "14"));
	    JDBCOperation.getAll();
	    
//	    JDBCOperation.update(new Student("Bean", "Male", "7"));
	    JDBCOperation.update(new Student("002", "Bean", "Male", "7"));
	    JDBCOperation.getAll();
	    
	    JDBCOperation.delete("Achilles");
	    JDBCOperation.getAll();
	    
	    JDBCOperation.deleteAll();
	    JDBCOperation.getAll();
	}
	

}
