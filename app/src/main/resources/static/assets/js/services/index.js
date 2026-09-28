let currentRole = 'admin';

function openLogin(role) {
    currentRole = role;
    const modal = document.getElementById('loginModal');
    const title = document.getElementById('modalTitle');
    const usernameLabel = document.getElementById('usernameLabel');
    const usernameInput = document.getElementById('username');
    
    title.innerText = role.charAt(0).toUpperCase() + role.slice(1) + ' Login';
    
    if (role === 'admin') {
        usernameLabel.innerText = 'Username:';
        usernameInput.placeholder = 'Enter username';
    } else {
        usernameLabel.innerText = 'Email:';
        usernameInput.placeholder = 'Enter email';
    }
    
    document.getElementById('errorMsg').innerText = '';
    document.getElementById('username').value = '';
    document.getElementById('password').value = '';
    
    modal.style.display = 'block';
}

function closeLogin() {
    document.getElementById('loginModal').style.display = 'none';
}

async function handleLogin() {
    const username = document.getElementById('username').value;
    const password = document.getElementById('password').value;
    const errorMsg = document.getElementById('errorMsg');
    
    if (!username || !password) {
        errorMsg.innerText = 'Please fill in all fields';
        return;
    }
    
    let endpoint;
    let body;
    
    if (currentRole === 'admin') {
        endpoint = '/admin';
        body = { username, password };
    } else if (currentRole === 'doctor') {
        endpoint = '/doctor/login';
        body = { identifier: username, password };
    } else {
        endpoint = '/patient/login';
        body = { identifier: username, password };
    }
    
    try {
        const response = await fetch(endpoint, {
            method: 'POST',
            headers: { 'Content-Type': 'application/json' },
            body: JSON.stringify(body)
        });
        
        const data = await response.json();
        
        if (response.ok && data.token) {
            localStorage.setItem('token', data.token);
            localStorage.setItem('userRole', currentRole);
            
            if (currentRole === 'admin') {
                window.location.href = '/adminDashboard/' + data.token;
            } else if (currentRole === 'doctor') {
                window.location.href = '/doctorDashboard/' + data.token;
            } else {
                window.location.href = '/patient/dashboard';
            }
        } else {
            errorMsg.innerText = data.error || 'Invalid credentials';
        }
    } catch (error) {
        errorMsg.innerText = 'Error: ' + error.message;
    }
}

window.onclick = function(event) {
    const modal = document.getElementById('loginModal');
    if (event.target === modal) {
        closeLogin();
    }
}
