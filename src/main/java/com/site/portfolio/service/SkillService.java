package com.site.portfolio.service;

import com.site.portfolio.model.Skill;
import com.site.portfolio.repository.SkillRepository;
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