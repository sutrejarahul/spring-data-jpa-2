package com.jpa.example.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class JobPost {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int id;
    private String postProfile;
    private String postDesc;
    private Integer reqExperience;
    @OneToMany
    private List<Technology> postTechStack;
}
