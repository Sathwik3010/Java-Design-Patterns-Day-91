package com.codegnan.design.patterns.command;

public class CommandPatternTelevisonExample {

	public static void main(String[] args) {
		Television television = new Television();
		Command turnOnTv = new TurnOnTvCommand(television);
		Command turnOffTv = new TurnOffTvCommand(television);

		RemoteControl remote = new RemoteControl();
		
		remote.setCommand(turnOnTv);
		remote.pressButton();
		remote.setCommand(turnOffTv);
		remote.pressButton();
	}

}
