package com.zozofood.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AddressRequestDto {
	
	private String street;
	
	private String city;
	
	private String state;
	
	private String zipCode;
	
	private String country;

	
}
