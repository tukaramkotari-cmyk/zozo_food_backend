package com.zozofood.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zozofood.entity.PasswordResetToken;

public interface PasswordResetTokenRepo extends JpaRepository<PasswordResetToken, Long> {

}
