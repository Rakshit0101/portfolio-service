package com.site.portfolio_service.service;

import com.site.portfolio_service.model.Skill;
import com.site.portfolio_service.repository.SkillRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class SkillService {
    private final SkillRepository repo;

    public List<Skill> getAllSkills() {
        return repo.findAll();
    }
}