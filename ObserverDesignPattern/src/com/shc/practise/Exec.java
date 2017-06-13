package com.shc.practise;

public class Exec {

	public static void main(String[] args) {

		//create stocks
		Microsoft micro = new Microsoft();
		Apple apple = new Apple();
		
		//create observers
		Mobile mob = new Mobile();
		DisplayBoard dispBoard = new DisplayBoard();
		
		//registering observers
		micro.registerObservers(mob);
		micro.registerObservers(dispBoard);
		
		apple.registerObservers(mob);
		apple.registerObservers(dispBoard);
		
		//setting some random stock prices
		for(int i=1;i<300;i++){
			micro.updateStockPrice((int)Math.random()*1001+70);
			apple.updateStockPrice((int)Math.random()*1001+70);
		}
		
	}

}
