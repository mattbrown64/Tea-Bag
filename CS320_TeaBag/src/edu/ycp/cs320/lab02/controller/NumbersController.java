package edu.ycp.cs320.lab02.controller;

import edu.ycp.cs320.lab02.model.Numbers;

public class NumbersController {
	private Numbers model;
	
	public void setModel(Numbers model) {
		this.model = model;
	}
	
	public double add() {
		model.setResult(model.getFirstNum()+model.getSecondNum()+model.getThirdNum());
		return model.getResult();
	}
	public double multiply() {
		model.setResult(model.getFirstNum()*model.getSecondNum());
		return model.getResult();
	}
	public String getFirst() {
		return model.getFirst();
	}
	public String getSecond() {
		return model.getSecond();
	}
	public String getThird() {
		return model.getThird();
	}
	
	public double getResult() {
		return model.getResult();
	}

	public void setFirst(double input) {
		model.setFirstNum(input);
	}
	public void setSecond(double input) {
		model.setSecondNum(input);
	}
	public void setThird(double input) {
		model.setThirdNum(input);
	}
	
	
	
}
