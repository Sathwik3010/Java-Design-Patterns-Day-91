package com.codegnan.design.patterns.observer;

public interface Observer {
	void update(String title);
	
	void subscribeChannel(Channel channel);
}
