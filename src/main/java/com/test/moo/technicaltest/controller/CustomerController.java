package com.test.moo.technicaltest.controller;

import com.test.moo.technicaltest.domain.Customer;
import com.test.moo.technicaltest.repository.CustomerRepository;
import java.util.Optional;
import java.util.function.Supplier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {

  @Autowired
  CustomerRepository customerRepository;

  @GetMapping("/search/customer/")
  public ResponseEntity<Customer> searchCustomer(@RequestParam(name = "surname") String surname) {
    Optional<Customer> customer = customerRepository.getBySurname(surname);

    return (ResponseEntity)customer.map(customer1 -> ResponseEntity.ok(customer1))
       .orElse(new ResponseEntity(HttpStatus.NOT_FOUND));

  }

}
