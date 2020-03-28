package com.zomato.clone.model;

import javax.persistence.*;

@Entity
@Table(name="CUSTOMER")
public class CustomerEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long customer_id;
    private String name;
    private int address_id;

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



    public CustomerEntity(Long customer_id, String name, int address_id) {
        this.customer_id = customer_id;
        this.name = name;
        this.address_id = address_id;
    }
}