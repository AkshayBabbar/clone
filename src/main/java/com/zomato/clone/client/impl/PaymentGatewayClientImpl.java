package com.zomato.clone.client.impl;

import com.zomato.clone.client.PaymentGatewayClient;
import com.zomato.clone.commons.constants.OrderMgmtConstants;
import com.zomato.clone.model.PaymentEntity;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class PaymentGatewayClientImpl implements PaymentGatewayClient {

    private String uri = OrderMgmtConstants.baseUrl + "/payment/orderPayment";

    @Override
    public ResponseEntity<PaymentEntity> paymentDetails(PaymentEntity paymentEntity) {

        RestTemplate restTemplate = new RestTemplate();
        HttpEntity<PaymentEntity> entity = new HttpEntity<PaymentEntity>(paymentEntity);
        ResponseEntity<PaymentEntity> response = restTemplate.exchange(uri, HttpMethod.POST, entity, PaymentEntity.class);
        return response;
    }
}
