package com.zozofood.dto;

import java.util.List;



import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor

public class RestaurantCreationRequestDto {
	
	private String restaurantName;
	
	private AddressRequestDto restaurantAddress;
	
	private String restaurantPhone;
	
	private String restaurantEmail;
		
	private String restaurantOpeningHours;
	
//	private List<itemRequestDto> restaurantMenu;
	
	

}
