package com.codegnan.design.pattern.template;

public class GameTemplateExample {

	public static void main(String[] args) {
		Game cricket = new Cricket();
			cricket.play();
		Game vollyball = new Vollyball();
		vollyball.play();
	}

}
