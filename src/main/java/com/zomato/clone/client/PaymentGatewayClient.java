package com.zomato.clone.client;

import com.zomato.clone.model.PaymentEntity;
import org.springframework.http.ResponseEntity;

public interface PaymentGatewayClient {

public ResponseEntity<PaymentEntity> paymentDetails(PaymentEntity paymentEntity);
}
