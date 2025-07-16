package com.vig.polutioncontrol.common.model;

public class GetUserLastlocation 
{
	private Long user_id;
	private Double longitude;
	private Double latitude;
	private String date_time;
	private String user_full_name;
	
	public GetUserLastlocation() {
		super();
	}

	public GetUserLastlocation(Long user_id, Double longitude, Double latitude, String date_time,
			String user_full_name) {
		super();
		this.user_id = user_id;
		this.longitude = longitude;
		this.latitude = latitude;
		this.date_time = date_time;
		this.user_full_name = user_full_name;
	}

	public Long getUser_id() {
		return user_id;
	}

	public void setUser_id(Long user_id) {
		this.user_id = user_id;
	}

	public Double getLongitude() {
		return longitude;
	}

	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}

	public Double getLatitude() {
		return latitude;
	}

	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}

	public String getDate_time() {
		return date_time;
	}

	public void setDate_time(String date_time) {
		this.date_time = date_time;
	}

	public String getUser_full_name() {
		return user_full_name;
	}

	public void setUser_full_name(String user_full_name) {
		this.user_full_name = user_full_name;
	}
	
}