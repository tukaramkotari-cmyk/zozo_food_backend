package com.zozofood.controller;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.zozofood.dto.OrderRequestDto;
import com.zozofood.dto.OrderResponseDto;
import com.zozofood.service.OrderService;

@RestController
@RequestMapping("/orders")
public class OrderController {

	private final OrderService orderService;

	public OrderController(OrderService orderService) {
		this.orderService = orderService;
	}

	@PostMapping("/create")
	public ResponseEntity<OrderResponseDto> createOrder(@RequestBody OrderRequestDto orderRequestDto) {
		OrderResponseDto orderResponseDto = orderService.createOrder(orderRequestDto);
		return ResponseEntity.status(HttpStatus.CREATED).body(orderResponseDto);

	}

	@GetMapping("/getorderbyid/{orderId}")
	public ResponseEntity<OrderResponseDto> getOrderById(@PathVariable Long orderId) {
		return ResponseEntity.status(HttpStatus.OK).body(orderService.getOrderById(orderId));
	}

	@GetMapping("/getallorders")
	public ResponseEntity<Page<OrderResponseDto>> getAllOrders(@RequestParam(defaultValue = "0") int page,
			@RequestParam(defaultValue = "10") int size) {

		PageRequest pageRequest = PageRequest.of(page, size);

		Page<OrderResponseDto> ordersPage = orderService.getAllOrders(pageRequest);
		return ResponseEntity.ok(ordersPage);
	}

}
