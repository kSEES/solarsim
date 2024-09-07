package com.solsorg.solarsim.repository;

import com.solsorg.solarsim.model.Planet;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlanetRepository extends JpaRepository<Planet, Long> {
    boolean existsByName(String name);
}
