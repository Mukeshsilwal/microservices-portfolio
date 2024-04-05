package com.portfolio.Projects.controller;

import com.portfolio.Projects.model.ApiResponse;
import com.portfolio.Projects.payload.ProjectDto;
import com.portfolio.Projects.service.ProjectService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/project")
@RequiredArgsConstructor
public class ProjectController {
    private final ProjectService projectService;

    @GetMapping("/getAllProject")
    public ResponseEntity<List<ProjectDto>>  getAllProject(){
        List<ProjectDto>  projectDtos=this.projectService.getAllProject();
        return new ResponseEntity<>(projectDtos, HttpStatus.OK);
    }
    @GetMapping("/getProjectById/{id}")
    public ResponseEntity<ProjectDto> getProjectById(@PathVariable int id){
        ProjectDto projectDto=this.projectService.getProjectById(id);
        return new ResponseEntity<>(projectDto,HttpStatus.OK);
    }
    @GetMapping("/user/{userId}")
    public ResponseEntity<List<ProjectDto>> getProjectOfUser(@PathVariable int userId){
        List<ProjectDto> projectDtos=this.projectService.getProjectOfUser(userId);
        return new ResponseEntity<>(projectDtos,HttpStatus.OK);
    }
    @PostMapping("/postProject")
    public ResponseEntity<ProjectDto> createProject(@RequestBody ProjectDto projectDto){
        ProjectDto projectDto1=this.projectService.createProject(projectDto);
        return new ResponseEntity<>(projectDto1,HttpStatus.CREATED);
    }
    @PutMapping("/updateProject/{id}")
    public ResponseEntity<ProjectDto> updateProject(@RequestBody ProjectDto projectDto,@PathVariable int id){
        ProjectDto projectDto1=this.projectService.updateProject(projectDto,id);
        return new ResponseEntity<>(projectDto1,HttpStatus.OK);
    }
    @DeleteMapping("/deleteProject/{id}")
    public ResponseEntity<ApiResponse> deleteProject(@PathVariable int id){
        this.projectService.deleteProject(id);
        return new ResponseEntity<>(new ApiResponse("Project has been removed"),HttpStatus.OK);
    }
}
