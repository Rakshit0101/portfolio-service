package com.site.portfolio_service.controller;

import com.site.portfolio_service.model.Skill;
import com.site.portfolio_service.service.SkillService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/skills")
@RequiredArgsConstructor
@CrossOrigin
public class SkillController {
    private final SkillService service;

    @GetMapping
    public ResponseEntity<List<Skill>> getSkills() {
        return ResponseEntity.ok(service.getAllSkills());
    }
}