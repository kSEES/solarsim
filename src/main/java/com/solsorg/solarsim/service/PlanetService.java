package com.solsorg.solarsim.service;

import com.solsorg.solarsim.model.Planet;
import com.solsorg.solarsim.repository.PlanetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlanetService {
    @Autowired
    private PlanetRepository planetRepository;

    public List<Planet> getAllPlanets(){
        return planetRepository.findAll();
    }

    public Planet getPlanetById(long id){
        return planetRepository.findById(id).orElse(null);
    }

    public Planet savePlanet(Planet planet){
        return planetRepository.save(planet);
    }

    public void deletePlanet(long id){
        planetRepository.deleteById(id);
    }
}
