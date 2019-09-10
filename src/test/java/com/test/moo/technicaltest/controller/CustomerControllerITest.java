package com.test.moo.technicaltest.controller;


import static org.junit.Assert.assertEquals;

import com.test.moo.technicaltest.domain.Customer;
import com.test.moo.technicaltest.repository.CustomerRepository;
import java.net.URI;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.util.UriComponentsBuilder;


@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class CustomerControllerITest {

  @Autowired
  private TestRestTemplate restTemplate;

  @Autowired
  CustomerRepository customerRepository;

  @LocalServerPort
  private int port;

  @Test
  public void checkGetCustomerBySurname() throws Exception {
    String url = "http://localhost:" + port;

    URI uri = UriComponentsBuilder.fromHttpUrl(url)
        .path("/search/customer/")
        .queryParam("surname", "Siesa").build().toUri();

    ResponseEntity<Customer> actualResponse = restTemplate
        .getForEntity(uri, Customer.class);

    assertEquals("Siesa", actualResponse.getBody().getSurname());
    assertEquals(HttpStatus.OK, actualResponse.getStatusCode());
  }
}
