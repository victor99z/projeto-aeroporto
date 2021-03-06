package com.udesc.aeroporto;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EntityScan(basePackages = {
		"com.udesc.aeroporto.model"
})
@EnableJpaRepositories(basePackages = {
		"com.udesc.aeroporto.repository"
})
@EnableMongoRepositories(basePackages = {
		"com.udesc.aeroporto.repositoryMongo"
})
public class AeroportoApplication {

	public static void main(String[] args) {
		SpringApplication.run(AeroportoApplication.class, args);
	}
}
