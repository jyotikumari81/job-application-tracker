package com.jyoti.jobtracker.controller;

import com.jyoti.jobtracker.entity.JobApplication;
import com.jyoti.jobtracker.service.JobApplicationService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/jobs")
public class JobApplicationController {

    private final JobApplicationService service;

    public JobApplicationController(JobApplicationService service) {
        this.service = service;
    }

    @PostMapping
    public JobApplication addJob(@RequestBody JobApplication job) {
        return service.saveJob(job);
    }

    @GetMapping
    public List<JobApplication> getAllJobs() {
        return service.getAllJobs();
    }

    @PutMapping("/{id}")
    public JobApplication updateJob(
            @PathVariable Long id,
            @RequestBody JobApplication job) {
        job.setId(id);
        return service.saveJob(job);
    }

    @DeleteMapping("/{id}")
    public String deleteJob(@PathVariable Long id) {
        service.deleteJob(id);
        return "Job application deleted successfully!";
    }
}