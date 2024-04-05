package com.portfolio.Projects.payload;

import jakarta.persistence.Lob;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ProjectDto {
    private int id;
    private String title;
    private String description;
    private byte[] photo;
    private int userId;
    private List<String> technologiesUsed;
}
