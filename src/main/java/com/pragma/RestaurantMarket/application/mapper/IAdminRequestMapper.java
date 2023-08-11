package com.pragma.RestaurantMarket.application.mapper;

import com.pragma.RestaurantMarket.application.dto.request.AdminRequestDto;
import com.pragma.RestaurantMarket.domain.model.AdminModel;

public interface IAdminRequestMapper {
    AdminModel toAdminDto(AdminRequestDto adminRequestDto);
}
