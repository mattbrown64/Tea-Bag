package edu.ycp.cs320.lab02.controller;

import edu.ycp.cs320.lab02.model.GameEngine;

public class GameEngineController {
	GameEngine model;
	public GameEngineController(GameEngine model) {
		this.model = model;
	}
	
	public String Append(String input) {
		String appended = model.getOutput()+"\n"+input;
		model.setOutput(appended);
		return appended;
	}
}
