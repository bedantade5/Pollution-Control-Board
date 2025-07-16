setInterval(() => {
            const timestamp = document.querySelector('.timestamp');
            if (timestamp) {
                timestamp.textContent = new Date().toLocaleString();
            }
        }, 30000);