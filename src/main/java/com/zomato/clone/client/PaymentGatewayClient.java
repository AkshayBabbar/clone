package com.zomato.clone.client;

import com.zomato.clone.model.PaymentDetails;
import org.springframework.http.ResponseEntity;

public interface PaymentGatewayClient {

public ResponseEntity<PaymentDetails> startPaymentTransaction(PaymentDetails paymentDetails);
}
