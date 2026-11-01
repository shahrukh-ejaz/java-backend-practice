package com.shahrukh.constructors1;

public class Employee {
	int id;
	String name;
	double salary;
	
	Employee(){
		this(0,"Not Assigned", 0.0);
		
	}

	 Employee(int id, String name) {
		this(id, name, 0.0);
		
	}
	 

	  Employee(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	 }
	  
	  void displayName() {
		  System.out.println("Employee ID: "+ id);
		  System.out.println("Employee Name: "+ name);
		  System.out.println("Salary: "+ salary);
		  System.out.println("-----");
	  }
	
	
	

}
