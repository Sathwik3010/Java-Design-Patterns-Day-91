package com.codegnan.design.pattern.Flyweight;

public class FlyweightExample {

	public static void main(String[] args) {
		Forest forest = new Forest();
		forest.plantTree(10, 20, "Neem", "Green");
		forest.plantTree(30, 40, "Neem", "Green");
		forest.plantTree(50, 60, "Mango", "Dark Green");
		forest.plantTree(70, 80, "Neem", "Green");
		forest.drawForest();

	}

}
