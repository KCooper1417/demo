document.addEventListener('DOMContentLoaded', function() {
    const generateButton = document.getElementById('generateButton');
    generateButton.addEventListener('click', function() {
        const pick1 = document.getElementById('pick1').value;
        const pick2 = document.getElementById('pick2').value;
        const pick3 = document.getElementById('pick3').value;

        const xhr = new XMLHttpRequest();
        xhr.open('POST', '/userPicks');
        xhr.setRequestHeader('Content-Type', 'application/json');

        const data = {
            pick1: pick1,
            pick2: pick2,
            pick3: pick3
        };

        xhr.onload = function() {
            if (xhr.status === 200) {
                const responseData = JSON.parse(xhr.responseText);

                document.getElementById('winningNumbers').innerText = responseData.winningNumbers.join(', ');
                document.getElementById('outcome').innerText = responseData.outcome;
            } else {
                console.error('Request failed with status:', xhr.status);
            }
        };

        xhr.send(JSON.stringify(data));
    });

    document.getElementById("picksForm").addEventListener("submit", function(event) {
        event.preventDefault();

        var pick1 = document.getElementById("pick1").value;
        var pick2 = document.getElementById("pick2").value;
        var pick3 = document.getElementById("pick3").value;

        document.getElementById("outcome").textContent = "Results: " + pick1 + ", " + pick2 + ", " + pick3;
    });

    function signUpUser(username, email, password) {
        fetch('/signup', {
            method: 'POST',
            headers: {
                'Content-Type': 'application/json'
            },
            body: JSON.stringify({ username, email, password })
        })
        .then(response => {
            if (response.ok) {
                console.log('User signed up successfully!');
            } else {
                console.error('Sign-up failed:', response.statusText);
            }
        })
        .catch(error => {
            console.error('Error during sign-up:', error);
        });
    }
    
    function validateForm(event) {
        event.preventDefault();
        var username = document.getElementById('username').value;
        var email = document.getElementById('email').value;
        var password = document.getElementById('password').value;
        var confirmPassword = document.getElementById('confirm-password').value;
        var errorMessage = '';
    
        if (errorMessage) {
            document.getElementById('error-message').textContent = errorMessage;
        } else {
            signUpUser(username, email, password);
        }
    }
    
    document.getElementById('signupForm').addEventListener('submit', validateForm);
    
});
