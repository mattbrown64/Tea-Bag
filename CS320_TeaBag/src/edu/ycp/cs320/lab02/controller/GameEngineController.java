package edu.ycp.cs320.lab02.controller;

import edu.ycp.cs320.lab02.model.GameEngine;

public class GameEngineController {
	GameEngine model;
	public GameEngineController(GameEngine model) {
		this.model = model;
	}
	
	public String Append(String input) {
		String appended = model.getOutput()+"\n"+input+"\n";
		model.setOutput(appended);
		return appended;
	}
	
	public void process(String input) {
		Append("\t"+input);
		input= input.toLowerCase();
		switch(input) {
		case "move":
			Append("Where do you want to go?");
			break;
		case "north":
			Append(model.getPlayer().move(input));
			break;
		case "south":
			Append(model.getPlayer().move(input));
			break;
		case "east":
			Append(model.getPlayer().move(input));
			break;
		case "west":
			Append(model.getPlayer().move(input));
			break;
		case "take":
			Append("taking");
			break;
		default:
			Append("Input Not Recognised");
		}
	}
}
