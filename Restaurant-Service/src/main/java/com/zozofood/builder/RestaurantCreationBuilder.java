package com.zozofood.builder;

import org.springframework.beans.BeanUtils;

import com.zozofood.dto.AddressRequestDto;
import com.zozofood.dto.RestaurantCreationRequestDto;
import com.zozofood.model.Address;
import com.zozofood.model.Restaurant;

public class RestaurantCreationBuilder {
	
	public static Restaurant buildRestaurantFromRestaurantCreationRequestDto( RestaurantCreationRequestDto RestaurantCreationDto) {
		
		return  Restaurant.builder()
		          .restaurantName(RestaurantCreationDto.getRestaurantName())
		          .restaurantAddress(mapAddressFromAddressRequestDto(RestaurantCreationDto.getRestaurantAddress()))
		          .restaurantPhone(RestaurantCreationDto.getRestaurantPhone())
		          .restaurantEmail(RestaurantCreationDto.getRestaurantEmail())
		          .restaurantOpeningHours(RestaurantCreationDto.getRestaurantOpeningHours())
		          .build();
		
		
	}
	
	
	private static Address mapAddressFromAddressRequestDto(AddressRequestDto addressRequestDto) {
		Address address = new Address();
		BeanUtils.copyProperties(addressRequestDto, address);
		
		return address;
	}
	

}
