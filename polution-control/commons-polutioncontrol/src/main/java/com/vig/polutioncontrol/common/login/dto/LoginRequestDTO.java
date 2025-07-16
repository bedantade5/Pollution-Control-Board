package com.vig.polutioncontrol.common.login.dto;

public class LoginRequestDTO {
	private String UserName;
	private String UserPassword;
	private Integer ErrorCode;

	public LoginRequestDTO() {
		this.ErrorCode = 0;
	}

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

	public Integer getErrorCode() {
		return ErrorCode;
	}

	public void setErrorCode(Integer errorCode) {
		ErrorCode = errorCode;
	}
}
