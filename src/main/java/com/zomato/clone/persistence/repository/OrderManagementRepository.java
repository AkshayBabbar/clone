package com.zomato.clone.persistence.repository;

import com.zomato.clone.model.Order;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderManagementRepository extends CrudRepository<Order, Long> {
}
