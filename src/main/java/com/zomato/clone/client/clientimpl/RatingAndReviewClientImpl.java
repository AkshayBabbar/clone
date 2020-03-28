package com.zomato.clone.client.clientimpl;

import com.zomato.clone.client.RatingAndReviewClient;
import com.zomato.clone.commons.constants.OrderMgmtConstants;
import com.zomato.clone.model.DeliveryDetails;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class RatingAndReviewClientImpl implements RatingAndReviewClient {
    private String url= OrderMgmtConstants.baseUrl+"/rating/sendId";

    @Override
    public ResponseEntity<String> rateAndReviewOrder(Long orderId) {
        RestTemplate restTemplate = new RestTemplate();
        HttpEntity<Long> entity = new HttpEntity<Long>(orderId);
        ResponseEntity<String> response = restTemplate.exchange(url, HttpMethod.POST,entity, String.class);
        return response;
    }
}
