package com.codegnan.design.pattern.template;

public class Cricket extends Game{

	@Override
	protected void initializeGame() {
		System.out.println("Setting up cricket field, and terms");
	}

	@Override
	protected void startGame() {
		System.out.println("Starting the cricket match. toss for choosing batting or fielding");
	}

	@Override
	protected void playGame() {
		System.out.println("Playing cricket batting and fielding and bowling");
	}

	@Override
	protected void endGame() {
		System.out.println("Game is over team with most runs");
	}

}
