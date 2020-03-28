package com.zomato.clone.omservice.serviceimpl;

import com.zomato.clone.client.PaymentGatewayClient;
import com.zomato.clone.client.RatingAndReviewClient;
import com.zomato.clone.client.RealTimeTrackingClient;
import com.zomato.clone.model.CustomerEntity;
import com.zomato.clone.model.DeliveryDetails;
import com.zomato.clone.model.OrderEntity;
import com.zomato.clone.model.PaymentDetails;
import com.zomato.clone.omservice.ClientsHandler;
import com.zomato.clone.persistence.Customer;
import com.zomato.clone.persistence.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

public class ClientsHandlerImpl implements ClientsHandler {
    private Long orderId;

    @Autowired
    PaymentGatewayClient paymentGatewayClient;

    @Autowired
    RatingAndReviewClient ratingAndReviewClient;

    @Autowired
    RealTimeTrackingClient realTimeTrackingClient;

    @Autowired
    Order order;

    @Autowired
    Customer customer;

    @Override
    public void orderRating() {
      ResponseEntity<String> response = ratingAndReviewClient.rateAndReviewOrder(orderId);
    }

    @Override
    public void orderTracking() {
        ResponseEntity<String> response = realTimeTrackingClient.startRealTimeTracking(createDeliveryDetails());
    }

    @Override
    public void orderPayment() {
        OrderEntity orderEntity = order.findById(orderId).get();
        CustomerEntity customerEntity = customer.findById(Long.parseLong(orderEntity.getCustomerId())).get();
        PaymentDetails paymentDetails = new PaymentDetails();
        paymentDetails.setDetails(customerEntity.getDetails());
        paymentDetails.setOrder_id(orderId);
        paymentDetails.setPaymentType(customerEntity.getPaymentType());
        paymentDetails.setPrice(orderEntity.getCost());
        ResponseEntity<PaymentDetails> response = paymentGatewayClient.startPaymentTransaction(paymentDetails);
        if(response.getBody().getPayment_status().equals("Success")){
            orderEntity.setStatus('S');
        }
        else
        {
            orderEntity.setStatus('F');
        }
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    private DeliveryDetails createDeliveryDetails(){
        DeliveryDetails deliveryDetails =new DeliveryDetails();
        deliveryDetails.setOrder_id(orderId);
        return deliveryDetails;
    }
}
