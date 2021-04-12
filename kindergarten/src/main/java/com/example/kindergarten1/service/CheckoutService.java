package com.example.kindergarten1.service;


import com.example.kindergarten1.subscription.Subscriptions;
import com.example.kindergarten1.subscription.SubscriptionsResponse;

public interface CheckoutService {

    SubscriptionsResponse placeOrder (Subscriptions subscriptions);

}