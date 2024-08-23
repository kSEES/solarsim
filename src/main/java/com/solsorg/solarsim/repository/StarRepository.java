package com.solsorg.solarsim.repository;

import com.solsorg.solarsim.model.Star;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StarRepository extends JpaRepository<Star, Long> {
}
