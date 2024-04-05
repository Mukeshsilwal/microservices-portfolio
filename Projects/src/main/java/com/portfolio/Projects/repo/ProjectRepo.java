package com.portfolio.Projects.repo;

import com.portfolio.Projects.entity.Project;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProjectRepo extends JpaRepository<Project,Integer> {
    List<Project> findByUserId(int id);
}
