package com.example.kindergarten1.entity;

import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
@Entity
@Table(name="kindergartenK")
@Data
public class KindergartenK {
       @Id
        @GeneratedValue(strategy= GenerationType.IDENTITY)
        @Column(name="id")
        private Long id;
        @ManyToOne
        @JoinColumn(name="cat_id", nullable = false )
        private KindergartenCat cat;
        @Column(name="name")
        private String name;
        @Column(name="description")
        private String description;
        @Column(name="price")
        private BigDecimal price;
        @Column(name="imageUrl")
        private String imageUrl;
        @Column(name="numberOfChildren")
        private int  numberOfChildren;
        @Column(name="numberOfTeacher")
        private int  numberOfTeacher;
        @Column(name = "date_created")
        @CreationTimestamp
        private Date dateCreated;

        @Column(name = "last_updated")
        @UpdateTimestamp
        private Date lastUpdated;

    }

