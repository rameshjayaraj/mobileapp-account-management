package com.mobileapp.account.management;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class MobileappAccountManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(MobileappAccountManagementApplication.class, args);
	}

}
