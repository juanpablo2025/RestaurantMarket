package com.pragma.RestaurantMarket.domain.spi;

import com.pragma.RestaurantMarket.domain.model.AdminModel;
import com.pragma.RestaurantMarket.domain.model.OwnerModel;

import java.util.List;

public interface IAdminPersistencePort {

    AdminModel saveAdmin(AdminModel adminModel);

    List<AdminModel> getAllAdmins();

    OwnerModel saveOwner(OwnerModel OwnerModel);
}
