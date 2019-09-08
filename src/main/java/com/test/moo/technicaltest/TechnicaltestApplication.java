package com.test.moo.technicaltest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jdbc.repository.config.EnableJdbcRepositories;

@SpringBootApplication
@EnableJdbcRepositories
public class TechnicaltestApplication {

	public static void main(String[] args) {
		SpringApplication.run(TechnicaltestApplication.class, args);
	}

}
