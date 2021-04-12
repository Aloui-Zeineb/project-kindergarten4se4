package com.example.kindergarten1.controller;

import com.example.kindergarten1.service.CheckoutServiceK;
import com.example.kindergarten1.subscription.SubscriptionsK;
import com.example.kindergarten1.subscription.SubscriptionsResponseK;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin("http://localhost:4200")
@RestController
@RequestMapping("/api/checkoutK")

public class CheckoutControllerK {

@Autowired
        private CheckoutServiceK checkoutServiceK;

       /* public CheckoutControllerK (CheckoutServiceK checkoutServiceK) {
            this.checkoutServiceK = checkoutServiceK;
        }*/

        @PostMapping("/subscriptionsK")
        public SubscriptionsResponseK placeOrder(@RequestBody SubscriptionsK subscriptionsK) {

            SubscriptionsResponseK subscriptionsResponseK = checkoutServiceK.placeOrderK(subscriptionsK);

            return subscriptionsResponseK;
        }

    }

