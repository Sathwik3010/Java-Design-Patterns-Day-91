package com.codegnan.design.pattern.template;

public class Vollyball extends Game{

	@Override
	protected void initializeGame() {
		System.out.println("Setting up vollyball and teams");
	}

	@Override
	protected void startGame() {
		System.out.println("Starting the vollyball match servee to begin");
	}

	@Override
	protected void playGame() {
		System.out.println("Playing vollyball");
	}

	@Override
	protected void endGame() {
		System.out.println("Game is Over team with most points wins");
	}

}
