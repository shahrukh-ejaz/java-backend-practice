package com.shahrukh.constructors;

public class Student {
	int rollNo;
	String name;
	double marks;
	
	Student(){
		rollNo=0;
		name="Not Assigned";
		marks=0.0;
	}

	public Student(int rollNo, String name, double marks) {
		this.rollNo = rollNo;
		this.name = name;
		this.marks = marks;
	}
	
	Student(int rollNo, String name){
		this(rollNo, name,0.0);
	}
	
	Student(String name){
		this(0, name,0.0);
	}
	
	void checkResult() {
		if(marks >=40) {
			System.out.println("Result Pass");
			
		}else {
			System.out.println("Result Fail");
		}
	}
	
	void displayStudent() {
		System.out.println("Roll No: "+ rollNo);
		System.out.println("Name: "+ name);
		System.out.println("Marks: "+ marks);
		
		System.out.println("---------");
	}

}
