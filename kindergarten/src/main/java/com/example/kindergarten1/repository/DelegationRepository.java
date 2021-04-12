package com.example.kindergarten1.repository;

import com.example.kindergarten1.entity.Delegation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;
@CrossOrigin("http://localhost:4200")
@RepositoryRestResource
public interface DelegationRepository extends JpaRepository<Delegation, Integer> {

    List<Delegation> findByStateCode(@Param("code") String code);

}