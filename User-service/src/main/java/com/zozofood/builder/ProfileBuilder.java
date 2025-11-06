package com.zozofood.builder;

import com.zozofood.dto.ProfileResponseDto;
import com.zozofood.entity.User;

public class ProfileBuilder {

	public static ProfileResponseDto toProfileResponseDto(User user) {
		return ProfileResponseDto.builder().username(user.getUsername()).email(user.getEmail())
				.address(user.getAddress()).build();
	}

}
