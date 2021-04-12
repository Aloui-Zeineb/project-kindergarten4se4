package com.example.kindergarten1.entity;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name="parent")
@Getter
@Setter
public class Parent {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;

    @Column(name="first_name")
    private String firstName;

    @Column(name="last_name")
    private String lastName;

    @Column(name="email")
    private String email;

    @Column(name="phone_number")
    private int phoneNumber;

    @Column(name="first_name_child")
    private String firstNameChild;

    @Column(name="last_name_child")
    private String lastNameChild;

    @Column(name="age_child")
    private int age;

    @OneToMany(mappedBy = "parent", cascade = CascadeType.ALL)
    private Set<Order> orders = new HashSet<>();

    public void add(Order order) {

        if (order != null) {

            if (orders == null) {
                orders = new HashSet<>();
            }

            orders.add(order);
            order.setParent(this);
        }
    }

}

