package com.design.pattern;

import java.util.ArrayList;
import java.util.List;

public class Product implements Subject {

	private String productName;
	private List<Observer> listOfObservers = new ArrayList<Observer>();
	private boolean available;

	public boolean isAvailable() {
		return available;
	}

	public void setAvailable(boolean available) {
		this.available = available;
		if(available == true){
			notifyObserver();
		}
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public List<Observer> getListOfObservers() {
		return listOfObservers;
	}

	public void setListOfObservers(List<Observer> listOfObservers) {
		this.listOfObservers = listOfObservers;
	}

	@Override
	public void registerObserver(Observer observer) {
		listOfObservers.add(observer);
	}

	@Override
	public void removeObserver(Observer observer) {
		listOfObservers.remove(observer);
	}

	@Override
	public void notifyObserver() {
		System.out.println("notifying all observers when product becomes available ");
		if (available) {
			for (Observer ob : listOfObservers) {
				ob.update(productName);
			}
		}
	}

}
