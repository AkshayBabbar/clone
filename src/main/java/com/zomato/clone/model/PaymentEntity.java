package com.zomato.clone.model;


import javax.persistence.*;

@Entity
@Table(name = "PAYMENT")
public class PaymentEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long transactionId;

    @Column(name = "pmt_type")
    private String paymentType;
    @Column(name = "details")
    private String details;
    @Column(name = "order_id")
    private Long order_id;
    @Column(name = "pmt_sts")
    private String payment_status;
    @Column(name = "price")
    private Float price;


    public String getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public Long getOrder_id() {
        return order_id;
    }

    public void setOrder_id(Long order_id) {
        this.order_id = order_id;
    }

    public String getPayment_status() {
        return payment_status;
    }

    public void setPayment_status(String payment_status) {
        this.payment_status = payment_status;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public Long getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(Long transactionId) {
        this.transactionId = transactionId;
    }
}
