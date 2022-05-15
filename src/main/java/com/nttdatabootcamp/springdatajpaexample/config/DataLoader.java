package com.nttdatabootcamp.springdatajpaexample.config;

import com.nttdatabootcamp.springdatajpaexample.entity.Customer;
import com.nttdatabootcamp.springdatajpaexample.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    private CustomerService customerService;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        customerService.createNewCustomer(Customer.builder()
                        .id("")
                        .name("")
                        .sApellidoMaterno("")
                        .sApellidoPaterno("")
                        .iEdad(0)
                        .sDireccion("")
                        .sDistrito("")
                        .sTelefono("")
                        .sDocumentType("")
                        .sDocumentNumber("")
                        .sEstado("")
                        .bEnable(true)
                .build());

        customerService.createNewCustomer(Customer.builder()
                .id(UUID.randomUUID().toString())
                .name("danny")
                .sApellidoMaterno("")
                .sApellidoPaterno("")
                .iEdad(0)
                .sDireccion("")
                .sDistrito("")
                .sTelefono("")
                .sDocumentType("")
                .sDocumentNumber("")
                .sEstado("")
                .bEnable(true)
                .build());
    }
}
