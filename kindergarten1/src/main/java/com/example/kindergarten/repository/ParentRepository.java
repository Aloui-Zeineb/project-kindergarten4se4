package com.example.kindergarten.repository;

import com.example.kindergarten.entity.Parent;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ParentRepository extends JpaRepository<Parent, Long> {
}

