package com.zomato.clone.persistence.persistenceimpl;

import com.zomato.clone.model.CustomerEntity;
import com.zomato.clone.persistence.Customer;

import java.util.Optional;

public class CustomerImpl implements Customer {
    @Override
    public <S extends CustomerEntity> S save(S s) {
        return null;
    }

    @Override
    public <S extends CustomerEntity> Iterable<S> saveAll(Iterable<S> iterable) {
        return null;
    }

    @Override
    public Optional<CustomerEntity> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public Iterable<CustomerEntity> findAll() {
        return null;
    }

    @Override
    public Iterable<CustomerEntity> findAllById(Iterable<Long> iterable) {
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
    public void delete(CustomerEntity customerEntity) {

    }

    @Override
    public void deleteAll(Iterable<? extends CustomerEntity> iterable) {

    }

    @Override
    public void deleteAll() {

    }
}
