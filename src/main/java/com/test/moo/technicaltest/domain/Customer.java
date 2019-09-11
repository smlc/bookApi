package com.test.moo.technicaltest.domain;


import java.time.Instant;

public class Customer {

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

  public Customer() {
  }

  public String getSurname() {
    return surname;
  }

  public String getFirstName() {
    return firstName;
  }

  public int getAge() {
    return age;
  }

  public Instant getBirthDay() {
    return birthDay;
  }

  public String getEmail() {
    return email;
  }

  public String getAddress() {
    return address;
  }

  public String getCountry() {
    return country;
  }
}