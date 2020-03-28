package com.zomato.clone.client;

import com.zomato.clone.model.DeliveryDetails;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ResponseBody;

public interface RealTimeTrackingClient {
    public ResponseEntity<String> startRealTimeTracking(DeliveryDetails request);
}
