package com.zomato.clone.controller;

import com.zomato.clone.model.CustomerEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {
    @PostMapping(path = "/enterDetails")

    public ResponseEntity enterDetails(@RequestBody CustomerEntity customerEntity) {

        if (true) {
            return new ResponseEntity<String>("Customer Details Entered.", HttpStatus.OK);
        } else {
            return ResponseEntity.status(HttpStatus.OK).body("Exception Occured : \n" + new Exception());
        }
    }

}
