package com.jpa.example.service;

import com.jpa.example.model.Technology;
import com.jpa.example.repository.TechnologyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TechnologyService {

    private final TechnologyRepository technologyRepository;

    @Autowired
    public TechnologyService(TechnologyRepository technologyRepository) {
        this.technologyRepository = technologyRepository;
    }

    public List<Technology> findAll() {
        return technologyRepository.findAll();
    }

    public Technology saveTechnology(Technology technology) {
        return technologyRepository.save(technology);
    }

    public List<Technology> saveAll(List<Technology> technologies) {
        return technologyRepository.saveAll(technologies);
    }
}
