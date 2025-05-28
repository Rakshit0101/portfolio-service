package com.site.portfolio.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class About {
    @Id
    @GeneratedValue
    private Long id;
    private String content;
    // getters & setters
}