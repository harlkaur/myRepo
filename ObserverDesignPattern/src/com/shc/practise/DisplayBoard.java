package com.shc.practise;


public class DisplayBoard implements Observer{


	@Override
	public void update(Stock stock) {
		System.out
		.println("The name of displayBoard has changed" + " " + stock.getName() + "changed price" + " " + stock.getPrice());		
	}

}
