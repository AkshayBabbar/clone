package com.zomato.clone.model;


import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "DELIVERY")
public class DeliveryDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long delivery_id;
    @Column(name = "address")
    private String addressId;
    @Column(name = "assets")
    private String assets;
    @ManyToOne
    @JoinColumn(name ="order_id")
    private Long order_id;
    @Column(name = "pmt_type")
    private String paymentType;

    @Column(name = "upd_date")
    private java.util.Date updated;
    @Column(name = "cre_date")
    private java.util.Date created;

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

    public Long getDelivery_id() {
        return delivery_id;
    }

    public void setDelivery_id(Long delivery_id) {
        this.delivery_id = delivery_id;
    }

    public String getAddressId() {
        return addressId;
    }

    public void setAddressId(String addressId) {
        this.addressId = addressId;
    }

    public String getAssets() {
        return assets;
    }

    public void setAssets(String assets) {
        this.assets = assets;
    }

    public String getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }

    public Long getOrder_id() {
        return order_id;
    }

    public void setOrder_id(Long order_id) {
        this.order_id = order_id;
    }
}
