package com.example.kindergarten.subscription;

import com.example.kindergarten.entity.Adress;
import com.example.kindergarten.entity.Order;
import com.example.kindergarten.entity.OrderItem;
import com.example.kindergarten.entity.Parent;
import lombok.Data;
import java.util.Set;
@Data
public class Subscriptions {
    private Parent parent;
    private Adress childAddress;
    private Adress billingAddress;
    private Order order;
    private Set<OrderItem> orderItems;
}
