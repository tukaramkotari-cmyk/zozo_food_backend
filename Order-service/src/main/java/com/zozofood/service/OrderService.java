package com.zozofood.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import com.zozofood.dto.OrderRequestDto;
import com.zozofood.dto.OrderResponseDto;

public interface OrderService {

	OrderResponseDto createOrder(OrderRequestDto orderRequestDto);

	OrderResponseDto getOrderById(Long orderId);

	Page<OrderResponseDto> getAllOrders(PageRequest pageRequest);

}

