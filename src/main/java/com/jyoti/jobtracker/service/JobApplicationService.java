package com.jyoti.jobtracker.service;

import com.jyoti.jobtracker.entity.JobApplication;
import com.jyoti.jobtracker.repository.JobApplicationRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobApplicationService {

    private final JobApplicationRepository repository;

    public JobApplicationService(JobApplicationRepository repository) {
        this.repository = repository;
    }

    public JobApplication saveJob(JobApplication job) {
        return repository.save(job);
    }

    public List<JobApplication> getAllJobs() {
        return repository.findAll();
    }

    public void deleteJob(Long id) {
        repository.deleteById(id);
    }
}
