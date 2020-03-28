package com.zomato.clone.persistence.persistenceimpl;

import com.zomato.clone.model.OrderEntity;

import java.util.Optional;

public class OrderImpl implements com.zomato.clone.persistence.Order {
    @Override
    public <S extends OrderEntity> S save(S s) {
        return null;
    }

    @Override
    public <S extends OrderEntity> Iterable<S> saveAll(Iterable<S> iterable) {
        return null;
    }

    @Override
    public Optional<OrderEntity> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public Iterable<OrderEntity> findAll() {
        return null;
    }

    @Override
    public Iterable<OrderEntity> findAllById(Iterable<Long> iterable) {
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
    public void delete(OrderEntity orderEntity) {

    }

    @Override
    public void deleteAll(Iterable<? extends OrderEntity> iterable) {

    }

    @Override
    public void deleteAll() {

    }
}
