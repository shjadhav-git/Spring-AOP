package com.springmvc.springaopdemo.repo;

import com.springmvc.springaopdemo.model.JobPost;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface JobRepo extends JpaRepository<JobPost, Integer> {
    List<String> findByPostProfileContainingOrPostDescContaining(String keyword, String keyword1);
}
