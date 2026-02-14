package com.codegnan.design.patterns.observer;

public class Youtube {
	public static void main(String[] args) {
		Subscriber s1 = new Subscriber("Dev");
		Subscriber s2 = new Subscriber("Sathwik");
		Subscriber s3 = new Subscriber("Ruthwik");

		Channel codegnan = new Channel();
		codegnan.subscribe(s1);
		codegnan.subscribe(s2);
		codegnan.unSubscribe(s3);
		s1.subscribeChannel(codegnan);
		s2.subscribeChannel(codegnan);
		s3.subscribeChannel(codegnan);
		codegnan.upload("Observer design pattern explanation");
	}
}
