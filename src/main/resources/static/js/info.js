document.addEventListener("DOMContentLoaded", function () {
  async function planetdatafetch() {
    try {
      const response = await fetch("/api/planets", {
        method: "GET",
        headers: { "Content-Type": "application/json" },
      });
      
      const planetinfo = await response.json();

      class planet {
        name = 0;
        mass = 0;
        radius = 0;
        dayLength = 0;
        yearLength = 0;
        eccentricity = 0;
        axialTilt = 0;
        perihelion = 0;
        aphelion = 0;
        constructor(name, mass, radius, dayLength, yearLength, eccentricity, axialTilt, perihelion, aphelion) {
          this.name = name;
          this.mass = mass;
          this.radius = radius;
          this.dayLength = dayLength;
          this.yearLength = yearLength;
          this.eccentricity = eccentricity;
          this.axialTilt = axialTilt;
          this.perihelion = perihelion;
          this.aphelion = aphelion;
        }
        constructor() {
          
        }
      }

      const mercuryinfo = planetinfo[0];
      const venusinfo = planetinfo[1];
      const earthinfo = planetinfo[2];
      const marsinfo = planetinfo[3];
      const jupiterinfo = planetinfo[4];
      const saturninfo = planetinfo[5];
      const uranusinfo = planetinfo[6];
      const neptuneinfo = planetinfo[7];

      //Mercury Info Goes Here
      document.getElementById("mercury-planet-information").innerHTML = 
      mercuryinfo.name 
      + "<br>" + 
      mercuryinfo.mass.toExponential().replace(/e\+?/, ' x 10^') 
      + "<br>" +
      mercuryinfo.radius 
      + "<br>" + 
      mercuryinfo.dayLength.toExponential().replace(/e\+?/, ' x 10^') 
      + "<br>" + 
      mercuryinfo.yearLength.toExponential().replace(/e\+?/, ' x 10^')
      + "<br>" + 
      mercuryinfo.eccentricity 
      + "<br>" + 
      mercuryinfo.axialTilt 
      + "<br>" + 
      mercuryinfo.perihelion.toExponential().replace(/e\+?/, ' x 10^')
      + "<br>" + 
      mercuryinfo.aphelion.toExponential().replace(/e\+?/, ' x 10^');
      
      //Venus Info Goes Here
      document.getElementById("venus-planet-information").innerHTML = 
      venusinfo.name 
      + "<br>" + 
      venusinfo.mass.toExponential().replace(/e\+?/, ' x 10^') 
      + "<br>" +
      venusinfo.radius 
      + "<br>" + 
      venusinfo.dayLength.toExponential().replace(/e\+?/, ' x 10^') 
      + "<br>" + 
      venusinfo.yearLength.toExponential().replace(/e\+?/, ' x 10^') 
      + "<br>" + 
      venusinfo.eccentricity 
      + "<br>" + 
      venusinfo.axialTilt 
      + "<br>" + 
      venusinfo.perihelion.toExponential().replace(/e\+?/, ' x 10^') 
      + "<br>" + 
      venusinfo.aphelion.toExponential().replace(/e\+?/, ' x 10^');
      
      //Earth Info Goes Here
      document.getElementById("earth-planet-information").innerHTML = 
      earthinfo.name 
      + "<br>" + 
      earthinfo.mass.toExponential().replace(/e\+?/, ' x 10^') 
      + "<br>" +
      earthinfo.radius 
      + "<br>" + 
      earthinfo.dayLength.toExponential().replace(/e\+?/, ' x 10^') 
      + "<br>" + 
      earthinfo.yearLength.toExponential().replace(/e\+?/, ' x 10^') 
      + "<br>" + 
      earthinfo.eccentricity 
      + "<br>" + 
      earthinfo.axialTilt 
      + "<br>" + 
      earthinfo.perihelion.toExponential().replace(/e\+?/, ' x 10^') 
      + "<br>" + 
      earthinfo.aphelion.toExponential().replace(/e\+?/, ' x 10^');
      
      //Mars Info Goes Here
      document.getElementById("mars-planet-information").innerHTML = 
      marsinfo.name 
      + "<br>" + 
      marsinfo.mass.toExponential().replace(/e\+?/, ' x 10^') 
      + "<br>" +
      marsinfo.radius 
      + "<br>" + 
      marsinfo.dayLength.toExponential().replace(/e\+?/, ' x 10^') 
      + "<br>" + 
      marsinfo.yearLength.toExponential().replace(/e\+?/, ' x 10^') 
      + "<br>" + 
      marsinfo.eccentricity 
      + "<br>" + 
      marsinfo.axialTilt 
      + "<br>" + 
      marsinfo.perihelion.toExponential().replace(/e\+?/, ' x 10^') 
      + "<br>" + 
      marsinfo.aphelion.toExponential().replace(/e\+?/, ' x 10^');
      
      //Jupiter Info Goes Here
      document.getElementById("jupiter-planet-information").innerHTML = 
      jupiterinfo.name 
      + "<br>" + 
      jupiterinfo.mass.toExponential().replace(/e\+?/, ' x 10^') 
      + "<br>" +
      jupiterinfo.radius 
      + "<br>" + 
      jupiterinfo.dayLength.toExponential().replace(/e\+?/, ' x 10^') 
      + "<br>" + 
      jupiterinfo.yearLength.toExponential().replace(/e\+?/, ' x 10^') 
      + "<br>" + 
      jupiterinfo.eccentricity 
      + "<br>" + 
      jupiterinfo.axialTilt 
      + "<br>" + 
      jupiterinfo.perihelion.toExponential().replace(/e\+?/, ' x 10^') 
      + "<br>" + 
      jupiterinfo.aphelion.toExponential().replace(/e\+?/, ' x 10^');
      
      //Saturn Info Goes Here
      document.getElementById("saturn-planet-information").innerHTML = 
      saturninfo.name 
      + "<br>" + 
      saturninfo.mass.toExponential().replace(/e\+?/, ' x 10^') 
      + "<br>" +
      saturninfo.radius 
      + "<br>" + 
      saturninfo.dayLength.toExponential().replace(/e\+?/, ' x 10^') 
      + "<br>" + 
      saturninfo.yearLength.toExponential().replace(/e\+?/, ' x 10^') 
      + "<br>" + 
      saturninfo.eccentricity 
      + "<br>" + 
      saturninfo.axialTilt 
      + "<br>" + 
      saturninfo.perihelion.toExponential().replace(/e\+?/, ' x 10^') 
      + "<br>" + 
      saturninfo.aphelion.toExponential().replace(/e\+?/, ' x 10^');
      
      //Uranus Info Goes Here
      document.getElementById("uranus-planet-information").innerHTML = 
      uranusinfo.name 
      + "<br>" + 
      uranusinfo.mass.toExponential().replace(/e\+?/, ' x 10^') 
      + "<br>" +
      uranusinfo.radius 
      + "<br>" + 
      uranusinfo.dayLength.toExponential().replace(/e\+?/, ' x 10^') 
      + "<br>" + 
      uranusinfo.yearLength.toExponential().replace(/e\+?/, ' x 10^') 
      + "<br>" + 
      uranusinfo.eccentricity 
      + "<br>" + 
      uranusinfo.axialTilt 
      + "<br>" + 
      uranusinfo.perihelion.toExponential().replace(/e\+?/, ' x 10^') 
      + "<br>" + 
      uranusinfo.aphelion.toExponential().replace(/e\+?/, ' x 10^');

      //Neptune Info Goes Here
      document.getElementById("neptune-planet-information").innerHTML = 
      neptuneinfo.name 
      + "<br>" + 
      neptuneinfo.mass.toExponential().replace(/e\+?/, ' x 10^') 
      + "<br>" +
      neptuneinfo.radius 
      + "<br>" 
      + neptuneinfo.dayLength.toExponential().replace(/e\+?/, ' x 10^') 
      + "<br>" + 
      neptuneinfo.yearLength.toExponential().replace(/e\+?/, ' x 10^') 
      + "<br>" + 
      neptuneinfo.eccentricity 
      + "<br>" + 
      neptuneinfo.axialTilt 
      + "<br>" + 
      neptuneinfo.perihelion.toExponential().replace(/e\+?/, ' x 10^') 
      + "<br>" + 
      neptuneinfo.aphelion.toExponential().replace(/e\+?/, ' x 10^');
    
    } catch (error) {
      console.error("Error fetching planet data:", error);
    }
  }

  planetdatafetch();
});
