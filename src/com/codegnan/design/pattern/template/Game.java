package com.codegnan.design.pattern.template;

public abstract class Game {

	public final void play() {
		initializeGame();
		startGame();
		playGame();
		endGame();
	}
	
	protected abstract void initializeGame();
	
	protected abstract void startGame();
	
	protected abstract void playGame();
	
	protected abstract void endGame();
}
