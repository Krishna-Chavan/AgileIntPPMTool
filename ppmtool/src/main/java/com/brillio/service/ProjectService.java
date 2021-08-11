package com.brillio.service;

import com.brillio.domain.Project;
import com.brillio.repository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProjectService {

    @Autowired
    private ProjectRepository projectRepository;

    public Project saveOrUpdateProjet(Project project){
        return projectRepository.save(project);
    }
}
