package com.zomato.clone.omservice.serviceimpl;

import com.zomato.clone.model.PaymentEntity;
import com.zomato.clone.omservice.ClientExecutorParser;
import org.springframework.http.ResponseEntity;

public class ClientExecutorParserImpl implements ClientExecutorParser {


    @Override
    public PaymentEntity paymentExcuterParser(ResponseEntity<PaymentEntity> response) {
        PaymentEntity details =  response.getBody();
        return details;
    }

    @Override
    public void realTimeTrackingExecutorParser(ResponseEntity<String> response) {
        String validation = "Tracking has started";
        if (response.equals(validation)){
            System.out.println(validation);
        }
    }

    @Override
    public void ratingReviewExecutorParser(ResponseEntity<String> response) {


    }
}
