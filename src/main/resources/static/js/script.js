document.addEventListener("DOMContentLoaded", function () { //Establishing JS to run after HTML DOM Content is Loaded

    const astrodata = document.querySelectorAll(".astro_data"); //Established an "astrodata" constant that will hold everything in the class (named with a placeholder) astro_data.
    
    astrodata.forEach((planetbutton) => { //Established a function where each "planetbutton" will do something relating to "astrodata."

        planetbutton.addEventListener("mouseclick",  () => { //Hopefully established something where the "planetbutton" will look for clicks and perform and action.
            
            fetch(".attributes"); //Hopefully established a function that fetches information with the class "attributes"
        });
    });
});