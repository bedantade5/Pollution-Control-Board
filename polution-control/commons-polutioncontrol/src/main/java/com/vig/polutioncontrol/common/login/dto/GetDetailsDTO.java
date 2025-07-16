package com.vig.polutioncontrol.common.login.dto;

public class GetDetailsDTO {
	private String DateAndTime;
	private String temperature;
	private String humidity;
	private String pressure;
	private String altitude;
	private String gasResistance;
	private String waterFlow;
	private String TotalWaterFlowPerHour;
	private String tdsValue;
	private String pHLevel;
	private String oxygenLevel;
	private String pm25Level;
	private String pm10Level;

	public String getDateAndTime() {
		return DateAndTime;
	}

	public void setDateAndTime(String dateAndTime) {
		DateAndTime = dateAndTime;
	}

	public String getTemperature() {
		return temperature;
	}

	public void setTemperature(String temperature) {
		this.temperature = temperature;
	}

	public String getHumidity() {
		return humidity;
	}

	public void setHumidity(String humidity) {
		this.humidity = humidity;
	}

	public String getPressure() {
		return pressure;
	}

	public void setPressure(String pressure) {
		this.pressure = pressure;
	}

	public String getAltitude() {
		return altitude;
	}

	public void setAltitude(String altitude) {
		this.altitude = altitude;
	}

	public String getGasResistance() {
		return gasResistance;
	}

	public void setGasResistance(String gasResistance) {
		this.gasResistance = gasResistance;
	}

	public String getWaterFlow() {
		return waterFlow;
	}

	public void setWaterFlow(String waterFlow) {
		this.waterFlow = waterFlow;
	}

	public String getTotalWaterFlowPerHour() {
		return TotalWaterFlowPerHour;
	}

	public void setTotalWaterFlowPerHour(String totalWaterFlowPerHour) {
		TotalWaterFlowPerHour = totalWaterFlowPerHour;
	}

	public String getTdsValue() {
		return tdsValue;
	}

	public void setTdsValue(String tdsValue) {
		this.tdsValue = tdsValue;
	}

	public String getpHLevel() {
		return pHLevel;
	}

	public void setpHLevel(String pHLevel) {
		this.pHLevel = pHLevel;
	}

	public String getOxygenLevel() {
		return oxygenLevel;
	}

	public void setOxygenLevel(String oxygenLevel) {
		this.oxygenLevel = oxygenLevel;
	}

	public String getPm25Level() {
		return pm25Level;
	}

	public void setPm25Level(String pm25Level) {
		this.pm25Level = pm25Level;
	}

	public String getPm10Level() {
		return pm10Level;
	}

	public void setPm10Level(String pm10Level) {
		this.pm10Level = pm10Level;
	}

}
