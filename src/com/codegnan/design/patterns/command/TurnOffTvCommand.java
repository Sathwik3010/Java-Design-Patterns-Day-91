package com.codegnan.design.patterns.command;

public class TurnOffTvCommand implements Command{

	private Television television;
	
	
	public TurnOffTvCommand(Television television) {
		super();
		this.television = television;
	}

	@Override
	public void execute() {
		television.turnOff();
	}

}
