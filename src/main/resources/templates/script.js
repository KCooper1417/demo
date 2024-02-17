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
});