const sidebar = document.getElementById('sidebar');
const sidebarToggle = document.querySelector('.sidebar-toggle');
const navLinks = document.querySelectorAll('.nav-link');
const mainWrapper = document.querySelector('.main-wrapper');

function toggleSidebar() {
	sidebar.classList.toggle('collapsed');
	if (mainWrapper) {
		mainWrapper.classList.toggle('sidebar-collapsed');
	}
	if (typeof (Storage) !== "undefined") {
		localStorage.setItem('sidebarCollapsed', sidebar.classList.contains('collapsed'));
	}
}

if (typeof (Storage) !== "undefined") {
	const isCollapsed = localStorage.getItem('sidebarCollapsed') === 'true';
	if (isCollapsed) {
		sidebar.classList.add('collapsed');
		if (mainWrapper) {
			mainWrapper.classList.add('sidebar-collapsed');
		}
	}
}

if (sidebarToggle) {
	sidebarToggle.addEventListener('click', toggleSidebar);
}

navLinks.forEach(link => {
	link.addEventListener('click', (e) => {
		if (link.getAttribute('href') === '#') {
			e.preventDefault();
			const page = link.dataset.page;
		}
		navLinks.forEach(l => l.classList.remove('active'));
		link.classList.add('active');
	});
});