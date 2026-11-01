package com.shahrukh.constructors1;

public class EmployeeDriver {
	public static void main(String[] args) {
		Employee e1 = new Employee();
		
		Employee e2 = new Employee(101, "Rahul");
		
		Employee e3 = new Employee(102, "Aman", 3500);
		
		
		e1.displayName();
		e2.displayName();
		e3.displayName();
	}

}
