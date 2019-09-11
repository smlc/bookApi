package com.test.moo.technicaltest.controller;

import com.test.moo.technicaltest.domain.Customer;
import com.test.moo.technicaltest.repository.CustomerRepository;
import java.util.Optional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {

  private final Logger log = LoggerFactory.getLogger(CustomerController.class);

  @Autowired
  CustomerRepository customerRepository;

  @GetMapping("/search/customer/")
  public ResponseEntity<Customer> searchCustomer(@RequestParam(name = "surname") String surname) {

    log.info("Request for search {} customer ", surname);

    Optional<Customer> maybeCustomer = customerRepository.getBySurname(surname);

    return (ResponseEntity)maybeCustomer.map(customer -> ResponseEntity.ok(customer))
       .orElse(new ResponseEntity(String.format("The customer %s is not found on the address book", surname),HttpStatus.NOT_FOUND));

  }

}
