package com.zomato.clone.client.impl;

import com.zomato.clone.client.PaymentGatewayClient;
import com.zomato.clone.commons.constants.OrderMgmtConstants;
import com.zomato.clone.model.PaymentDetails;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class PaymentGatewayClientImpl implements PaymentGatewayClient {

    private String uri = OrderMgmtConstants.baseUrl + "/payment/orderPayment";

    @Override
    public ResponseEntity<PaymentDetails> startPaymentTransaction(PaymentDetails paymentEntity) {

        RestTemplate restTemplate = new RestTemplate();
        HttpEntity<PaymentDetails> entity = new HttpEntity<PaymentDetails>(paymentEntity);
        ResponseEntity<PaymentDetails> response = restTemplate.exchange(uri, HttpMethod.POST, entity, PaymentDetails.class);
        return response;
    }
}
