package com.example.kindergarten.service;


import com.example.kindergarten.subscription.Subscriptions;
import com.example.kindergarten.subscription.SubscriptionsResponse;

public interface CheckoutService {

    SubscriptionsResponse placeOrder (Subscriptions subscriptions);

}