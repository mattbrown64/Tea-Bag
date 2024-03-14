package edu.ycp.cs320.lab02.model;

public class Account {
	private String username, password;
	
	public Account() {
		
	}
	
	public void setUsername(String name) {
		username=name;
	}
	public void setPassword(String pass) {
		password=pass;
	}
	public String getUsername() {
		return username;
	}
	public String getPassword() {
		return password;
	}

}
