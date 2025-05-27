package com.site.portfolio.service;

import com.site.portfolio.dto.InstagramPostDto;
import com.site.portfolio.exception.NotFoundException;
import com.site.portfolio.model.InstagramPost;
import com.site.portfolio.repository.InstagramPostRepository;
import com.site.portfolio.transformer.InstagramPostTransformer;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class InstagramService {
    private final InstagramPostRepository repo;
    private final InstagramPostTransformer transformer;

    public void fetchAndStore(List<InstagramPostDto> posts) {
        posts.stream()
                .map(transformer::toEntity)
                .forEach(repo::save);
    }

    public InstagramPost getTopLiked() {
        return repo.findTopByOrderByLikesDesc()
                .orElseThrow(() -> new NotFoundException("No Instagram posts found."));
    }
}
