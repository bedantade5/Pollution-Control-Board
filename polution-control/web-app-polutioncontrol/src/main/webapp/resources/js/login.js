// Password visibility toggle
const passwordToggle = document.getElementById('passwordToggle');
const passwordInput = document.getElementById('password');

passwordToggle.addEventListener('click', () => {
	const type = passwordInput.getAttribute('type') === 'password' ? 'text' : 'password';
	passwordInput.setAttribute('type', type);
	const icon = passwordToggle.querySelector('.toggle-icon');
	icon.textContent = type === 'password' ? '👁️' : '✕';
});

// Optional client-side form validation before submit
const loginForm = document.getElementById('loginForm');

loginForm.addEventListener('submit', (e) => {
	const username = document.getElementById('username').value.trim();
	const password = document.getElementById('password').value.trim();

	if (!username || !password) {
		e.preventDefault();
		alert("Please enter both username and password.");
		return;
	}
	
	// Button loading text (optional)
	const loginButton = document.getElementById('loginButton');
	loginButton.innerHTML = 'Signing In...';
	loginButton.disabled = true;
});
