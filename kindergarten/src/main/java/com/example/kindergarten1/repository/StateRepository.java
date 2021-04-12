package com.example.kindergarten1.repository;

import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;
import com.example.kindergarten1.entity.State;
import org.springframework.data.jpa.repository.JpaRepository;




@CrossOrigin("http://localhost:4200")
@RepositoryRestResource(collectionResourceRel = "states", path = "states")
public interface StateRepository extends JpaRepository <State, Integer> {
}