package com.test.moo.technicaltest.domain;


import java.time.Instant;
import org.springframework.data.annotation.Id;

public class Customer {

  @Id
  private Long id;

  private String firstName;

  private String surname;

  private int age;

  private Instant birthDay;

  private String email;

  private String address;

  private String country;

}
