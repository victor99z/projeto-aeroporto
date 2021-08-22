package com.udesc.aeroporto;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class AeroportoApplication {

	public static void main(String[] args) {
		SpringApplication.run(AeroportoApplication.class, args);
	}
}
