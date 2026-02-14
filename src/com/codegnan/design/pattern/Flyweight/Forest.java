package com.codegnan.design.pattern.Flyweight;

import java.util.ArrayList;
import java.util.List;

public class Forest {
	private List<Tree> trees = new ArrayList<>();
	public void plantTree(int x, int y, String name, String color) {
		TreeType type = TreeFactory.getTreeType(name, color);
		trees.add(new Tree(x,y, type));
	}
	
	public void drawForest() {
		for(Tree tree: trees) {
			tree.draw();
		}
	}
}
