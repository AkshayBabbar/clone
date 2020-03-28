package com.zomato.clone.model;

import javax.persistence.*;

@Entity
@Table(name="CUSTOMER")
public class CustomerEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "customer_id")
    private Long customer_id;
    @Column(name = "cust_name")
    private String name;
    @Column(name = "address_id")
    private int address_id;
    @Column(name = "details")
    private String details;
    @Column(name = "order_id")
    private Long order_id;
    @Column(name = "type")
    private String paymentType;

    public Long getOrder_id() {
        return order_id;
    }

    public void setOrder_id(Long order_id) {
        this.order_id = order_id;
    }
    public String getDetails() {
        return details;
    }
    public void setDetails(String details) {
        this.details = details;
    }
    public String getPaymentType() {
        return paymentType;
    }
    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }
    public Long getCustomer_id() {
        return customer_id;
    }
    public void setCustomer_id(Long customer_id) {
        this.customer_id = customer_id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAddress_id() {
        return address_id;
    }
    public void setAddress_id(int address_id) {
        this.address_id = address_id;
    }
}