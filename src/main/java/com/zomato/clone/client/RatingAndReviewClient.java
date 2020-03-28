package com.zomato.clone.client;

import org.springframework.http.ResponseEntity;

public interface RatingAndReviewClient {
    public ResponseEntity<String> rateAndReviewOrder(Long orderId);
}
