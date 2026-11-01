package com.shahrukh.constructors3;

public class Product {
	int productId;
	String productName;
	double price;
	
	
	Product(int productId, String productName, double price){
		
		if(productId > 0) {
			this.productId = productId;
		}else{
			this.productName = productName;
			
		}
		
		if(productName != null && !productName.trim().isEmpty()) {
			this.productName = productName;
		}else {
			this.productName="Unknown Product";
		}
		
		if(price >= 0) {
			this.price=price;
		}else {
			this.price =0.0;
		}
	}
		
		 void displayProduct() {
		        System.out.println("Product ID: " + productId);
		        System.out.println("Product Name: " + productName);
		        System.out.println("Price: " + price);
		        System.out.println("--------------------");
		
	}

}
