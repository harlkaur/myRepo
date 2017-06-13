package com.design.pattern;

public class Exec {

	public static void main(String[] args) {

		Customer cus1 = new Customer();
		Customer cus2 = new Customer();
		
		Product product = new Product();
		
		cus1.setCusName("Harleen");
		cus2.setCusName("Eshleen");
		
		product.setProductName("Macbook");
		

		product.setAvailable(true);
		
		product.registerObserver(cus1);
		product.registerObserver(cus2);
		
		
		product.notifyObserver();
	}

}
