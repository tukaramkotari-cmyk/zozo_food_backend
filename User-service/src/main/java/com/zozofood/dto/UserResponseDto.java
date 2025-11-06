package com.zozofood.dto;

import java.util.Set;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
public class UserResponseDto {

	private long userId;
	private String userName;
	private String email;
	private String address;
	private Set<String> roles;
	private boolean isActive;
	
	
}
