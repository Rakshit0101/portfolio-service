package com.site.portfolio.transformer;

import com.site.portfolio.dto.InstagramPostDto;
import com.site.portfolio.model.InstagramPost;
import org.springframework.stereotype.Component;

@Component
public class InstagramPostTransformer {
    public InstagramPost toEntity(InstagramPostDto dto) {
        InstagramPost post = new InstagramPost();
        post.setImageUrl(dto.getImageUrl());
        post.setLikes(dto.getLikes());
        post.setComments(dto.getComments());
        post.setCaption(dto.getCaption());
        post.setFetchedAt(LocalDateTime.now());
        return post;
    }
}