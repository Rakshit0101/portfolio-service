package com.site.portfolio_service.controller;

import com.site.portfolio_service.dto.InstagramPostDto;
import com.site.portfolio_service.model.InstagramPost;
import com.site.portfolio_service.service.InstagramService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/instagram")
@RequiredArgsConstructor
@CrossOrigin
public class InstagramController {
    private final InstagramService service;

    @PostMapping("/fetch")
    public ResponseEntity<Void> fetchPosts(@RequestBody List<InstagramPostDto> posts) {
        service.fetchAndStore(posts);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/top-liked")
    public ResponseEntity<InstagramPost> getTopLiked() {
        return ResponseEntity.ok(service.getTopLiked());
    }
}