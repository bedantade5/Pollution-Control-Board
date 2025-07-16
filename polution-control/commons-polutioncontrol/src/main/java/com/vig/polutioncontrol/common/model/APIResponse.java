package com.vig.polutioncontrol.common.model;

public class APIResponse {

	private String  version;
	private Integer status;
	private String  message;
	private Object  data;
	
	public APIResponse()
	{
		super();
		this.version = "1.0";
	}
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Object getData() {
		return data;
	}
	public void setData(Object data) {
		this.data = data;
	}
}
