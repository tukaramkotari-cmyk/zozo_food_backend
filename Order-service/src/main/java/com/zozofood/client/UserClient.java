package com.zozofood.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.zozofood.dto.UserDto;

@FeignClient(name = "UserManagment") //, url = "http://localhost:8082/user"
public interface UserClient {
	
	@GetMapping("/users/{id}")
	ResponseEntity<UserDto> getUserById(@PathVariable Integer userId);

}
