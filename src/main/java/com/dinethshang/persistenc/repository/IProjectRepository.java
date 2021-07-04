package com.dinethshang.persistenc.repository;

import com.dinethshang.persistenc.model.Project;

import java.util.Optional;

public interface IProjectRepository {
    Optional<Project> findById(Long id);

    Project save(Project project);
}
