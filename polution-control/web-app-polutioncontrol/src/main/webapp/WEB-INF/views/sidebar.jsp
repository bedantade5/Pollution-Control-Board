<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<title>PCB Sidebar</title>
<link
	href="https://fonts.googleapis.com/css2?family=Inter:wght@400;600;700&display=swap"
	rel="stylesheet">
<link rel="stylesheet" href="resources/css/sidebar.css">
</head>

<body>
<div class="main-wrapper">
	<aside class="sidebar" id="sidebar">
		<div class="sidebar-content">
			<div class="sidebar-header">
				<div class="sidebar-logo">
					<button onclick="location.href='${pageContext.request.contextPath}/'" class="logo-icon">🌱</button>
					<div class="logo-text">
						<h3 class="logo-title">PCB</h3>
						<p class="logo-subtitle">Monitor</p>
					</div>
				</div>
				<button class="sidebar-toggle" aria-label="Toggle Sidebar">
					<span class="toggle-icon">☰</span>
				</button>
			</div>

			<nav class="sidebar-nav">
				<ul class="nav-list">
					<li class="nav-item"><a
						href="${pageContext.request.contextPath}/dashboard" class="nav-link"
						data-page="dashboard"><span class="nav-icon">📊</span><span
							class="nav-text">Dashboard</span></a></li>
					<li class="nav-item"><a
						href="${pageContext.request.contextPath}/report" class="nav-link"
						data-page="reports"><span class="nav-icon">📋</span><span
							class="nav-text">Report</span></a></li>
				</ul>
			</nav>

			<div class="sidebar-footer">
				<div class="user-info">
					<div class="user-avatar">👤</div>
					<div class="user-details">
						<p class="user-name">Admin User</p>
						<p class="user-role">Administrator</p>
					</div>
				</div>
				<a href="${pageContext.request.contextPath}/login"
					class="logout-link"><span class="nav-icon">🚪</span><span
					class="nav-text">Logout</span></a>
			</div>
		</div>
	</aside>
	</div>
	<script src="resources/js/sidebar.js"></script>
</body>
</html>