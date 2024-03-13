package edu.ycp.cs320.lab02.model;

public class Numbers {
	private String first, second, third;
	private Double result, firstNum ,secondNum ,thirdNum ;
	
	public Numbers(String first, String second, String third) {
		this.first= first;
		this.second= second;
		this.third= third;
		result = null;
	}
	public Numbers(double first, double second, double third) {
		firstNum=first;
		secondNum=second;
		thirdNum=third;
		this.first= Double.toString(first);
		this.second= Double.toString(second);
		this.third= Double.toString(third);
		result = null;
	}
	public Numbers(String first, String second) {
		this.first= first;
		this.second= second;
		result = null;
		
	}
	public Numbers(double first, double second) {
		firstNum=first;
		secondNum=second;
		this.first= Double.toString(first);
		this.second= Double.toString(second);
		result = 0.0;
	}
	public String getFirst() {
		return first;
	}
	public String getSecond() {
		return second;
	}
	public String getThird() {
		return third;
	}
	public double getFirstNum() {
		return firstNum;
	}
	public double getSecondNum() {
		return secondNum;
	}
	public double getThirdNum() {
		return thirdNum;
	}
	public double getResult() {
		return result;
	}
	public void setResult(double result) {
		this.result = result;
	}
	public void setFirst(String input) {
		first=input;
	}
	
	public void setSecond(String input) {
		second=input;
	}

	public void setThird(String input) {
		third=input;
	}
	public void setFirstNum(double input) {
		firstNum=input;
	}
	
	public void setSecondNum(double input) {
		secondNum=input;
	}

	public void setThirdNum(double input) {
		thirdNum=input;
	}
	
	


}
