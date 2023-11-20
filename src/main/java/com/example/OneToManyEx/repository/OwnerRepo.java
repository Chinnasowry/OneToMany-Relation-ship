package com.example.OneToManyEx.repository;

import com.example.OneToManyEx.model.Owner;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OwnerRepo extends JpaRepository<Owner, Long> {
}
