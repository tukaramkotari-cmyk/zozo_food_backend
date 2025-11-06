package com.zozofood.dto;

import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderItemResponseDto {

	private Long orderItemId;

	private Long itemId;

	private Integer quantity;

	private BigDecimal itemSubtotal;

}
