package com.jpa.example.service;

import com.jpa.example.model.JobPost;
import com.jpa.example.repository.JobPostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class JobPostService {

    private final JobPostRepository jobPostRepository;

    @Autowired
    public JobPostService(JobPostRepository jobPostRepository) {
        this.jobPostRepository= jobPostRepository;
    }

    public void addJob(JobPost jobPost) {
        jobPostRepository.save(jobPost);
    }

    public Optional<JobPost> findById(int id) {
        return jobPostRepository.findById(id);
    }

    public List<JobPost> findAll() {
        return jobPostRepository.findAll();
    }

    public Optional<JobPost> getJob(int postId) {
        return jobPostRepository.findById(postId);
    }

    public void update(JobPost jobPost) {
        jobPostRepository.save(jobPost);
    }

    public void delete(int postId) {
        jobPostRepository.deleteById(postId);
    }

    public List<JobPost> findByPostOrDescription(String keyword) {
        return jobPostRepository.findByPostProfileContainingOrPostDescContaining(keyword, keyword);
    }
}
