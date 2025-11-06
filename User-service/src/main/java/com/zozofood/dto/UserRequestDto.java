package com.zozofood.dto;

import java.util.Set;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor	
@NoArgsConstructor
@Builder
public class UserRequestDto {
	
	
	private long userId;
	private String userName;
	private String email;
	private String password;
	private String address;
	private Set<String> roles;
	private boolean isActive;
	

}
