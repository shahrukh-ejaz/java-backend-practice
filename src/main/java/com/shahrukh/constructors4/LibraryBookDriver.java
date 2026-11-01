package com.shahrukh.constructors4;

public class LibraryBookDriver {
	public static void main(String[] args) {
		
		LibraryBook b1 = new LibraryBook();
		
		LibraryBook b2 = new LibraryBook(101, "Core", "james Gosling");
		
		b1.displayBook();
		b2.displayBook();
		
		b2.issueBook();
		b2.issueBook();
		
		b2.displayBook();
	}

}
