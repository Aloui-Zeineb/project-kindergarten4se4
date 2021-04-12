package com.example.kindergarten1.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;
@Entity
@Table(name="kindergarten_Cat")
@Data
@Getter
@Setter
public class KindergartenCat {



        @Id
        @GeneratedValue(strategy= GenerationType.IDENTITY)
        @Column(name="id")
        private Long id;
        @Column(name="cat_Name")
        private String catName;
        @OneToMany(cascade= CascadeType.ALL, mappedBy = "cat")
        private Set<KindergartenK> kindergartensK;

    }


