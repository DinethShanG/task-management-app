package com.dinethshang.persistenc.repository.impl;

import com.dinethshang.persistenc.model.Project;
import com.dinethshang.persistenc.repository.IProjectRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class ProjectRepositoryImpl implements IProjectRepository {

    List <Project> projectList = new ArrayList<>();

    @Override
    public Optional<Project> findById(Long id) {
        return projectList.stream()
                .filter(p -> p.getId().equals(id))
                .findFirst();
    }

    @Override
    public Project save(Project project) {

        Project existingProject = findById(project.getId()).orElse(null);

        if(existingProject == null) {
            projectList.add(project);
        } else {
            projectList.remove(existingProject);
            Project updatedProject = new Project(project);
            projectList.add(updatedProject);
        }

        return project;
    }
}
