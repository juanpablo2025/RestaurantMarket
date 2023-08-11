package com.pragma.RestaurantMarket.domain.spi;

import com.pragma.RestaurantMarket.domain.model.AdminModel;

import java.util.List;

public interface IAdminPersistencePort {

    AdminModel saveObject(AdminModel adminModel);

    List<AdminModel> getAllAdmins();
}
