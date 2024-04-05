package com.portfolio.Skills.service;

import com.portfolio.Skills.entity.Skill;
import com.portfolio.Skills.payloads.SkillDto;

import java.util.List;

public interface SkillService {
    SkillDto createSkill(SkillDto skillDto);
    SkillDto updateSkill(SkillDto skillDto,int id);
    void deleteSkill(int id);
    SkillDto getSkill(int id);
    List<SkillDto> getAllSkill();
}
