package com.example.kindergarten1.repository;

import com.example.kindergarten1.entity.Agent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AgentRepository  extends JpaRepository<Agent, Long> {
}
