package com.codegnan.design.patterns.singelton;

public class SingletonTest {
	public static void main(String[] args) {
		Singleton instance1 = Singleton.getInstance();
		Singleton instance2 = Singleton.getInstance();
		if(instance1 == instance2) {
			System.out.println("Both instances are same");
		} else {
			System.out.println("Both instance are different");
		}

	}
}
