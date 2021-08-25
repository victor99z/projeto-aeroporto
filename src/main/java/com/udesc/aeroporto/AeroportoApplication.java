package com.udesc.aeroporto;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@EnableMongoRepositories(basePackages = "com.udesc.aeroporto.repository")
@SpringBootApplication
public class AeroportoApplication {

	public static void main(String[] args) {
		SpringApplication.run(AeroportoApplication.class, args);
	}
}
