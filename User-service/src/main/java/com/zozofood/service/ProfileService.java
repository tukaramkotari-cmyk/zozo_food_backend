package com.zozofood.service;

import com.zozofood.dto.ProfileRespWithTokenDto;
import com.zozofood.dto.ProfileResponseDto;
import com.zozofood.dto.ProfileUpdateReqDto;

import jakarta.validation.Valid;

public interface ProfileService {

	ProfileResponseDto getUserProfile(long userId);

	ProfileRespWithTokenDto updateUserProfile(long userId, @Valid ProfileUpdateReqDto profileUpdateReqDto);



}
