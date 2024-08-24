package com.solsorg.solarsim.service;

import com.solsorg.solarsim.dto.PlanetDTO;
import com.solsorg.solarsim.dto.StarDTO;
import com.solsorg.solarsim.model.Planet;
import com.solsorg.solarsim.model.Star;
import com.solsorg.solarsim.repository.StarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StarService {
    @Autowired
    private StarRepository starRepository;

    public List<StarDTO> getAllStarDTOs() {
        return starRepository.findAll().stream()
                .map(this::convertToStarDTO)
                .toList();
    }

    public StarDTO getStarDTOById(long id) {
        return starRepository
                .findById(id)
                .map(this::convertToStarDTO)
                .orElse(null);
    }

    public StarDTO saveStarDTO(StarDTO starDTO) {
        Star star = convertToStarEntity(starDTO);
        Star savedStar = starRepository.save(star);

        return convertToStarDTO(savedStar);
    }

    public void deleteStar(long id) {
        starRepository.deleteById(id);
    }

    private StarDTO convertToStarDTO(Star star) {
        StarDTO dto = new StarDTO();
        dto.setId(star.getId());
        dto.setName(star.getName());
        dto.setRadius(star.getRadius());
        dto.setMass(star.getMass());
        dto.setX(star.getX());
        dto.setY(star.getY());
        dto.setZ(star.getZ());
        dto.setPlanets(star.getPlanets().stream()
                .map(this::convertToPlanetDTO)
                .toList());
        return dto;
    }

    private Star convertToStarEntity(StarDTO dto) {
        Star star = new Star();
        star.setId(dto.getId());
        star.setName(dto.getName());
        star.setRadius(dto.getRadius());
        star.setMass(dto.getMass());
        star.setX(dto.getX());
        star.setY(dto.getY());
        star.setZ(dto.getZ());
        star.setPlanets(dto.getPlanets().stream()
                .map(this::convertToPlanetEntity)
                .toList());
        return star;
    }

    private PlanetDTO convertToPlanetDTO(Planet planet) {
        PlanetDTO dto = new PlanetDTO();
        dto.setId(planet.getId());
        dto.setName(planet.getName());
        dto.setRadius(planet.getRadius());
        dto.setMass(planet.getMass());

        return dto;
    }

    private Planet convertToPlanetEntity(PlanetDTO dto) {
        Planet planet = new Planet();
        planet.setId(dto.getId());
        planet.setName(dto.getName());
        planet.setRadius(dto.getRadius());
        planet.setMass(dto.getMass());

        return planet;
    }
}
