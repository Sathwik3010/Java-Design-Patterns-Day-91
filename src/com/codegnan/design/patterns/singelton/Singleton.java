package com.codegnan.design.patterns.singelton;

public class Singleton {

	private static Singleton instance;

	private Singleton() {
		System.out.println("Initializing the singleton instance");
	}
	
	// public method to provide access to the singleton instane.
	
	public static Singleton getInstance() {
		if(instance == null) {
			instance = new Singleton();
			System.out.println("creating a new Singleton instance");
		}
		return instance;
	}
}
