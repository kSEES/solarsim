package com.solsorg.solarsim.controller;

import com.solsorg.solarsim.model.Asteroid;
import com.solsorg.solarsim.service.AsteroidService;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/asteroids")
public class AsteroidController {
    private final AsteroidService asteroidService;

    public AsteroidController(AsteroidService asteroidService){
        this.asteroidService = asteroidService;
    }

    @GetMapping
    public ResponseEntity<List<Asteroid>> getAllAsteroids(){
        List<Asteroid> asteroids = asteroidService.getAll();

        if(asteroids.isEmpty()){
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }

        return new ResponseEntity<>(asteroids, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Asteroid> getFromID(@PathVariable long id){
        Asteroid found = asteroidService.getFromID(id);

        if(found == null){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        return new ResponseEntity<>(found, HttpStatus.OK);
    }

    @PostMapping("/create")
    public ResponseEntity<Asteroid> createAsteroid(@RequestBody Asteroid asteroid){
        if(asteroidService.saveAsteroid((asteroid)) != null){
            return new ResponseEntity<>(asteroid, HttpStatus.CREATED);
        }

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

    @PostMapping("/modify/{id}")
    public ResponseEntity<Asteroid> modifyAsteroid(@PathVariable long id){
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
