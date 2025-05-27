package com.site.portfolio_service.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class About {
    @Id
    @GeneratedValue
    private Long id;
    private String content;
    // getters & setters
}