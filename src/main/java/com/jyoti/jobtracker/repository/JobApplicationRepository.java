package com.jyoti.jobtracker.repository;

import com.jyoti.jobtracker.entity.JobApplication;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobApplicationRepository
        extends JpaRepository<JobApplication, Long> {
}
