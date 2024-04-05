package com.portfolio.Projects.service;

import com.portfolio.Projects.payload.ProjectDto;

import java.util.List;

public interface ProjectService {
    ProjectDto createProject(ProjectDto  projectDto);
    ProjectDto updateProject(ProjectDto projectDto,int id);
    void deleteProject(int id);
    ProjectDto  getProjectById(int id);
    List<ProjectDto> getAllProject();
    List<ProjectDto> getProjectOfUser(int userId);
}
