package com.zozofood;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class RestaurantManagmentApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestaurantManagmentApplication.class, args);
	}

}
