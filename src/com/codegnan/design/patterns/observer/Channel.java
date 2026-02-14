package com.codegnan.design.patterns.observer;

import java.util.ArrayList;
import java.util.List;

public class Channel implements Subject{

	private List<Observer> subs = new ArrayList<>();
	private String title;
	@Override
	public void subscribe(Observer ob) {
		subs.add(ob);
	}

	@Override
	public void unSubscribe(Observer ob) {
		subs.remove(ob);
	}

	@Override
	public void notifySubscribers() {
		for(Observer ob:subs) {
			ob.update(title);
		}
	}
	
	public void upload(String title) {
		this.title = title;
		System.out.println("Channel. Updated new Video");
		notifySubscribers();
	}

}
