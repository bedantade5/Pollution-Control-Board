package com.vig.polutioncontrol.common.login.dto;

public class LoginResponseDTO 
{
	private String UserName;
	private String UserPassword;
	
	public String getUserName() {
		return UserName;
	}
	public void setUserName(String userName) {
		UserName = userName;
	}
	public String getUserPassword() {
		return UserPassword;
	}
	public void setUserPassword(String userPassword) {
		UserPassword = userPassword;
	}
}
