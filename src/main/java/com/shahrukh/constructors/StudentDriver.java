package com.shahrukh.constructors;

public class StudentDriver {
	public static void main(String[] args) {
		Student s1 = new Student();
		Student s2 = new Student(101, "Aman", 85.5);
		Student s3 = new Student(102, "Rahul");
		Student s4 = new Student("Shahrukh");
		
		 s1.displayStudent();
		    s2.displayStudent();
		    s3.displayStudent();
		    s4.displayStudent();
		    
		    s1.checkResult();
		    s2.checkResult();
		    s3.checkResult();
		    s4.checkResult();
		
		
	}

}
