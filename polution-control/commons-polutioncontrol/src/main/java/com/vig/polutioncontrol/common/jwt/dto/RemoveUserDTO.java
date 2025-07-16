package com.vig.polutioncontrol.common.jwt.dto;

public class RemoveUserDTO {

	private Long UserID;
	private Integer DeletedBy;
	private Integer ErrorCode;
	public Long getUserID() {
		return UserID;
	}
	public void setUserID(Long userID) {
		UserID = userID;
	}
	public Integer getDeletedBy() {
		return DeletedBy;
	}
	public void setDeletedBy(Integer deletedBy) {
		DeletedBy = deletedBy;
	}
	public Integer getErrorCode() {
		return ErrorCode;
	}
	public void setErrorCode(Integer errorCode) {
		ErrorCode = errorCode;
	}	
}
