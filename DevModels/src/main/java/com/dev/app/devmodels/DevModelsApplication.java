package com.dev.app.devmodels;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@EnableJpaRepositories(basePackages = "com.dev.app.repository")
@EntityScan(basePackages = "com.dev.app.model")
@SpringBootApplication(scanBasePackages = "com.dev.app")
public class DevModelsApplication {
	public static void main(String[] args) {
		SpringApplication.run(DevModelsApplication.class, args);
	}
}
