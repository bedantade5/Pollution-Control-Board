<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>About | Pollution Control Board Monitor</title>
<link
	href="https://fonts.googleapis.com/css2?family=Inter:wght@300;400;500;600;700&display=swap"
	rel="stylesheet">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0/css/all.min.css">
<link rel="stylesheet" href="resources/css/about.css">
</head>

<body>
	<header class="navbar">
		<div class="logo">
			<i class="fas fa-leaf"></i> <span>PCB Monitor</span>
		</div>
		<nav class="nav-links">
			<a href="${pageContext.request.contextPath}/">Home</a> <a
				href="#mission" class="active">About</a> <a href="#contact">Contact</a>
			<a class="login-btn"
				href="${pageContext.servletContext.contextPath}/login"> <i
				class="fas fa-sign-in-alt"></i> Login
			</a>
		</nav>
		<div class="mobile-menu-toggle" onclick="toggleMobileMenu()">
			<i class="fas fa-bars"></i>
		</div>
	</header>

	<section class="hero-section">
		<div class="hero-content">
			<h1 class="hero-title">Keeping the Air Clean, for Everyone</h1>
			<p class="hero-description">Advanced environmental monitoring and
				pollution control solutions for a sustainable future. Real-time
				data, community engagement, and comprehensive analytics for cleaner
				cities.</p>
			<div class="hero-stats">
				<div class="stat-item">
					<div class="stat-number">150+</div>
					<div class="stat-label">Cities Covered</div>
				</div>
				<div class="stat-item">
					<div class="stat-number">50K+</div>
					<div class="stat-label">Reports Processed</div>
				</div>
				<div class="stat-item">
					<div class="stat-number">2,500+</div>
					<div class="stat-label">Air Quality Sensors</div>
				</div>
			</div>
		</div>
	</section>

	<main class="about-container">
		<section id="mission" class="mission-section">
			<div class="section-header">
				<h2>Our Mission</h2>
				<p>The Pollution Control Board Monitoring System is dedicated to
					ensuring a cleaner, greener, and healthier environment by
					monitoring air, water, and environmental parameters in real-time.</p>
			</div>

			<div class="vision-mission">
				<div class="card vision-card">
					<div class="card-icon">
						<i class="fas fa-eye"></i>
					</div>
					<h3>Vision</h3>
					<p>To foster a sustainable ecosystem for future generations by
						rigorously monitoring and controlling pollution levels across all
						environmental parameters.</p>
				</div>
				<div class="card mission-card">
					<div class="card-icon">
						<i class="fas fa-rocket"></i>
					</div>
					<h3>Mission</h3>
					<p>To provide transparent, accurate and timely environmental
						data to the public and authorities, ensuring accountability and
						proactive control measures.</p>
				</div>
			</div>
		</section>

		<section class="features-section">
			<div class="section-header">
				<h2>Key Features</h2>
				<p>Comprehensive environmental monitoring solutions designed for
					government agencies and communities.</p>
			</div>

			<div class="features-grid">
				<div class="feature-card">
					<div class="feature-icon">
						<i class="fas fa-chart-line"></i>
					</div>
					<h3>Real-time Monitoring</h3>
					<p>Continuous monitoring of air quality, water parameters, and
						environmental conditions with instant alerts and notifications.</p>
				</div>
				<div class="feature-card">
					<div class="feature-icon">
						<i class="fas fa-chart-pie"></i>
					</div>
					<h3>Data Analytics</h3>
					<p>Advanced analytics and reporting tools to identify trends,
						patterns, and environmental impact assessments.</p>
				</div>
				<div class="feature-card">
					<div class="feature-icon">
						<i class="fas fa-users"></i>
					</div>
					<h3>Community Reporting</h3>
					<p>Citizen engagement platform allowing communities to report
						environmental concerns and track resolution progress.</p>
				</div>
				<div class="feature-card">
					<div class="feature-icon">
						<i class="fas fa-clipboard-check"></i>
					</div>
					<h3>Compliance Tracking</h3>
					<p>Automated compliance monitoring and reporting for industries
						and organizations to meet environmental standards.</p>
				</div>
			</div>
		</section>

		<section class="impact-section">
			<div class="impact-content">
				<h2>Environmental Impact</h2>
				<p>Our comprehensive monitoring system has helped reduce
					pollution levels and improve environmental compliance across
					multiple regions.</p>

				<div class="impact-stats">
					<div class="impact-stat">
						<i class="fas fa-leaf"></i>
						<div class="impact-details">
							<span class="impact-number">25%</span> <span class="impact-text">Reduction
								in Air Pollution</span>
						</div>
					</div>
					<div class="impact-stat">
						<i class="fas fa-water"></i>
						<div class="impact-details">
							<span class="impact-number">40%</span> <span class="impact-text">Improved
								Water Quality</span>
						</div>
					</div>
					<div class="impact-stat">
						<i class="fas fa-industry"></i>
						<div class="impact-details">
							<span class="impact-number">90%</span> <span class="impact-text">Industry
								Compliance Rate</span>
						</div>
					</div>
				</div>
			</div>
		</section>
	</main>

	<footer class="footer" id="contact">
		<div class="footer-content">
			<div class="footer-section">
				<div class="footer-logo">
					<i class="fas fa-leaf"></i> <span>PCB Monitor</span>
				</div>
				<p>Dedicated to environmental protection and sustainable
					development through advanced monitoring solutions.</p>
			</div>

			<div class="footer-section">
				<h3>Contact Information</h3>
				<div class="contact-info">
					<p>
						<i class="fas fa-envelope"></i> bedanta.de5@gmail.com
					</p>
					<p>
						<i class="fas fa-phone"></i> +91-9123456789
					</p>
					<p>
						<i class="fas fa-map-marker-alt"></i> Kolkata, India
					</p>
				</div>
			</div>

			<div class="footer-section">
				<h3>Follow Us</h3>
				<div class="social-links">
					<a href="#" class="social-link"><i class="fab fa-twitter"></i></a>
					<a href="#" class="social-link"><i class="fab fa-facebook"></i></a>
					<a href="#" class="social-link"><i class="fab fa-linkedin"></i></a>
					<a href="#" class="social-link"><i class="fab fa-instagram"></i></a>
				</div>
			</div>
		</div>

		<div class="footer-bottom">
			<p>&copy; 2025 Pollution Control Board Monitor. All rights
				reserved. | Made by Bedanta De (Vyoma Internship)</p>
		</div>
	</footer>

	<script src="resources/js/about.js"></script>
</body>
</html>