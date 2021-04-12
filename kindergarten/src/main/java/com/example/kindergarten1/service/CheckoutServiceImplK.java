package com.example.kindergarten1.service;

import com.example.kindergarten1.entity.Agent;
import com.example.kindergarten1.entity.OrderItemK;
import com.example.kindergarten1.entity.OrderK;
import com.example.kindergarten1.repository.AgentRepository;
import com.example.kindergarten1.subscription.SubscriptionsK;
import com.example.kindergarten1.subscription.SubscriptionsResponseK;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Set;
import java.util.UUID;


@Service

public class CheckoutServiceImplK implements CheckoutServiceK {
@Autowired
        private AgentRepository agentRepository;

        /*public CheckoutServiceImplK(AgentRepository agentRepository) {
            this.agentRepository = agentRepository;
        }*/

        @Override
        @Transactional
        public SubscriptionsResponseK placeOrderK(SubscriptionsK subscriptionsK) {


            OrderK orderK = subscriptionsK.getOrderK();


            String orderTrackingNumber = generateOrderTrackingNumber();
            orderK.setOrderTrackingNumber(orderTrackingNumber);


            Set<OrderItemK> orderItemsK = subscriptionsK.getOrderItemsK();
            orderItemsK.forEach(item -> orderK.add(item));


            orderK.setBillingAddressK(subscriptionsK.getBillingAddressK());
            orderK.setKindergartenAddressK(subscriptionsK.getKindergartenAddressK());

            Agent agent = subscriptionsK.getAgent();
            agent.add(orderK);

            // save to the database
            agentRepository.save(agent);

            // return a response
            return new SubscriptionsResponseK(orderTrackingNumber);
        }

        private String generateOrderTrackingNumber() {

            // generate a random UUID number (UUID version-4)
            // For details see: https://en.wikipedia.org/wiki/Universally_unique_identifier
            //
            return UUID.randomUUID().toString();
        }
}