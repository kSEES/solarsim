fetch('http://localhost:9090/api/stars/create', {
    method: 'POST',
    headers: { 'Content-Type': 'application/json' },
    body: JSON.stringify({
        name: "Sirius",
        radius: 1.711,
        x: 1.0e18,
        y: 2.5e18,
        z: 3.0e18,
        mass: 2.02e30
    })
});
console.log(fetch('http://localhost:9090/api/stars'));