package com.victorwu.springsecurity;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
// If controller is created outside of parent package(com.victorwu.springsecurity)
// Just an example in this case
@ComponentScan("com.victorwu.springsecurity.controller") // (optional)
public class BankBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(BankBackendApplication.class, args);
	}

}
