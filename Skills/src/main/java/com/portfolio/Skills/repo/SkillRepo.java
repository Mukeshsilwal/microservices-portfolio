package com.portfolio.Skills.repo;

import com.portfolio.Skills.entity.Skill;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SkillRepo extends JpaRepository<Skill,Integer> {
}
