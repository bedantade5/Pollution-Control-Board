document.addEventListener('DOMContentLoaded', function () {
    initializePage();
    animateCounters();
    setupScrollAnimations();
    setupAccessibility();
});

function initializePage() {
    const currentPage = window.location.pathname;
    const navLinks = document.querySelectorAll('.nav-links a');

    navLinks.forEach(link => {
        if (link.getAttribute('href') === currentPage || 
            (currentPage.includes('about') && link.textContent.includes('About'))) {
            link.classList.add('active');
        }
    });

    setupSmoothScrolling();
}

function redirectToLogin() {
    const loginBtn = document.querySelector('.login-btn');
    if (loginBtn) {
        loginBtn.innerHTML = '<i class="fas fa-spinner fa-spin"></i> Redirecting...';
        loginBtn.disabled = true;
    }
    setTimeout(() => {
        window.location.href = "login.jsp";
    }, 500);
}

function setupSmoothScrolling() {
    const links = document.querySelectorAll('a[href^="#"]');
    links.forEach(link => {
        link.addEventListener('click', function (e) {
            e.preventDefault();
            const targetId = this.getAttribute('href');
            const targetElement = document.querySelector(targetId);
            if (targetElement) {
                targetElement.scrollIntoView({
                    behavior: 'smooth',
                    block: 'start'
                });
            }
        });
    });
}

function animateCounters() {
    const counters = document.querySelectorAll('.stat-number');
    const observer = new IntersectionObserver((entries) => {
        entries.forEach(entry => {
            if (entry.isIntersecting) {
                animateCounter(entry.target);
                observer.unobserve(entry.target);
            }
        });
    }, { threshold: 0.5, rootMargin: '0px 0px -50px 0px' });

    counters.forEach(counter => observer.observe(counter));
}

function animateCounter(element) {
    const target = parseInt(element.textContent.replace(/[^\d]/g, ''));
    const duration = 2000;
    const start = performance.now();
    const suffix = element.textContent.replace(/[\d]/g, '');

    function updateCounter(currentTime) {
        const elapsed = currentTime - start;
        const progress = Math.min(elapsed / duration, 1);
        const easeOutQuart = 1 - Math.pow(1 - progress, 4);
        const current = Math.floor(target * easeOutQuart);
        element.textContent = current + suffix;

        if (progress < 1) {
            requestAnimationFrame(updateCounter);
        } else {
            element.textContent = target + suffix;
        }
    }
    requestAnimationFrame(updateCounter);
}

function setupScrollAnimations() {
    const animatedElements = document.querySelectorAll('.card, .feature-card, .impact-stat');
    const observer = new IntersectionObserver((entries) => {
        entries.forEach(entry => {
            if (entry.isIntersecting) {
                entry.target.style.opacity = '1';
                entry.target.style.transform = 'translateY(0)';
            }
        });
    }, { threshold: 0.1, rootMargin: '0px 0px -50px 0px' });

    animatedElements.forEach(element => {
        element.style.opacity = '0';
        element.style.transform = 'translateY(30px)';
        element.style.transition = 'opacity 0.6s ease, transform 0.6s ease';
        observer.observe(element);
    });
}

function setupAccessibility() {
    const focusableElements = document.querySelectorAll('a, button, input, textarea, select');
    focusableElements.forEach(element => {
        element.addEventListener('focus', function () {
            this.style.outline = '2px solid var(--primary-green)';
            this.style.outlineOffset = '2px';
        });
        element.addEventListener('blur', function () {
            this.style.outline = 'none';
        });
    });
}
