package com.example.kindergarten.service;


import com.example.kindergarten.entity.Order;
import com.example.kindergarten.entity.OrderItem;
import com.example.kindergarten.entity.Parent;
import com.example.kindergarten.repository.ParentRepository;
import com.example.kindergarten.subscription.Subscriptions;
import com.example.kindergarten.subscription.SubscriptionsResponse;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Set;
import java.util.UUID;

@Service
public class CheckoutServiceImplementation implements CheckoutService {

    private ParentRepository parentRepository;

    public CheckoutServiceImplementation(ParentRepository parentRepository) {
        this.parentRepository= parentRepository;
    }

    @Override
    @Transactional
    public SubscriptionsResponse placeOrder(Subscriptions subscriptions) {


        Order order = subscriptions.getOrder();


        String orderTrackingNumber = generateOrderTrackingNumber();
        order.setOrderTrackingNumber(orderTrackingNumber);


        Set<OrderItem> orderItems = subscriptions.getOrderItems();
        orderItems.forEach(item -> order.add(item));


        order.setBillingAddress(subscriptions.getBillingAddress());
        order.setChildAddress(subscriptions.getChildAddress());

        Parent parent = subscriptions.getParent();
        parent.add(order);

        // save to the database
        parentRepository.save(parent);

        // return a response
        return new SubscriptionsResponse(orderTrackingNumber);
    }

    private String generateOrderTrackingNumber() {

        // generate a random UUID number (UUID version-4)
        // For details see: https://en.wikipedia.org/wiki/Universally_unique_identifier
        //
        return UUID.randomUUID().toString();
    }

}
