package com.site.portfolio_service.service;

import com.site.portfolio_service.model.WebLink;
import com.site.portfolio_service.repository.WebLinkRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class WebLinkService {
    private final WebLinkRepository repo;

    public void saveLinks(List<String> urls) {
        urls.forEach(url -> {
            WebLink link = new WebLink();
            link.setUrl(url);
            link.setSubmittedAt(LocalDateTime.now());
            repo.save(link);
        });
    }

    public List<WebLink> getAll() {
        return repo.findAll();
    }
}