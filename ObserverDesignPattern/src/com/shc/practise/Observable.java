package com.shc.practise;

public interface Observable {
	void registerObservers(Observer observer);

	void notifyObservers();

	void removeObserver(Observer observer);
}
