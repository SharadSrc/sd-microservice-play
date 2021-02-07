package com.sdmicroserviceproj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories("com.sdmicroserviceproj.repository")
public class Application {

	
	public static void main(String[] args) {
		SpringApplication.run(com.sdmicroserviceproj.Application.class, args);
	}
	
	public void run() {
	}
}
