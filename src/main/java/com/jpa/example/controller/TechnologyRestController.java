package com.jpa.example.controller;

import com.jpa.example.model.Technology;
import com.jpa.example.service.TechnologyService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class TechnologyRestController {

    private final TechnologyService technologyService;

    @GetMapping("technology")
    public List<Technology> findAll() {
        return technologyService.findAll();
    }

    @PostMapping("technology")
    public Technology save(@RequestBody Technology technology) {
        return technologyService.saveTechnology(technology);
    }

    @PostMapping("technologies")
    public List<Technology> saveAll(@RequestBody List<Technology> technologies) {
        return technologyService.saveAll(technologies);
    }
}
