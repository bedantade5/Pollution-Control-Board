package com.vig.polutioncontrol.common.login.dto;

public class GetReportDTO {

    private String dateAndTime;
    private double temperature;
    private double humidity;
    private double pressure;
    private double altitude;
    private double gasResistance;
    private double waterFlow;
    private double totalWaterFlowPerHour;
    private double tdsValue;
    private double phLevel;
    private double oxygenLevel;
    private double pm25Level;
    private double pm10Level;

    // Default Constructor
    public GetReportDTO() {}

    // Getters and Setters
    public String getDateAndTime() {
        return dateAndTime;
    }

    public void setDateAndTime(String dateAndTime) {
        this.dateAndTime = dateAndTime;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public double getHumidity() {
        return humidity;
    }

    public void setHumidity(double humidity) {
        this.humidity = humidity;
    }

    public double getPressure() {
        return pressure;
    }

    public void setPressure(double pressure) {
        this.pressure = pressure;
    }

    public double getAltitude() {
        return altitude;
    }

    public void setAltitude(double altitude) {
        this.altitude = altitude;
    }

    public double getGasResistance() {
        return gasResistance;
    }

    public void setGasResistance(double gasResistance) {
        this.gasResistance = gasResistance;
    }

    public double getWaterFlow() {
        return waterFlow;
    }

    public void setWaterFlow(double waterFlow) {
        this.waterFlow = waterFlow;
    }

    public double getTotalWaterFlowPerHour() {
        return totalWaterFlowPerHour;
    }

    public void setTotalWaterFlowPerHour(double totalWaterFlowPerHour) {
        this.totalWaterFlowPerHour = totalWaterFlowPerHour;
    }

    public double getTdsValue() {
        return tdsValue;
    }

    public void setTdsValue(double tdsValue) {
        this.tdsValue = tdsValue;
    }

    public double getPhLevel() {
        return phLevel;
    }

    public void setPhLevel(double phLevel) {
        this.phLevel = phLevel;
    }

    public double getOxygenLevel() {
        return oxygenLevel;
    }

    public void setOxygenLevel(double oxygenLevel) {
        this.oxygenLevel = oxygenLevel;
    }

    public double getPm25Level() {
        return pm25Level;
    }

    public void setPm25Level(double pm25Level) {
        this.pm25Level = pm25Level;
    }

    public double getPm10Level() {
        return pm10Level;
    }

    public void setPm10Level(double pm10Level) {
        this.pm10Level = pm10Level;
    }
}

