package com.victorwu.springsecurity;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
// If controller is created outside of parent package(com.victorwu.springsecurity)
// Not required here since it is in same parent package
// Once defined, you have to define other package
// if used to define controller, you have to define config package as well
//@ComponentScan("com.victorwu.springsecurity.controller") // (optional)
public class BankBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(BankBackendApplication.class, args);
	}

}
