package com.example.kindergarten1.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;



    @Entity
    @Table(name="agent")
    @Getter
    @Setter
    public class Agent {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name="id")
        private Long id;

        @Column(name="name")
        private String name;

        @Column(name="email")
        private String email;

        @Column(name="phone_number")
        private int phoneNumber;

        @Column(name="last_name")
        private String lastName;

        @Column(name="first_name_child")
        private String firstNameChild;

        @Column(name="last_name_child")
        private String lastNameChild;


        @Column(name="list_of_activity`")
        private String listOfActivity;

        @Column(name="number_of_teacher`")
        private int numberOfTeacher;

        @Column(name="number_of_children`")
        private int numberOfChildren;


        @OneToMany(mappedBy = "agent", cascade = CascadeType.ALL)
        private Set<OrderK> ordersK = new HashSet<>();

        public void add(OrderK orderK) {

            if (orderK != null) {

                if (ordersK == null) {
                    ordersK = new HashSet<>();
                }

                ordersK.add(orderK);
                orderK.setAgent(this);
            }
        }

    }


