package com.shc.practise;

public class Mobile implements Observer {

	@Override
	public void update(Stock stock) {
		System.out
				.println("The name of Mobile has changed" + " " + stock.getName() + "changed price" + " " + stock.getPrice());
	}
}
