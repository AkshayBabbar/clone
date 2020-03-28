package com.zomato.clone.persistence.repository;

import com.zomato.clone.model.OrderEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderManagementRepository extends CrudRepository<OrderEntity, Long> {
}
