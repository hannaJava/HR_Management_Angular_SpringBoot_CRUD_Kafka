package com.example.teamProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class HRManagementEmployeeApplication {

	public static void main(String[] args) {
		SpringApplication.run(HRManagementEmployeeApplication.class, args);
	}

}
