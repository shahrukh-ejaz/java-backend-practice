package com.shahrukh.constructors4;

public class LibraryBook {
	int bookId;
	String title;
	String author;
	boolean isIssued;
	
	
	LibraryBook() {
		bookId=0;
		title="untitled";
		author="Unknown";
		isIssued= false;
		
	}
		
	LibraryBook(int bookId, String title, String author){
			this.bookId=bookId;
			this.title=title;
			this.author=author;
			this.isIssued=false;
		}
	
	
	void issueBook() {
		if(isIssued==false) {
			isIssued=true;
			System.out.println("Book issued succesfully");
		}else {
			System.out.println("Book is already issued");
		}
	}
		void displayBook() {
	        System.out.println("Book ID: " + bookId);
	        System.out.println("Title: " + title);
	        System.out.println("Author: " + author);
	        System.out.println("Issued: " + isIssued);
	        System.out.println("--------------------");
	}
	

}
