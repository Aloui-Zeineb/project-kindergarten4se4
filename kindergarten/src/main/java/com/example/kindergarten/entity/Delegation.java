package com.example.kindergarten.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name="delegation")
@Data
public class Delegation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @Column(name="name")
    private String name;

    @ManyToOne
    @JoinColumn(name="state_id")
    private State state;

}
