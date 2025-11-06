package com.zozofood.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class itemRequestDto {
	
	private String itemName;
	
	private String itemDescription;
	
	private double itemPrice;
	
	private String itemCategory;
	
	private String type;

}
