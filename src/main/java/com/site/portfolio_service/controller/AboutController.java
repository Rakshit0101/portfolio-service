package com.site.portfolio_service.controller;

import com.site.portfolio_service.service.AboutService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/about")
@RequiredArgsConstructor
@CrossOrigin
public class AboutController {
    private final AboutService service;

    @GetMapping
    public ResponseEntity<String> getAbout() {
        return ResponseEntity.ok(service.getAboutText());
    }
}