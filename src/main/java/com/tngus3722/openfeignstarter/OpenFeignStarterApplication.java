package com.tngus3722.openfeignstarter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients(basePackages = "com.tngus3722.openfeignstarter.client")
@SpringBootApplication
public class OpenFeignStarterApplication {

	public static void main(String[] args) {
		SpringApplication.run(OpenFeignStarterApplication.class, args);
	}

}
