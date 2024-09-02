package com.solsorg.solarsim.controller;

import com.solsorg.solarsim.model.Asteroid;
import com.solsorg.solarsim.service.AsteroidService;
import com.solsorg.solarsim.util.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/asteroids")
public class AsteroidController {
    @Autowired
    private AsteroidService asteroidService;
    private final Logger instance = Logger.getInstance();

    @GetMapping
    public ResponseEntity<List<Asteroid>> getAllAsteroids(){
        List<Asteroid> asteroids = asteroidService.getAll();

        if(asteroids.isEmpty()){
            instance.logInfo("The request was successful, but there was no data to return.");
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }

        return new ResponseEntity<>(asteroids, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Asteroid> getFromID(@PathVariable long id){
        Asteroid found = asteroidService.getFromID(id);

        if(found == null){
            instance.logError("Unable to find asteroid with ID " + id + ".");
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        return new ResponseEntity<>(found, HttpStatus.OK);
    }

    @PostMapping("/create")
    public ResponseEntity<Asteroid> createAsteroid(@RequestBody Asteroid asteroid){
        if(asteroidService.saveAsteroid((asteroid)) != null){
            return new ResponseEntity<>(asteroid, HttpStatus.CREATED);
        }

        instance.logError("Unable to create asteroid.");
        return new ResponseEntity<>(HttpStatus.UNPROCESSABLE_ENTITY);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteAsteroid(@PathVariable long id){
        Asteroid found = asteroidService.getFromID(id);

        if(found == null){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        asteroidService.deleteAsteroid(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
