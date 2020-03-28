package com.zomato.clone.omservice.serviceimpl;

import com.zomato.clone.commons.exception.OrderManagementException;
import com.zomato.clone.model.CustomerEntity;
import com.zomato.clone.model.OrderEntity;
import com.zomato.clone.omservice.ClientsHandler;
import com.zomato.clone.omservice.CustomerAndOrderHandler;
import com.zomato.clone.persistence.Customer;
import com.zomato.clone.persistence.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerAndOrderHandlerImpl implements CustomerAndOrderHandler {

    @Autowired
    Customer customer;

    @Autowired
    Order order;

    @Autowired
    ClientsHandler clientsHandler;

    @Override
    public void createCustomer(CustomerEntity customerEntity) throws OrderManagementException {
        try{
            customer.save(customerEntity);
        }
        catch(Exception ex){
            throw new OrderManagementException("Exception Occured while creating the Customer", ex);
        }
    }

    @Override
    public void handleOrder(OrderEntity orderEntity) throws OrderManagementException {
        try{
            order.save(orderEntity);
            CustomerEntity customerEntity = customer.findById(Long.parseLong(orderEntity.getCustomerId())).get();
            customerEntity.setOrder_id(orderEntity.getOrder_id());
            customer.save(customerEntity);
            clientsHandler.setOrderId(orderEntity.getOrder_id());

        }
        catch(Exception ex){
            throw new OrderManagementException("Exception occured while managing the order", ex);
        }
    }
}
