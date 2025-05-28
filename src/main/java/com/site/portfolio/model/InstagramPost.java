package com.site.portfolio.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Data
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