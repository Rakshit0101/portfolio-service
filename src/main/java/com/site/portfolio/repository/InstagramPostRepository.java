package com.site.portfolio.repository;

import com.site.portfolio.model.InstagramPost;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface InstagramPostRepository extends JpaRepository<InstagramPost, Long> {
    Optional<InstagramPost> findTopByOrderByLikesDesc();
}