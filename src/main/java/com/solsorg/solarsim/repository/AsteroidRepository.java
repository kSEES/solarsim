package com.solsorg.solarsim.repository;

import com.solsorg.solarsim.model.Asteroid;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AsteroidRepository extends JpaRepository<Asteroid, Long> {
}
