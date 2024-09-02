document.addEventListener("DOMContentLoaded", function () {
  const jsonData = fetch("/api/planets", {
    method: "GET",
    headers: { "Content-Type": "application/json" },
  });

  var planetinfo = JSON.parse(jsonData);
  var mercuryinfo = planetinfo[0];
  var venusinfo = planetinfo[1];
  var earthinfo = planetinfo[2];
  var marsinfo = planetinfo[3];
  var jupiterinfo = planetinfo[4];
  var saturninfo = planetinfo[5];
  var uranusinfo = planetinfo[6];
  var neptuneinfo = planetinfo[7];

  document.getElementById("mercury_tech_info").innerHTML = mercuryinfo;
  document.getElementById("venus_tech_info").innerHTML = venusinfo;
  document.getElementById("earth_tech_info").innerHTML = earthinfo;
  document.getElementById("mars_tech_info").innerHTML = marsinfo;
  document.getElementById("jupiter_tech_info").innerHTML = jupiterinfo;
  document.getElementById("saturn_tech_info").innerHTML = saturninfo;
  document.getElementById("uranus_tech_info").innerHTML = uranusinfo;
  document.getElementById("neptune_tech_info").innerHTML = neptuneinfo;
});
