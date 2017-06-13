package design.pattern;

import java.util.ArrayList;
import java.util.List;

public class Product implements Subject {

	private List<Observer> listOfObservers = new ArrayList<Observer>();
	private String productName;
	private boolean isavailable;

	public List<Observer> getListOfObservers() {
		return listOfObservers;
	}

	public void setListOfObservers(List<Observer> listOfObservers) {
		this.listOfObservers = listOfObservers;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public boolean isIsavailable() {
		return isavailable;
	}

	public void setIsavailable(boolean isavailable) {
		this.isavailable = isavailable;
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
		if (isavailable) {
			for (Observer ob : listOfObservers) {
				ob.update(productName);
			}
		}
	}

}
