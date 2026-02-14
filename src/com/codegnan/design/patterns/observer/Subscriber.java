package com.codegnan.design.patterns.observer;

public class Subscriber implements Observer{

	private String name;
	private Channel channel;
	
	
	public Subscriber(String name) {
		super();
		this.name = name;
	}

	@Override
	public void update(String title) {
		System.out.println("hey "+ name + " new Video " + title);
	}

	@Override
	public void subscribeChannel(Channel channel) {
		this.channel = channel;
	}

}
