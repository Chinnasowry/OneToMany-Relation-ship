package com.example.OneToManyEx.repository;

import com.example.OneToManyEx.model.Blogs;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BlogsRepo extends JpaRepository<Blogs, Long> {
}
