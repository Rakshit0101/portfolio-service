package com.site.portfolio.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

@Entity
public class WebLink {
    @Id
    @GeneratedValue
    private Long id;
    private String url;
    private LocalDateTime submittedAt;
    // getters & setters
}