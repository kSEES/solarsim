package com.solsorg.solarsim.service;

import com.solsorg.solarsim.model.Star;
import com.solsorg.solarsim.repository.StarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StarService {
    @Autowired
    private StarRepository starRepository;

    public List<Star> getAllStars() {
        return starRepository.findAll();
    }

    public Star getStarById(long id) {
        return starRepository.findById(id).orElse(null);
    }

    public Star saveStar(Star star) {
        return starRepository.save(star);
    }

    public void deleteStar(long id) {
        starRepository.deleteById(id);
    }
}
