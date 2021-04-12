package com.example.kindergarten1.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;



    @Entity
    @Table(name="order_itemK")
    @Getter
    @Setter
    public class OrderItemK {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name="id")
        private Long id;

        @Column(name="image_url")
        private String imageUrl;

        @Column(name="unit_price")
        private BigDecimal unitPrice;

        @Column(name="number_of_children")
        private int numberOfChildren;

        @Column(name="kindergartenK_id")
        private Long kindergartenKId;


        @ManyToOne
        @JoinColumn(name = "orderK_id")
        private OrderK orderK;

    }



