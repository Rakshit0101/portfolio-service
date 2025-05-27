package com.site.portfolio.controller;

import com.site.portfolio.dto.WebLinkRequestDto;
import com.site.portfolio.model.WebLink;
import com.site.portfolio.service.WebLinkService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/weblinks")
@RequiredArgsConstructor
@CrossOrigin
public class WebLinkController {
    private final WebLinkService service;

    @PostMapping
    public ResponseEntity<Void> addLinks(@RequestBody WebLinkRequestDto request) {
        service.saveLinks(request.getUrls());
        return ResponseEntity.ok().build();
    }

    @GetMapping
    public ResponseEntity<List<WebLink>> getLinks() {
        return ResponseEntity.ok(service.getAll());
    }
}