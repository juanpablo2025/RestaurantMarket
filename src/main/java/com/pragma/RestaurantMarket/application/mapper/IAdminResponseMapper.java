package com.pragma.RestaurantMarket.application.mapper;

import com.pragma.RestaurantMarket.application.dto.request.AdminRequestDto;
import com.pragma.RestaurantMarket.domain.model.AdminModel;

import java.util.List;

public interface IAdminResponseMapper {
    AdminModel toResponse(AdminRequestDto adminRequestDto);

    List<AdminRequestDto> toResponseList(List<AdminModel> allAdmins);
}
