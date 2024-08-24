package com.solsorg.solarsim.controller;

import com.solsorg.solarsim.dto.StarDTO;
import com.solsorg.solarsim.service.StarService;

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

    @GetMapping
    public ResponseEntity<List<StarDTO>> getAllStars(){
        List<StarDTO> stars = starService.getAllStarDTOs();

        if(stars.isEmpty()){
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }

        return new ResponseEntity<>(stars, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<StarDTO> getStarById(@PathVariable long id){
        StarDTO star = starService.getStarDTOById(id);

        if(star == null){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        return new ResponseEntity<>(star, HttpStatus.OK);
    }

    @PostMapping("/create")
    public ResponseEntity<String> createStar(@RequestBody StarDTO starDTO){
        if(starService.saveStarDTO(starDTO) != null){
            return new ResponseEntity<>(HttpStatus.CREATED);
        }

        return new ResponseEntity<>(HttpStatus.UNPROCESSABLE_ENTITY);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteStar(@PathVariable long id){
        StarDTO foundStar = starService.getStarDTOById(id);

        if(foundStar == null){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        starService.deleteStar(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}