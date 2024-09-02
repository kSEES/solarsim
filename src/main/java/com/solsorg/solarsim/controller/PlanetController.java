package com.solsorg.solarsim.controller;

import com.solsorg.solarsim.model.Planet;
import com.solsorg.solarsim.service.PlanetService;
import com.solsorg.solarsim.util.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;

import java.util.List;

@RestController
@RequestMapping("/api/planets")
public class PlanetController {
    @Autowired
    private PlanetService planetService;
    private final Logger instance = Logger.getInstance();

    @GetMapping
    public ResponseEntity<List<Planet>> getAllPlanets() {
        List<Planet> planets = planetService.getAllPlanets();

        if(planets.isEmpty()){
            instance.logInfo("The request was successful, but there was no data to return.");
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }

        return new ResponseEntity<>(planets, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Planet> getPlanetById(@PathVariable long id) {
        Planet planet = planetService.getPlanetById(id);

        if(planet == null){
            instance.logError("Unable to find the planet with ID " + id + ".");
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        return new ResponseEntity<>(planet, HttpStatus.OK);
    }

    @PostMapping("/create")
    public ResponseEntity<Planet> createPlanet(@RequestBody Planet planet) {
        if(planetService.savePlanet(planet) != null){
            return new ResponseEntity<>(planet, HttpStatus.CREATED);
        }

        instance.logError("Unable to create the planet.");
        return new ResponseEntity<>(HttpStatus.UNPROCESSABLE_ENTITY);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deletePlanetById(@PathVariable long id) {
        Planet found = planetService.getPlanetById(id);

        if(found == null){
            instance.logError("Unable to find a planet with ID " + id + ". Unable to delete said planet.");
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        planetService.deletePlanet(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

}
