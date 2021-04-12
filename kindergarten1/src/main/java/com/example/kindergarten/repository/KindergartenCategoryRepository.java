package com.example.kindergarten.repository;

import com.example.kindergarten.entity.KindergartenCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin("http://localhost:4200")
@RepositoryRestResource(collectionResourceRel="kindergartenCategory", path="kindergarten_category" )
public interface KindergartenCategoryRepository extends JpaRepository<KindergartenCategory, Long> {
}


