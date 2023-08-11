package com.pragma.RestaurantMarket.application.handler.impl;

import com.pragma.RestaurantMarket.application.dto.request.AdminRequestDto;
import com.pragma.RestaurantMarket.application.handler.IAdminHandler;
import com.pragma.RestaurantMarket.application.mapper.IAdminRequestMapper;
import com.pragma.RestaurantMarket.application.mapper.IAdminResponseMapper;
import com.pragma.RestaurantMarket.domain.api.IOAdminServicePort;
import com.pragma.RestaurantMarket.domain.model.AdminModel;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
@Service
@RequiredArgsConstructor
@Transactional
public class AdminHandler implements IAdminHandler {


    private final IOAdminServicePort adminServicePort;
    private final IAdminRequestMapper adminRequestMapper;

    private final IAdminResponseMapper adminResponseMapper;

    @Override
    public void saveObject(AdminRequestDto adminRequestDto) {
        AdminModel adminModel = adminRequestMapper.toAdminDto(adminRequestDto);
        adminServicePort.saveAdmin(adminModel);
    }

    @Override
    public List<AdminRequestDto> getAllAdmins() {
        return adminResponseMapper.toResponseList(adminServicePort.getAllAdmins());
    }
}
