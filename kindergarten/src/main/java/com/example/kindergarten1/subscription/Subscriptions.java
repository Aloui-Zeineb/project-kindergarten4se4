package com.example.kindergarten1.subscription;

import com.example.kindergarten1.entity.Adress;
import com.example.kindergarten1.entity.Order;
import com.example.kindergarten1.entity.OrderItem;
import com.example.kindergarten1.entity.Parent;
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
