package com.site.portfolio_service.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

@Entity
public class InstagramPost {
    @Id
    @GeneratedValue
    private Long id;
    private String imageUrl;
    private int likes;
    private int comments;
    private String caption;
    private LocalDateTime fetchedAt;
    // getters & setters
}