package com.example.kindergarten.entity;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name="order_item")
@Getter
@Setter
public class OrderItem {

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


    @Column(name="kindergarten_id")
    private Long kindergartenId;

    @ManyToOne
    @JoinColumn(name = "order_id")
    private Order order;

}

