package com.gdut.ds.beans.userInfo;

public class Admin {

	private String username;
	
	private String password;

	
	public Admin(){
		
	}

	
	
	public Admin(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}



	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
