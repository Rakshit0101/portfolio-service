package com.site.portfolio.controller;

import com.site.portfolio.dto.WebLinkRequestDto;
import com.site.portfolio.model.WebLink;
import com.site.portfolio.service.WebLinkService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("${api.version}/weblinks")
@RequiredArgsConstructor
@CrossOrigin
@Validated
public class WebLinkController {

    private final WebLinkService service;

    @PostMapping
    public ResponseEntity<Void> addLinks(@RequestBody WebLinkRequestDto request) {
        if (request.getUrls() == null || request.getUrls().isEmpty()) {
            return ResponseEntity.badRequest().build(); // Return 400 for empty URLs
        }
        service.saveLinks(request.getUrls());
        return ResponseEntity.ok().build();
    }

    @GetMapping
    public ResponseEntity<List<WebLink>> getLinks() {
        List<WebLink> links = service.getAll();
        return ResponseEntity.ok(links);
    }
}
