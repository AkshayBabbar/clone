package com.zomato.clone.client.impl;

import com.zomato.clone.client.PaymentGatewayClient;
import com.zomato.clone.commons.constants.OrderMgmtConstants;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class PaymentGatewayClientImpl implements PaymentGatewayClient {

    private String uri = OrderMgmtConstants.baseUrl + "/payment/orderPayment";

    @Override
    public ResponseEntity<String> paymentDetails(Long order_id) {

        RestTemplate restTemplate = new RestTemplate();
        HttpEntity<Long> entity = new HttpEntity<Long>(order_id);
        ResponseEntity<String> response = restTemplate.exchange(uri, HttpMethod.POST, entity, String.class);
        return response;
    }
}
