package com.zozofood.builder;

import java.util.ArrayList;
import java.util.List;

import com.zozofood.dto.CreateItemRequestDTO;
import com.zozofood.model.Item;

public class CreateItemRequestBuilder {
	
	public static List<Item> buildItemFromCreateItemRequestDTO(List<CreateItemRequestDTO>  createItemRequestDTOList) {
		List<Item> itemlist = new ArrayList<Item>();
		
		for(CreateItemRequestDTO itemRequestDto : createItemRequestDTOList) {
			
			Item item = new Item().builder()
					.itemName(itemRequestDto.getItemName())
					.itemDescription(itemRequestDto.getItemDescription())
					.itemPrice(itemRequestDto.getItemPrice())
					.itemtype(itemRequestDto.getItemtype())
					.itemCategory(itemRequestDto.getItemCategory())
					.build();		
			
			itemlist.add(item);				
		}
		return itemlist;
		
	}

}
