package com.portfolio.Projects.service.serviceImpl;

import com.portfolio.Projects.entity.Project;
import com.portfolio.Projects.payload.ProjectDto;
import com.portfolio.Projects.repo.ProjectRepo;
import com.portfolio.Projects.service.ProjectService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ProjectServiceImpl implements ProjectService {
    private final ModelMapper mapper;
    private final ProjectRepo projectRepo;
    @Override
    public ProjectDto createProject(ProjectDto projectDto) {
        Project project=this.toProject(projectDto);
        Project project1=this.projectRepo.save(project);
        return toDto(project1);
    }

    @Override
    public ProjectDto updateProject(ProjectDto projectDto, int id) {
        Project project=this.projectRepo.findById(id).orElseThrow();
        project.setDescription(projectDto.getDescription());
        project.setPhoto(projectDto.getPhoto());
        project.setTitle(projectDto.getTitle());
        project.setTechnologiesUsed(projectDto.getTechnologiesUsed());
        Project project1=this.projectRepo.save(project);
        return toDto(project1);
    }

    @Override
    public void deleteProject(int id) {
        Project project=this.projectRepo.findById(id).orElseThrow();
        this.projectRepo.delete(project);
    }

    @Override
    public ProjectDto getProjectById(int id) {
        Project project=this.projectRepo.findById(id).orElseThrow();
        return toDto(project);
    }

    @Override
    public List<ProjectDto> getAllProject() {
        List<Project> projects=this.projectRepo.findAll();
        return projects.stream().map(this::toDto).collect(Collectors.toList());
    }

    @Override
    public List<ProjectDto> getProjectOfUser(int userId) {
        List<Project> projects=this.projectRepo.findByUserId(userId);
        return projects.stream().map(this::toDto).collect(Collectors.toList());
    }

    public ProjectDto toDto(Project project){
        return this.mapper.map(project,ProjectDto.class);
    }
    public Project toProject(ProjectDto projectDto){
        return this.mapper.map(projectDto,Project.class);
    }
}
