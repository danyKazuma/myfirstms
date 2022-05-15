package com.nttdatabootcamp.springdatajpaexample.service;

import com.nttdatabootcamp.springdatajpaexample.entity.Customer;

import java.util.List;

public interface CustomerService {
    List<Customer> getAllCustomers();
    List<Customer> findCustomerByName(String name);

    List<Customer> getCustomersName(String name);

    Customer createNewCustomer(Customer customer);
}
