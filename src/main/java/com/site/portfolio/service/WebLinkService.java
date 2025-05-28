package com.site.portfolio.service;

import com.site.portfolio.model.WebLink;
import com.site.portfolio.repository.WebLinkRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.time.LocalDateTime;
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