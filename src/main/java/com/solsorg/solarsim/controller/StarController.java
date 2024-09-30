package com.solsorg.solarsim.controller;

import com.solsorg.solarsim.model.Star;
import com.solsorg.solarsim.service.StarService;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/stars")
public class StarController {
    private final StarService starService;

    public StarController(StarService starService){
        this.starService = starService;
    }

    @GetMapping
    public ResponseEntity<List<Star>> getAllStars(){
        List<Star> stars = starService.getAllStars();

        if(stars.isEmpty()){
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }

        return new ResponseEntity<>(stars, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Star> getStarById(@PathVariable long id){
        Star star = starService.getStarById(id);

        if(star == null){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        return new ResponseEntity<>(star, HttpStatus.OK);
    }

    @PostMapping("/create")
    public ResponseEntity<String> createStar(@RequestBody Star star){
        if(starService.saveStar(star) != null){
            return new ResponseEntity<>(HttpStatus.CREATED);
        }

        return new ResponseEntity<>(HttpStatus.UNPROCESSABLE_ENTITY);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteStar(@PathVariable long id){
        Star foundStar = starService.getStarById(id);

        if(foundStar == null){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        starService.deleteStar(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}