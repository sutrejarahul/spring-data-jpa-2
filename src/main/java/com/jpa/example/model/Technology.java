package com.jpa.example.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Technology {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int id;
    private String technology;
}
