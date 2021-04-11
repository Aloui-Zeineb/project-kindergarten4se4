package com.example.kindergarten.controller;

import com.example.kindergarten.service.CheckoutService;
import com.example.kindergarten.subscription.Subscriptions;
import com.example.kindergarten.subscription.SubscriptionsResponse;
import org.springframework.web.bind.annotation.*;


@CrossOrigin("http://localhost:4200")
@RestController
@RequestMapping("/api/checkout")
public class CheckoutController {

    private CheckoutService checkoutService;

    public CheckoutController(CheckoutService checkoutService) {
        this.checkoutService = checkoutService;
    }

    @PostMapping("/subscriptions")
    public SubscriptionsResponse placeOrder(@RequestBody Subscriptions subscriptions) {

        SubscriptionsResponse subscriptionsResponse = checkoutService.placeOrder(subscriptions);

        return subscriptionsResponse;
    }

}