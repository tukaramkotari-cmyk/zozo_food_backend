package com.zozofood.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zozofood.model.Address;

public interface AddressRepository extends JpaRepository<Address, Long> {

}
