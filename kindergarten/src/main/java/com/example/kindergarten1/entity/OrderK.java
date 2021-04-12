package com.example.kindergarten1.entity;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;



    @Entity
    @Table(name="ordersK")
    @Getter
    @Setter
    public class OrderK {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "id")
        private Long id;

        @Column(name="order_tracking_number")
        private String orderTrackingNumber;

        @Column(name="total_number_of_children")
        private int totalNumberOfChildren;

        @Column(name="total_price")
        private BigDecimal totalPrice;

        @Column(name="status")
        private String status;


        @Column(name="date_created")
        @CreationTimestamp
        private Date dateCreated;

        @Column(name="last_updated")
        @UpdateTimestamp
        private Date lastUpdated;



        @OneToMany(cascade = CascadeType.ALL, mappedBy = "orderK")
        private Set<OrderItemK> orderItemsK = new HashSet<>();

        @ManyToOne
        @JoinColumn(name = "agent_id")
        private Agent agent;

        @OneToOne(cascade = CascadeType.ALL)
        @JoinColumn(name = "kindergarten_addressK_id", referencedColumnName = "id")
        private AdressK kindergartenAddressK;

        @OneToOne(cascade = CascadeType.ALL)
        @JoinColumn(name = "billing_addressK_id", referencedColumnName = "id")
        private AdressK billingAddressK;

        public void add(OrderItemK item) {

            if (item != null) {
                if (orderItemsK == null) {
                    orderItemsK = new HashSet<>();
                }

                orderItemsK.add(item);
                item.setOrderK(this);
            }
        }

    }
