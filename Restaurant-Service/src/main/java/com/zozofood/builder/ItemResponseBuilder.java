package com.zozofood.builder;

import java.util.ArrayList;
import java.util.List;

import com.zozofood.dto.ItemResponseDto;
import com.zozofood.model.Item;

public class ItemResponseBuilder {
	
	public static List<ItemResponseDto> itemRespBuilderFromItemResponseDto(List<Item> itemsList) {
		List<ItemResponseDto> itemResponseDtoList = new ArrayList<ItemResponseDto>();
		
		for (Item item : itemsList) {
			new ItemResponseDto();
			ItemResponseDto itemResponseDto = ItemResponseDto.builder()
					.itemId(item.getItemId())
					.itemName(item.getItemName())
					.itemDescription(item.getItemDescription())
					.itemPrice(item.getItemPrice())
					.itemCategory(item.getItemCategory())
					.itemType(item.getItemtype())
					.itemAvailable(item.isItemAvailable())
					.restaurantId(item.getRestaurant().getRestaurantId())
					.itemRating(item.getItemRating())
					.build();
			itemResponseDtoList.add(itemResponseDto);
			
		}
		
		return itemResponseDtoList ;
	}

}
