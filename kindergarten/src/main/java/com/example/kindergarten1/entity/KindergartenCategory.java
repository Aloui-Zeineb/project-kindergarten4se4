package com.example.kindergarten1.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name="kindergarten_Category")
@Data
@Getter
@Setter


public class KindergartenCategory {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;
    @Column(name="category_Name")
    private String categoryName;
    @OneToMany(cascade= CascadeType.ALL, mappedBy = "category")
    private Set<Kindergarten> kindergartens;

}
