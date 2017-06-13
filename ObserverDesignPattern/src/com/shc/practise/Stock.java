package com.shc.practise;

import java.util.ArrayList;
import java.util.Iterator;

public class Stock implements Observable {

	ArrayList<Observer> arr = new ArrayList<Observer>();
	Mobile mob = new Mobile();
	DisplayBoard tab = new DisplayBoard();
	private String name;
	private int price;

	public String getName() {
		return name;
	}

	public void setName(String stockName) {
		this.name = stockName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int stockPrice) {
		this.price = stockPrice;
	}

	@Override
	public void registerObservers(Observer observer) {
		if (observer != null) {
			this.arr.add(observer);
		}
	}

	@Override
	public void notifyObservers() {
		Iterator<Observer> iter = arr.iterator();
		while (iter.hasNext()) {
			Observer ob = iter.next();
			ob.update(this);
		}
	}

	@Override
	public void removeObserver(Observer observer) {
		if (observer != null) {
			arr.remove(observer);
		}
	}
	
	public void updateStockPrice(int updatedPrice){
		this.price = updatedPrice;
		this.notifyObservers();
	}

}
