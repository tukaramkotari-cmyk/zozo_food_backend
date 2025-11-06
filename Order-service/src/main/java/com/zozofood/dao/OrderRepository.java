package com.zozofood.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.zozofood.entity.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {

}
