package com.test.moo.technicaltest.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;



@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class CustomerControllerITest {

  @Autowired
  private MockMvc customerControllerMockMvc;

  public void checkGetCustomerBySurname() throws Exception {

    customerControllerMockMvc
        .perform(get("/customer/1"))
        .andDo(print())
        .andExpect(status().isOk());
        //.andExpect();
  }
}
