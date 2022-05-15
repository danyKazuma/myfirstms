package com.nttdatabootcamp.springdatajpaexample.repository;

import com.nttdatabootcamp.springdatajpaexample.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer, String> {
    List<Customer> findAll();

    List<Customer> findCustomerByName(String name);
}
