package com.zomato.clone.client;

import org.springframework.http.ResponseEntity;

public interface PaymentGatewayClient {

public ResponseEntity<String> paymentDetails(Long order_id);
}
