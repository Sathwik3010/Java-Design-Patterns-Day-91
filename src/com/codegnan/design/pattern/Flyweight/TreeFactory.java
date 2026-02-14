package com.codegnan.design.pattern.Flyweight;

import java.util.HashMap;
import java.util.Map;

public class TreeFactory {

	private static Map<String, TreeType> treeTypes = new HashMap();
	
	public static TreeType getTreeType(String name, String color) {
		TreeType type = treeTypes.get(name);
		if(type == null) {
			type = new TreeType(name, color);
			treeTypes.put(color, type);
			System.out.println("Created new Tree Type : " + name);
		}
		return type;
	}
}
