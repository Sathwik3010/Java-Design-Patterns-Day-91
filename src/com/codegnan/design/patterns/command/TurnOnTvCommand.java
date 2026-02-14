package com.codegnan.design.patterns.command;

public class TurnOnTvCommand implements Command{

	private Television televison;
	
	
	public TurnOnTvCommand(Television televison) {
		super();
		this.televison = televison;
	}

	@Override
	public void execute() {
		televison.turnOn();
	}

}
