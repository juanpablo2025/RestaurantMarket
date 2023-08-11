package com.pragma.RestaurantMarket.application.handler;

import com.pragma.RestaurantMarket.application.dto.request.AdminRequestDto;

import java.util.List;

public interface IAdminHandler {
    void saveObject(AdminRequestDto adminRequestDto);

    List<AdminRequestDto> getAllAdmins();
}
