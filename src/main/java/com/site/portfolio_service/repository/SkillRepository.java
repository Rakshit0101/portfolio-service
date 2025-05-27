package com.site.portfolio_service.repository;

import com.site.portfolio_service.model.Skill;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SkillRepository extends JpaRepository<Skill, Long> {}