package edu.ycp.cs320.lab02.controller;

import edu.ycp.cs320.lab02.model.Account;

public class CreateAccountController {
	private Account user;
	
	public CreateAccountController(Account user) {
		this.user = user;
	}
	
	public void setUsername(String username) {
		user.setUsername(username);
	}
	
	public boolean setPassword(String password, String passwordConfirm) {
		if(password != "" && password.equals(passwordConfirm)) {
			user.setPassword(password);
			return true;
		}
		return false;
		
	}
}
