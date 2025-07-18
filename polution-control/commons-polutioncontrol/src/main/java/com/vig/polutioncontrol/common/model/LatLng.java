package com.vig.polutioncontrol.common.model;

public class LatLng {
	 private double latitude;
	 private double longitude;
	 private String name;
	 private String address;
	 
	public LatLng(double latitude, double longitude, String name, String address) {
		super();
		this.latitude = latitude;
		this.longitude = longitude;
		this.name = name;
		this.address = address;
	}
	public double getLatitude() {
		return latitude;
	}
	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}
	public double getLongitude() {
		return longitude;
	}
	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	 
	
	 
}
