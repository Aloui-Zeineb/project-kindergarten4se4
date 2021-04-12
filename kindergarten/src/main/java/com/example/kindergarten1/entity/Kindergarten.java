package com.example.kindergarten1.entity;


import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name="kindergarten")
@Data

public class Kindergarten {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;
    @ManyToOne
    @JoinColumn(name="category_id", nullable = false )
    private KindergartenCategory category;
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
