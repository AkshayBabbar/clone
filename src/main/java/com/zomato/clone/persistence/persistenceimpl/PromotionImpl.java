package com.zomato.clone.persistence.persistenceimpl;

import com.zomato.clone.model.PromotionEntity;
import com.zomato.clone.persistence.Promotion;

import java.util.Optional;

public class PromotionImpl implements Promotion {
    @Override
    public <S extends PromotionEntity> S save(S s) {
        return null;
    }

    @Override
    public <S extends PromotionEntity> Iterable<S> saveAll(Iterable<S> iterable) {
        return null;
    }

    @Override
    public Optional<PromotionEntity> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public Iterable<PromotionEntity> findAll() {
        return null;
    }

    @Override
    public Iterable<PromotionEntity> findAllById(Iterable<Long> iterable) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Long aLong) {

    }

    @Override
    public void delete(PromotionEntity promotionEntity) {

    }

    @Override
    public void deleteAll(Iterable<? extends PromotionEntity> iterable) {

    }

    @Override
    public void deleteAll() {

    }
}
