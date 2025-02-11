package com.jpa.example.controller;

import com.jpa.example.model.JobPost;
import com.jpa.example.service.JobPostService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
public class JobRestController {

    private final JobPostService jobPostService;

    @GetMapping("jobPost")
    public List<JobPost> findAll() {
        return jobPostService.findAll();
    }

    @PostMapping("jobPost")
    public JobPost addJob(@RequestBody JobPost jobPost) {
        jobPostService.addJob(jobPost);
        return jobPostService.findById(jobPost.getId()).orElse(null);
    }

    @GetMapping("/jobPost/{postId}")
    public JobPost getJob(@PathVariable int postId) {
        return jobPostService.getJob(postId).orElse(new JobPost());
    }

    @PutMapping("jobPost")
    public Optional<JobPost> updateJob(@RequestBody JobPost jobPost) {
        Optional<JobPost> post = jobPostService.getJob(jobPost.getId());
        if(post.isPresent()) {
            jobPostService.update(jobPost);
            return post;
        }
        return Optional.empty();
    }

    @DeleteMapping("jobPost/{postId}")
    public String deleteJob(@PathVariable int postId) {
        jobPostService.delete(postId);
        return "Deleted";
    }

    @GetMapping("jobPost/search/{keyword}")
    public List<JobPost> findByPostOrDescription(@PathVariable String keyword) {
        return jobPostService.findByPostOrDescription(keyword);
    }

}
