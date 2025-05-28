package com.site.portfolio.model;

import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class Skill {
    @Id
    @GeneratedValue
    private Long id;
    private String category;

    @ElementCollection
    private List<String> skills;
    // getters & setters
}
