package com.codegnan.design.pattern.Flyweight;
//extrinsic data unique position
public class Tree {
	private int x;
	private int y;
	private TreeType type;
	
	public Tree(int x, int y, TreeType type) {
		super();
		this.x = x;
		this.y = y;
		this.type = type;
	}
	
	public void draw() {
		type.draw(x, y);
	}
}
