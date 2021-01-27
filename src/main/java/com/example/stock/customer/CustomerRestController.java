package com.example.stock.customer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/customer")
public class CustomerRestController {

    @Autowired
    CustomerMapper customerMapper;

    @PostMapping
    public ResponseEntity<Customer> save(@RequestBody Customer customer){
        customerMapper.save(customer);
        return new ResponseEntity<>(customer, HttpStatus.OK);
    }
}
