package com.circleci.demojavaspring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoJavaSpringApplication {

	public static void main(String[] args) {
	    System.out.println("this is infinity start");
		SpringApplication.run(DemoJavaSpringApplication.class, args);
	}
}
