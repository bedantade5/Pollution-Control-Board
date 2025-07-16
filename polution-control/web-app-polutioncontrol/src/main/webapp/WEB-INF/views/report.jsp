<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta name="_csrf" content="${_csrf.token}" />
<meta name="_csrf_header" content="${_csrf.headerName}" />
<title>Report - PCB</title>
<link rel="stylesheet" href="resources/css/styles.css">
<link rel="stylesheet" href="resources/css/report.css">
<link
	href="https://fonts.googleapis.com/css2?family=Inter:wght@400;600;700&display=swap"
	rel="stylesheet">
</head>
<body>
	<div class="main-wrapper">
		<div id="sidebar-container">
			<%@ include file="sidebar.jsp"%>
		</div>

		<header class="header">
			<div class="container">
				<h1 class="main-title">Environmental Monitoring Report</h1>
			</div>
		</header>

		<main class="main-content">
			<div class="container">

				<div class="filter-section">
					<label>From: <input type="datetime-local"
						id="startDateTime" name="startDateTime" value="${startDateTime}">
					</label> <label>To: <input type="datetime-local" id="endDateTime"
						name="endDateTime" value="${endDateTime}">
					</label>
					<button type="button" onclick="searchReport()">Search</button>
					<button type="button" onclick="resetReport()">Reset</button>
				</div>

				<div style="overflow-x: auto;">
					<table style="width: 100%" class="report-table">
						<thead>
							<tr>
								<th>Date &amp; Time</th>
								<th>Temperature (°C)</th>
								<th>Humidity (%)</th>
								<th>Pressure (hPa)</th>
								<th>Altitude (m)</th>
								<th>Gas Resistance (Ω)</th>
								<th>Water Flow (L)</th>
								<th>Total Water Flow / hour (L)</th>
								<th>TDS Value (ppm)</th>
								<th>pH Level</th>
								<th>Oxygen Level (%)</th>
								<th>PM2.5 (µg/m³)</th>
								<th>PM10 (µg/m³)</th>
							</tr>
						</thead>
						<tbody id="reportData">
							<c:choose>
								<c:when test="${empty reportDetails}">
									<tr>
										<td colspan="13" style="text-align: center;">No data
											available for the selected period.</td>
									</tr>
								</c:when>
								<c:otherwise>
									<c:forEach var="report" items="${reportDetails}">
										<tr>
											<td>${report.dateAndTime}</td>
											<td>${report.temperature}</td>
											<td>${report.humidity}</td>
											<td>${report.pressure}</td>
											<td>${report.altitude}</td>
											<td>${report.gasResistance}</td>
											<td>${report.waterFlow}</td>
											<td>${report.totalWaterFlowPerHour}</td>
											<td>${report.tdsValue}</td>
											<td>${report.phLevel}</td>
											<td>${report.oxygenLevel}</td>
											<td>${report.pm25Level}</td>
											<td>${report.pm10Level}</td>
										</tr>
									</c:forEach>
								</c:otherwise>
							</c:choose>
						</tbody>
					</table>
				</div>
			</div>
		</main>

		<footer class="footer">
			<div class="container">
				<p>Made by Bedanta De (Vyoma Internship).</p>
			</div>
		</footer>
	</div>

	<script src="resources/js/report.js"></script>
</body>
</html>
