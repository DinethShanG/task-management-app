package com.dinethshang.service;

import com.dinethshang.persistenc.model.Project;


import java.util.Optional;

public interface IProjectService {
    Optional<Project> findById(Long id);

    Project save(Project project);
}
