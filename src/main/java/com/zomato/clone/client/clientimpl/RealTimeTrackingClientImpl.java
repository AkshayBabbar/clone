package com.zomato.clone.client.clientimpl;

import com.zomato.clone.client.RealTimeTrackingClient;
import com.zomato.clone.commons.constants.OrderMgmtConstants;
import com.zomato.clone.model.DeliveryDetails;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

@Component
public class RealTimeTrackingClientImpl implements RealTimeTrackingClient {
    private String url= OrderMgmtConstants.baseUrl+"/tracking/sendDetails";

    @Override
    public ResponseEntity<String> startRealTimeTracking(DeliveryDetails requestBody) {
        RestTemplate restTemplate = new RestTemplate();
        HttpEntity<DeliveryDetails> entity = new HttpEntity<DeliveryDetails>(requestBody);
        ResponseEntity<String> response = restTemplate.exchange(url, HttpMethod.POST,entity, String.class);
        return response;
    }
}
