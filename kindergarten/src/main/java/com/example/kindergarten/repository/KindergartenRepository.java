package com.example.kindergarten.repository;

import com.example.kindergarten.entity.Kindergarten;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestParam;

@CrossOrigin("http://localhost:4200")
public interface KindergartenRepository extends JpaRepository<Kindergarten, Long > {
    Page<Kindergarten> findByCategoryId(@RequestParam("id") Long id, Pageable pageable );


}
