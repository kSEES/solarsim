package com.solsorg.solarsim.controller;

import com.solsorg.solarsim.model.Star;
import com.solsorg.solarsim.service.StarService;
import com.solsorg.solarsim.util.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/stars")
public class StarController {
    @Autowired
    private StarService starService;
    private final Logger instance = Logger.getInstance();

    @GetMapping
    public ResponseEntity<List<Star>> getAllStars(){
        List<Star> stars = starService.getAllStars();

        if(stars.isEmpty()){
            instance.logInfo("The request is successful, but there are no stars to return.");
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }

        return new ResponseEntity<>(stars, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Star> getStarById(@PathVariable long id){
        Star star = starService.getStarById(id);

        if(star == null){
            instance.logError("Unable to find a star with ID " + id + ".");
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        return new ResponseEntity<>(star, HttpStatus.OK);
    }

    @PostMapping("/create")
    public ResponseEntity<String> createStar(@RequestBody Star star){
        if(starService.saveStar(star) != null){
            return new ResponseEntity<>(HttpStatus.CREATED);
        }

        instance.logError("Unable to create a star.");
        return new ResponseEntity<>(HttpStatus.UNPROCESSABLE_ENTITY);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteStar(@PathVariable long id){
        Star foundStar = starService.getStarById(id);

        if(foundStar == null){
            instance.logError("Unable to find a star with ID " + id + ". Unable to delete said star.");
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        starService.deleteStar(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}