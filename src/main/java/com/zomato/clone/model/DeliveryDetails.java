package com.zomato.clone.model;


import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "DELIVERY")
public class DeliveryDetails {

    private Long delivery_id;
    private String addressId;
    private String assets;
    private String paymentType;




}
