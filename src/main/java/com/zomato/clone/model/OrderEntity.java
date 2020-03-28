package com.zomato.clone.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="ORDER")
public class OrderEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long order_id;
    @Column(name = "item")
    private String item;
    @Column(name = "quantity")
    private int quantity;
    @Column(name = "deliver_id")
    private String delivery_id;
    @Column(name = "status")
    private char status;
    @Column(name = "price")
    private double cost;
    @OneToOne
    @JoinColumn(name = "transaction_id")
    private String transaction_id;
    @OneToOne
    @JoinColumn(name ="customer_id")
    private String customerId;

    @Column(name = "upd_date")
    private java.util.Date updated;
    @Column(name = "cre_date")
    private java.util.Date created;
    private String rating;
    private String review;

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getReview() {
        return review;
    }

    public void setReview(String review) {
        this.review = review;
    }

    public Long getOrder_id() {
        return order_id;
    }

    public void setOrder_id(Long order_id) {
        this.order_id = order_id;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getDelivery_id() {
        return delivery_id;
    }

    public void setDelivery_id(String delivery_id) {
        this.delivery_id = delivery_id;
    }

    public char getStatus() {
        return status;
    }

    public void setStatus(char status) {
        this.status = status;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }


    public String getTransaction_id() {
        return transaction_id;
    }

    public void setTransaction_id(String transaction_id) {
        this.transaction_id = transaction_id;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public Date getUpdated() {
        return updated;
    }

    public void setUpdated(Date updated) {
        this.updated = updated;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }


}