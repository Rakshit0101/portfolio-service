package com.site.portfolio_service.transformer;

import com.site.portfolio_service.dto.InstagramPostDto;
import com.site.portfolio_service.model.InstagramPost;
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