package com.site.portfolio.dto;

import lombok.Data;

@Data
public class InstagramPostDto {
    private String imageUrl;
    private int likes;
    private int comments;
    private String caption;
    // getters & setters
}