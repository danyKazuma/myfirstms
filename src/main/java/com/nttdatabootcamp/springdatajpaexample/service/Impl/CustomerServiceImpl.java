package com.nttdatabootcamp.springdatajpaexample.service.Impl;

import com.nttdatabootcamp.springdatajpaexample.entity.Customer;
import com.nttdatabootcamp.springdatajpaexample.repository.CustomerRepository;
import com.nttdatabootcamp.springdatajpaexample.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public List<Customer> getAllCustomers() {
        return customerRepository.findAll();
    }

    @Override
    public List<Customer> findCustomerByName(String name) {
        return customerRepository.findCustomerByName(name);
    }

    @Override
    public List<Customer> getCustomersName(String name) {
        return customerRepository.findCustomerByName(name);
    }

    @Override
    public Customer createNewCustomer(Customer customer) {
        customer.setId(UUID.randomUUID().toString());
        return customerRepository.save(customer);
    }
}
