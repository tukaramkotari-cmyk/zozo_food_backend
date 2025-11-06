package com.zozofood.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "RestaurantManagment") //, url = "http://localhost:8081/restaurant"
public interface RestaurantClient {

	@GetMapping("/items/{itemId}")
	public ResponseEntity<Double> getItemPriceById(@PathVariable Long itemid);
	

	
}
