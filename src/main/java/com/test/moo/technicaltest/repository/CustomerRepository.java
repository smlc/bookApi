package com.test.moo.technicaltest.repository;

import com.test.moo.technicaltest.domain.Customer;
import java.time.Instant;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;

/**
 * Service for mock database repository
 */
@Service
public class CustomerRepository {

  List<Customer> customers = Arrays.asList(
      new Customer("Marlon", "Siesa", 26,
          Instant.parse("1993-05-14T00:00:00.00Z"), "marlon@email.com", "Route Seysses",
          "France"),
      new Customer("Flora", "Jou", 26,
          Instant.parse("1993-01-15T00:00:00.00Z"), "flo@email.com", "Route Seysses",
          "France")

  );

  public Optional<Customer> getBySurname(String surname) {
    return customers.stream()
          .filter( customer -> customer.getSurname().toLowerCase().equals(surname.toLowerCase()))
          .findFirst();
  }
}
