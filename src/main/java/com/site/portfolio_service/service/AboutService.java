package com.site.portfolio_service.service;

import com.site.portfolio_service.exception.NotFoundException;
import com.site.portfolio_service.repository.AboutRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AboutService {
    private final AboutRepository repo;

    public String getAboutText() {
        return repo.findAll().stream()
                .findFirst()
                .map(About::getContent)
                .orElseThrow(() -> new NotFoundException("About info not found."));
    }
}