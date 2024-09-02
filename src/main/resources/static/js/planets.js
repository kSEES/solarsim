fetch('/api/planets/create', {
    method: 'POST',
    headers: { 'Content-Type': 'application/json' },
    body: JSON.stringify({
        name: "Earth",
        radius: 6371,
        x: 1.0e18,
        y: 2.5e18,
        z: 3.0e18,
        mass: 5.972e24,
        dayLength: 86400,
        yearLength: 31557600,
        eccentricity: 0.0167,
        axialTilt: 23.5,
        perihelion: 147098290,
        aphelion: 152100000
    })
})
.then(response => response.json())
.then(data => console.log('Planet created:', data))
.catch(error => console.error('Error:', error));

fetch('/api/planets')
    .then(response => response.json())
    .then(data => console.log('All planets:', data))
    .catch(error => console.error('Error:', error));