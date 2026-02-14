package com.codegnan.design.pattern.Flyweight;

//intrinsic data (common properites)
public class TreeType {
	private String name;
	private String color;
	public TreeType(String name, String color) {
		super();
		this.name = name;
		this.color = color;
	}
	
	public void draw(int x, int y) {
		System.out.println("Drawing "+name+
				" tree at(" + x + "," + y + ") with color "+color);
	}
}
