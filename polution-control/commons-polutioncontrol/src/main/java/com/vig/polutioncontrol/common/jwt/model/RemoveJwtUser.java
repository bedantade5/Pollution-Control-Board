package com.vig.polutioncontrol.common.jwt.model;

public class RemoveJwtUser {

	private Long user_id;
	private Integer deleted_by;
	private Integer error_code;
	
	public Long getUser_id() {
		return user_id;
	}
	public void setUser_id(Long user_id) {
		this.user_id = user_id;
	}
	public Integer getDeleted_by() {
		return deleted_by;
	}
	public void setDeleted_by(Integer deleted_by) {
		this.deleted_by = deleted_by;
	}
	public Integer getError_code() {
		return error_code;
	}
	public void setError_code(Integer error_code) {
		this.error_code = error_code;
	}
}
