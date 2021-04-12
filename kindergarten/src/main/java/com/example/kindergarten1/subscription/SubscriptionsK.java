package com.example.kindergarten1.subscription;
import com.example.kindergarten1.entity.AdressK;
import com.example.kindergarten1.entity.Agent;
import com.example.kindergarten1.entity.OrderItemK;
import com.example.kindergarten1.entity.OrderK;
import lombok.Data;

import java.util.Set;

@Data
public class SubscriptionsK {
    private Agent agent;
    private AdressK kindergartenAddressK;
    private AdressK billingAddressK;
    private OrderK orderK;
    private Set<OrderItemK> orderItemsK;
}