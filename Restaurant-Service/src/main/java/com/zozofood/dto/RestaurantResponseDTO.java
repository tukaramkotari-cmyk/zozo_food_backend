package com.zozofood.dto;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class RestaurantResponseDTO {
	
	private Long restaurantId;
	
	private String restaurantName;
	
	private AddressResponseDto addressResponseDto;
	
	private String restaurantPhone;
	
	private String restaurantEmail;
		
	private String restaurantOpeningHours;
	
	private double restaurantRating;
	
	private String restaurantStatus;
	
	

}
