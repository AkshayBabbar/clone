package com.zomato.clone.controller;

import com.zomato.clone.model.OrderEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {
    @PostMapping(path = "/placeOrder")
    public ResponseEntity placeOrder(@RequestBody OrderEntity orderEntity) {
        if (true) {
            return new ResponseEntity<String>("Order Placed", HttpStatus.OK);
        } else {
            return ResponseEntity.status(HttpStatus.OK).body("Exception Occured : \n" + new Exception());
        }
    }
}
