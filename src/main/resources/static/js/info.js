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

      document.getElementById("mercury_tech_info").innerHTML = mercuryinfo;
      document.getElementById("venus_tech_info").innerHTML = venusinfo;
      document.getElementById("earth_tech_info").innerHTML = earthinfo;
      document.getElementById("mars_tech_info").innerHTML = marsinfo;
      document.getElementById("jupiter_tech_info").innerHTML = jupiterinfo;
      document.getElementById("saturn_tech_info").innerHTML = saturninfo;
      document.getElementById("uranus_tech_info").innerHTML = uranusinfo;
      document.getElementById("neptune_tech_info").innerHTML = neptuneinfo;
    } catch (error) {
      console.error("Error fetching planet data:", error);
    }
  }

  planetdatafetch();
});
