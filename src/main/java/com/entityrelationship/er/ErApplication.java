package com.entityrelationship.er;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = "com.entityrelationship.er.model")
public class ErApplication {

	public static void main(String[] args) {
		SpringApplication.run(ErApplication.class, args);
	}

}
