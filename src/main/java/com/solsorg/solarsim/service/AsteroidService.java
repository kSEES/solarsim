package com.solsorg.solarsim.service;

import com.solsorg.solarsim.model.Asteroid;
import com.solsorg.solarsim.repository.AsteroidRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AsteroidService {
    @Autowired
    private AsteroidRepository asteroidRepository;

    public List<Asteroid> getAll(){
        return asteroidRepository.findAll();
    }

    public Asteroid getFromID(long id){
        return asteroidRepository.findById(id).orElse(null);
    }

    public Asteroid saveAsteroid(Asteroid asteroid){
        return asteroidRepository.save(asteroid);
    }

    public void deleteAsteroid(long id){
        asteroidRepository.deleteById(id);
    }
}
