package com.zomato.clone.persistence.repository;

import com.zomato.clone.model.PromotionEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PromotionRepository extends CrudRepository<PromotionEntity, Long> {
}
