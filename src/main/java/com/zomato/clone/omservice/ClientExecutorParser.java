package com.zomato.clone.omservice;

import com.zomato.clone.model.PaymentEntity;
import org.springframework.http.ResponseEntity;

public interface ClientExecutorParser {

    public PaymentEntity paymentExcuterParser(ResponseEntity<PaymentEntity> response );

    public void realTimeTrackingExecutorParser(ResponseEntity<String> response );

    public void ratingReviewExecutorParser(ResponseEntity<String> response);

}
