<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>PCB</title>

<link
	href="https://fonts.googleapis.com/css2?family=Inter:wght@300;400;500;600;700&display=swap"
	rel="stylesheet">
<link rel="stylesheet" href="resources/css/styles.css">
<link rel="stylesheet" href="resources/css/dashboard.css">
</head>
<body>
	<div class="main-wrapper">
		<div id="sidebar-container">
			<%@ include file="sidebar.jsp"%>
		</div>

		<header class="header">
			<div class="container">
				<h1 class="main-title">Pollution Control Board</h1>
				<p class="subtitle">Environmental Monitoring Dashboard</p>
			</div>
		</header>

		<main class="main-content">
			<div class="container">
				<section class="location-section">
					<div class="location-card">
						<h2 class="section-title">Monitoring Location</h2>
						<div class="location-info">
							<div class="location-item">
								<span class="location-label">Location:</span> <span
									class="location-value">LD Block, Sector 3</span>
							</div>
							<div class="location-item">
								<span class="location-label">City, State:</span> <span
									class="location-value">Kolkata, West Bengal</span>
							</div>
							<div class="location-item">
								<span class="location-label">Last Updated:</span> <span
									class="location-value timestamp">2024-06-20 14:30:00</span>
							</div>
						</div>
					</div>
				</section>

				<section class="parameters-section">
					<h2 class="section-title">Environmental Parameters</h2>
					<div class="parameters-grid">

						<div class="parameter-card temperature">
							<div class="card-header">
								<h3 class="parameter-name">Temperature</h3>
								<div class="parameter-icon">🌡️</div>
							</div>
							<div class="parameter-value">
								<span class="value">${surveyDetails.getTemperature()}</span> <span
									class="unit">°C</span>
							</div>
						</div>

						<div class="parameter-card humidity">
							<div class="card-header">
								<h3 class="parameter-name">Humidity</h3>
								<div class="parameter-icon">💧</div>
							</div>
							<div class="parameter-value">
								<span class="value">${surveyDetails.getHumidity()}</span> <span
									class="unit">%</span>
							</div>
						</div>

						<div class="parameter-card pressure">
							<div class="card-header">
								<h3 class="parameter-name">Pressure</h3>
								<div class="parameter-icon">⚡</div>
							</div>
							<div class="parameter-value">
								<span class="value">${surveyDetails.getPressure()}</span> <span
									class="unit">hPa</span>
							</div>
						</div>

						<div class="parameter-card altitude">
							<div class="card-header">
								<h3 class="parameter-name">Altitude</h3>
								<div class="parameter-icon">⛰️</div>
							</div>
							<div class="parameter-value">
								<span class="value">${surveyDetails.getAltitude()}</span> <span
									class="unit">m</span>
							</div>
						</div>

						<div class="parameter-card gas-resistance">
							<div class="card-header">
								<h3 class="parameter-name">Gas Resistance</h3>
								<div class="parameter-icon">🔬</div>
							</div>
							<div class="parameter-value">
								<span class="value">${surveyDetails.getGasResistance()}</span> <span
									class="unit">Ω</span>
							</div>
						</div>

						<div class="parameter-card water-flow">
							<div class="card-header">
								<h3 class="parameter-name">Water Flow</h3>
								<div class="parameter-icon">🌊</div>
							</div>
							<div class="parameter-value">
								<span class="value">${surveyDetails.getWaterFlow()}</span> <span
									class="unit">L/min</span>
							</div>
						</div>

						<div class="parameter-card total-water-flow">
							<div class="card-header">
								<h3 class="parameter-name">Total Water Flow/Hour</h3>
								<div class="parameter-icon">📊</div>
							</div>
							<div class="parameter-value">
								<span class="value">${surveyDetails.getTotalWaterFlowHour()}</span>
								<span class="unit">L/hour</span>
							</div>
						</div>

						<div class="parameter-card tds">
							<div class="card-header">
								<h3 class="parameter-name">TDS Value</h3>
								<div class="parameter-icon">💎</div>
							</div>
							<div class="parameter-value">
								<span class="value">${surveyDetails.getTdsValue()}</span> <span
									class="unit">ppm</span>
							</div>
						</div>

						<div class="parameter-card ph-level">
							<div class="card-header">
								<h3 class="parameter-name">pH Level</h3>
								<div class="parameter-icon">⚗️</div>
							</div>
							<div class="parameter-value">
								<span class="value">${surveyDetails.getpHLevel()}</span> <span
									class="unit">pH</span>
							</div>
						</div>

						<div class="parameter-card oxygen">
							<div class="card-header">
								<h3 class="parameter-name">Oxygen Level</h3>
								<div class="parameter-icon">🫁</div>
							</div>
							<div class="parameter-value">
								<span class="value">${surveyDetails.getOxygenLevel()}</span> <span
									class="unit">%vol</span>
							</div>
						</div>

						<div class="parameter-card pm25">
							<div class="card-header">
								<h3 class="parameter-name">PM2.5 Level</h3>
								<div class="parameter-icon">🌫️</div>
							</div>
							<div class="parameter-value">
								<span class="value">${surveyDetails.getPm25Level()}</span> <span
									class="unit">μg/m³</span>
							</div>
						</div>

						<div class="parameter-card pm10">
							<div class="card-header">
								<h3 class="parameter-name">PM10 Level</h3>
								<div class="parameter-icon">🌪️</div>
							</div>
							<div class="parameter-value">
								<span class="value">${surveyDetails.getPm10Level()}</span> <span
									class="unit">μg/m³</span>
							</div>
						</div>

					</div>
				</section>
			</div>
		</main>
		<footer class="footer">
			<div class="container">
				<p>Made by Bedanta De(Vyoma Internship).</p>
			</div>
		</footer>
	</div>
	<script src="resources/js/dashboard.js"></script>
</body>
</html>