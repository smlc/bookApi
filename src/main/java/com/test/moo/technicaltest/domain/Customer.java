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

  public Customer(String firstName, String surname, int age, Instant birthDay, String email,
      String address, String country) {
    this.firstName = firstName;
    this.surname = surname;
    this.age = age;
    this.birthDay = birthDay;
    this.email = email;
    this.address = address;
    this.country = country;
  }
}