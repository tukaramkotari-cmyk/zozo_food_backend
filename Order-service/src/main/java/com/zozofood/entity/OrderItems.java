package com.zozofood.entity;

import java.math.BigDecimal;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table
@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderItems {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long orderItemId;
	
	private long menuItemId;			
	
	private int quantityOrdered;		
	
	private Double price;		// price per item
	
	private BigDecimal subtotalPrice;	// quantityOrdered * price
	
	
	@ManyToOne
	@JoinColumn(name = "order_id", nullable = false)
	private Order order;

}
