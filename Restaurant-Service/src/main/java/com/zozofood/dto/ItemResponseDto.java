package com.zozofood.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ItemResponseDto {

	private Long itemId;

	private String itemName;

	private String itemDescription;

	private double itemPrice;

	private String itemCategory;

	private String itemType;

	private boolean itemAvailable;

	private Long restaurantId;

	private double itemRating;

}
