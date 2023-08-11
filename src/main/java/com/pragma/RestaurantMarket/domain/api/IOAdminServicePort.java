package com.pragma.RestaurantMarket.domain.api;

import com.pragma.RestaurantMarket.domain.model.AdminModel;

import java.util.List;

public interface IOAdminServicePort {

    void saveAdmin(AdminModel adminModel);
    List<AdminModel> getAllAdmins();
}
