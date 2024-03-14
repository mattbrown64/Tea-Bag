package edu.ycp.cs320.lab02.controller;

import edu.ycp.cs320.lab02.model.Account;

public class LogInController {
	private Account user;
	
	public LogInController(Account user) {
		this.user=user;
	}
	
	public boolean login(String username, String password) {
		return username.equals(user.getUsername())&& password.equals(user.getPassword());
	}
}
