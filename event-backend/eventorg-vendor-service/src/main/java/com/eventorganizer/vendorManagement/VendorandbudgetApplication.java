package com.eventorganizer.vendorManagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class VendorandbudgetApplication {

	public static void main(String[] args) {
		SpringApplication.run(VendorandbudgetApplication.class, args);
	}

}
