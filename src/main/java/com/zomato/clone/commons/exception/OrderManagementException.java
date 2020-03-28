package com.zomato.clone.commons.exception;

public class OrderManagementException extends Exception{
    public OrderManagementException(String message, Throwable ex){
        super(message,ex);
    }
}
