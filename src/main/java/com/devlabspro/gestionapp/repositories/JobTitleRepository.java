package com.devlabspro.gestionapp.repositories;

import com.devlabspro.gestionapp.models.JobTitle;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobTitleRepository extends JpaRepository<JobTitle, Integer> {
}
