package com.codegnan.design.patterns.observer;

public interface Subject {
	void subscribe(Observer ob);
	
	void unSubscribe(Observer ob);
	
	void notifySubscribers();
}
