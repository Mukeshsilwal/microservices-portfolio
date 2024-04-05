package com.portfolio.Skills.service.serviceImpl;

import com.portfolio.Skills.payloads.SkillDto;
import com.portfolio.Skills.service.SkillService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class SkillServiceImpl implements SkillService {
    @Override
    public SkillDto createSkill(SkillDto skillDto) {
        return null;
    }

    @Override
    public SkillDto updateSkill(SkillDto skillDto, int id) {
        return null;
    }

    @Override
    public void deleteSkill(int id) {

    }

    @Override
    public SkillDto getSkill(int id) {
        return null;
    }

    @Override
    public List<SkillDto> getAllSkill() {
        return null;
    }
}
