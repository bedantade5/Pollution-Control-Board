package com.vig.polutioncontrol.common.jwt.dto;

public class SetJwtUserDTO {

	private Long UserID;
	private Integer UserTypeID;
	private String UserName;
	private String UserFullName;
	private String UserPassword;
	private Integer ErrorCode;
	
	public Long getUserID() {
		return UserID;
	}
	public void setUserID(Long userID) {
		UserID = userID;
	}
	public Integer getUserTypeID() {
		return UserTypeID;
	}
	public void setUserTypeID(Integer userTypeID) {
		UserTypeID = userTypeID;
	}
	public String getUserName() {
		return UserName;
	}
	public void setUserName(String userName) {
		UserName = userName;
	}
	public String getUserFullName() {
		return UserFullName;
	}
	public void setUserFullName(String userFullName) {
		UserFullName = userFullName;
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
