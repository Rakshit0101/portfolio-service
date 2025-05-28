package com.site.portfolio.controller;

import com.site.portfolio.service.AboutService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("${api.version}/about")
@RequiredArgsConstructor
@CrossOrigin
public class AboutController {
    private final AboutService service;

    @GetMapping()
    public ResponseEntity<String> getAbout() {
        return ResponseEntity.ok(service.getAboutText());
    }
}