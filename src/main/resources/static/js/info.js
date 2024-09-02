document.addEventListener("DOMContentLoaded", function () {
  async function planetdatafetch() {
    try {
      const response = await fetch("/api/planets", {
        method: "GET",
        headers: { "Content-Type": "application/json" },
      });
      
      const planetinfo = await response.json();

      const mercuryinfo = planetinfo[0];
      const venusinfo = planetinfo[1];
      const earthinfo = planetinfo[2];
      const marsinfo = planetinfo[3];
      const jupiterinfo = planetinfo[4];
      const saturninfo = planetinfo[5];
      const uranusinfo = planetinfo[6];
      const neptuneinfo = planetinfo[7];

      document.getElementById("mercury_tech_info").innerHTML = mercuryinfo.name + "<br>" + mercuryinfo.mass + "<br>" +mercuryinfo.radius + "<br>" + mercuryinfo.dayLength + "<br>" + mercuryinfo.yearLength + "<br>" + mercuryinfo.eccentricity + "<br>" + mercuryinfo.axialTilt + "<br>" + mercuryinfo.perihelion + "<br>" + mercuryinfo.aphelion;
      document.getElementById("venus_tech_info").innerHTML = venusinfo.name + "<br>" + venusinfo.mass + "<br>" +venusinfo.radius + "<br>" + venusinfo.dayLength + "<br>" + venusinfo.yearLength + "<br>" + venusinfo.eccentricity + "<br>" + venusinfo.axialTilt + "<br>" + venusinfo.perihelion + "<br>" + venusinfo.aphelion;
      document.getElementById("earth_tech_info").innerHTML = earthinfo.name + "<br>" + earthinfo.mass + "<br>" +earthinfo.radius + "<br>" + earthinfo.dayLength + "<br>" + earthinfo.yearLength + "<br>" + earthinfo.eccentricity + "<br>" + earthinfo.axialTilt + "<br>" + earthinfo.perihelion + "<br>" + earthinfo.aphelion;
      document.getElementById("mars_tech_info").innerHTML = marsinfo.name + "<br>" + marsinfo.mass + "<br>" +marsinfo.radius + "<br>" + marsinfo.dayLength + "<br>" + marsinfo.yearLength + "<br>" + marsinfo.eccentricity + "<br>" + marsinfo.axialTilt + "<br>" + marsinfo.perihelion + "<br>" + marsinfo.aphelion;
      document.getElementById("jupiter_tech_info").innerHTML = jupiterinfo.name + "<br>" + jupiterinfo.mass + "<br>" +jupiterinfo.radius + "<br>" + jupiterinfo.dayLength + "<br>" + jupiterinfo.yearLength + "<br>" + jupiterinfo.eccentricity + "<br>" + jupiterinfo.axialTilt + "<br>" + jupiterinfo.perihelion + "<br>" + jupiterinfo.aphelion;
      document.getElementById("saturn_tech_info").innerHTML = saturninfo.name + "<br>" + saturninfo.mass + "<br>" +saturninfo.radius + "<br>" + saturninfo.dayLength + "<br>" + saturninfo.yearLength + "<br>" + saturninfo.eccentricity + "<br>" + saturninfo.axialTilt + "<br>" + saturninfo.perihelion + "<br>" + saturninfo.aphelion;
      document.getElementById("uranus_tech_info").innerHTML = uranusinfo.name + "<br>" + uranusinfo.mass + "<br>" +uranusinfo.radius + "<br>" + uranusinfo.dayLength + "<br>" + uranusinfo.yearLength + "<br>" + uranusinfo.eccentricity + "<br>" + uranusinfo.axialTilt + "<br>" + uranusinfo.perihelion + "<br>" + uranusinfo.aphelion;
      document.getElementById("neptune_tech_info").innerHTML = neptuneinfo.name + "<br>" + neptuneinfo.mass + "<br>" +neptuneinfo.radius + "<br>" + neptuneinfo.dayLength + "<br>" + neptuneinfo.yearLength + "<br>" + neptuneinfo.eccentricity + "<br>" + neptuneinfo.axialTilt + "<br>" + neptuneinfo.perihelion + "<br>" + neptuneinfo.aphelion;
    } catch (error) {
      console.error("Error fetching planet data:", error);
    }
  }

  planetdatafetch();
});
