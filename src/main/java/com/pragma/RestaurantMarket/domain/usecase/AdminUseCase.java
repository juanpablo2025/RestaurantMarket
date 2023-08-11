package com.pragma.RestaurantMarket.domain.usecase;

import com.pragma.RestaurantMarket.domain.api.IOAdminServicePort;
import com.pragma.RestaurantMarket.domain.model.AdminModel;
import com.pragma.RestaurantMarket.domain.spi.IAdminPersistencePort;

import java.util.List;

public class AdminUseCase implements IOAdminServicePort {

   public IAdminPersistencePort iAdminPersistencePort;

    public AdminUseCase(IAdminPersistencePort iAdminPersistencePort) {
        this.iAdminPersistencePort = iAdminPersistencePort;
    }

    @Override
    public void saveAdmin(AdminModel adminModel) {

    }

    @Override
    public List<AdminModel> getAllAdmins() {
        return null;
    }
}
