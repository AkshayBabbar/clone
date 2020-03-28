package com.zomato.clone.model;

import javax.persistence.*;
import java.sql.Time;

@Entity
@Table(name="PROMOTION")
public class PromotionEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long promo_id;
    private String promo_code;
    private java.util.Date createDate;
    private java.util.Date endDate;

    private String order_id;

    public PromotionEntity(Long promo_id, String promo_code, String order_id) {
        this.promo_id = promo_id;
        this.promo_code = promo_code;
        this.order_id = order_id;
    }

    public PromotionEntity() {
    }

    public Long getPromo_id() {
        return promo_id;
    }

    public void setPromo_id(Long promo_id) {
        this.promo_id = promo_id;
    }

    public String getPromo_code() {
        return promo_code;
    }

    public void setPromo_code(String promo_code) {
        this.promo_code = promo_code;
    }

    public java.util.Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(java.util.Date createDate) {
        this.createDate = createDate;
    }

    public java.util.Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Time endDate) {
        this.endDate = endDate;
    }

    public String getOrder_id() {
        return order_id;
    }

    public void setOrder_id(String order_id) {
        this.order_id = order_id;
    }
}
