package com.Fatih.Todomanagement.Servise;

import com.Fatih.Todomanagement.Entity.Project;
import com.Fatih.Todomanagement.dto.ProjectDto;
import com.Fatih.Todomanagement.util.TPage;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface ProjectService {
    ProjectDto save(Project project);

    ProjectDto getById(Long id);

    ProjectDto getByProjectCode(String projectCode);

    List<ProjectDto> getByProjectCodeContains(String projectCode);

    TPage<ProjectDto> getAllPageable(Pageable pageable);

    Boolean delete (ProjectDto project);

    ProjectDto save(ProjectDto project);

    ProjectDto update(Long id, ProjectDto project);

}
