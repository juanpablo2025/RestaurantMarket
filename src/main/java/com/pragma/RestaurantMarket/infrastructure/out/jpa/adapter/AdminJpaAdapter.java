package com.pragma.RestaurantMarket.infrastructure.out.jpa.adapter;

import com.pragma.RestaurantMarket.domain.model.AdminModel;
import com.pragma.RestaurantMarket.domain.spi.IAdminPersistencePort;
import com.pragma.RestaurantMarket.infrastructure.exception.NoDataFoundException;
import com.pragma.RestaurantMarket.infrastructure.out.jpa.entity.AdminEntity;
import com.pragma.RestaurantMarket.infrastructure.out.jpa.mapper.IAdminEntityMapper;
import com.pragma.RestaurantMarket.infrastructure.out.jpa.repository.IAdminRepository;
import lombok.RequiredArgsConstructor;

import java.util.List;
@RequiredArgsConstructor
public class AdminJpaAdapter implements IAdminPersistencePort {

    private final IAdminRepository adminRepository;

    private final IAdminEntityMapper adminEntityMapper;
    @Override
    public AdminModel saveObject(AdminModel adminModel) {
        AdminEntity adminEntity = adminRepository.save(adminEntityMapper.toAdminEntity(adminModel));
        return adminEntityMapper.toAdminModel(adminEntity);
    }

    @Override
    public List<AdminModel> getAllAdmins() {
      List<AdminEntity> adminEntityList = adminRepository.findAll();
      if(adminEntityList.isEmpty()){
          throw new NoDataFoundException();
      }
      return adminEntityMapper.toAdminModelList(adminEntityList);
    }
}
