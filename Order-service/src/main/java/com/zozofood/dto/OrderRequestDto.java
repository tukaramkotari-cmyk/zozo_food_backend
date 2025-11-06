package com.zozofood.dto;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderRequestDto {

	
	private Long userId;
	
	private String recipentname;
	
	private Long restaurantId;
	
	private String contactEmail;
	
	private String contactPhone;
	
    private String shippingAddress;
		
	private List<OrderItemRequestDto> orderItems;
	

	
}
