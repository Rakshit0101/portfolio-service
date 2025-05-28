package com.site.portfolio.controller;

import com.site.portfolio.dto.InstagramPostDto;
import com.site.portfolio.model.InstagramPost;
import com.site.portfolio.service.InstagramService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("${api.version}/instagram")
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