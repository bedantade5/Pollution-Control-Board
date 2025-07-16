<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Login - Pollution Control Board</title>
<link rel="stylesheet" href="resources/css/styles.css">
<link rel="stylesheet" href="resources/css/login.css">
<link
	href="https://fonts.googleapis.com/css2?family=Inter:wght@300;400;500;600;700&display=swap"
	rel="stylesheet">
</head>

<body class="login-body">

	<div class="login-container">
		<div class="background-gradient"></div>
		<div class="floating-elements">
			<div class="floating-circle circle-1"></div>
			<div class="floating-circle circle-2"></div>
			<div class="floating-circle circle-3"></div>
		</div>

		<div class="login-card">
			<div class="login-header">
				<div class="logo-section">
					<div class="logo-icon">🌱</div>
					<h1 class="login-title">Pollution Control Board</h1>
				</div>
				<p class="login-subtitle">Environmental Monitoring System</p>
			</div>

			<form class="login-form" id="loginForm"
				action="${pageContext.request.contextPath}/login" method="POST">
				<div class="form-group">
					<label for="username" class="form-label">Username</label>
					<div class="input-wrapper">
						<input type="text" id="username" name="username"
							class="form-input" placeholder="Enter your username" required>
						<div class="input-icon">👤</div>
					</div>
				</div>

				<div class="form-group">
					<label for="password" class="form-label">Password</label>
					<div class="input-wrapper">
						<input type="password" id="password" name="password"
							class="form-input" placeholder="Enter your password" required>
						<button type="button" class="password-toggle" id="passwordToggle">
							<span class="toggle-icon">👁️</span>
						</button>
					</div>
				</div>

				<div class="button-group">
					<button type="submit" class="login-button" id="loginButton">
						<span class="button-text">Sign In</span>
						<div class="button-icon">→</div>
					</button>
				</div>
			</form>

		</div>
	</div>

	<script src="resources/js/login.js"></script>
</body>
</html>
