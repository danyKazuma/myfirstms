package com.nttdatabootcamp.springdatajpaexample.controller;

import com.nttdatabootcamp.springdatajpaexample.entity.Customer;
import com.nttdatabootcamp.springdatajpaexample.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value="/customer")
public class CustomerController {
    @Autowired
    private CustomerService customerService;

    @GetMapping(value="/all")
    private List<Customer> listAllCustomers(){
        return customerService.getAllCustomers();
    }
    @PostMapping(value="/create")
    private String createCustomer(@RequestBody Customer customer){
        String createCustomerErrorMessage ="La aplicacion no pudo crear al usuario";
        String createCustomerSuccessMessage ="La aplicacion creo satisfactoriamente al usuario";
        return customerService.createNewCustomer(customer)==null ? createCustomerErrorMessage : createCustomerSuccessMessage;
    }
}
