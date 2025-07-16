package com.vig.polutioncontrol.common.login.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class LoginResponse {
	private String user_name;
	@JsonIgnore
	private String user_password;
	@JsonIgnore
	private Integer error_code;

	public String getUser_name() {
		return user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	@JsonIgnore
	public String getUser_password() {
		return user_password;
	}

	@JsonIgnore
	public void setUser_password(String user_password) {
		this.user_password = user_password;
	}

	public Integer getError_code() {
		return error_code;
	}

	public void setError_code(Integer error_code) {
		this.error_code = error_code;
	}
}
