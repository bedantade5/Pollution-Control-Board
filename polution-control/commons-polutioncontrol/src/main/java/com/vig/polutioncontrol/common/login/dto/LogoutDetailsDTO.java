package com.vig.polutioncontrol.common.login.dto;

public class LogoutDetailsDTO 
{
	private Long UserID;
	private Integer ErrorCode;
	
	public Long getUserID() {
		return UserID;
	}
	public void setUserID(Long userID) {
		UserID = userID;
	}
	public Integer getErrorCode() {
		return ErrorCode;
	}
	public void setErrorCode(Integer errorCode) {
		ErrorCode = errorCode;
	}
}
