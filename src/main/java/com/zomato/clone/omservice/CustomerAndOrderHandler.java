package com.zomato.clone.omservice;

import com.zomato.clone.commons.exception.OrderManagementException;
import com.zomato.clone.model.CustomerEntity;
import com.zomato.clone.model.OrderEntity;

public interface CustomerAndOrderHandler {
    public void createCustomer(CustomerEntity customerEntity) throws OrderManagementException;
    public void handleOrder(OrderEntity orderEntity) throws OrderManagementException;
}
