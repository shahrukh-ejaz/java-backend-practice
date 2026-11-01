package com.shahrukh.constructors3;

public class ProductDriver {
	public static void main(String[] args) {
		
		Product p1 = new Product(101, "Keyboard", 799.0);
		Product p2 = new Product(-5, "", -100.0);
		Product p3 = new Product(103, "Mouse", 499.0);
		
		
		p1.displayProduct();
		p2.displayProduct();
		p3.displayProduct();
		
	}

}
