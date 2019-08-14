package com.Fatih.Todomanagement.Repository;

import com.Fatih.Todomanagement.Entity.Project;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;


import java.util.List;

public interface ProjectRepository extends JpaRepository<Project, Long> {

    Project getAllByProjectCode(String projectCode);

    Project getByProjectCodeAndIdNot(String projectCode,Long id);

    List<Project> getAllByProjectCodeContains(String projectCode);

    Page<Project> findAll(Pageable pageable);

    List<Project> findAll(Sort sort);
}
