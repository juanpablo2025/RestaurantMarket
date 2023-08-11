package com.pragma.RestaurantMarket.infrastructure.out.jpa.mapper;

import com.pragma.RestaurantMarket.domain.model.AdminModel;
import com.pragma.RestaurantMarket.infrastructure.out.jpa.entity.AdminEntity;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.IGNORE,
        unmappedSourcePolicy = ReportingPolicy.IGNORE
)

public interface IAdminEntityMapper {

    AdminEntity toAdminEntity(AdminModel admin);
    AdminModel toAdminModel(AdminEntity adminEntity);
    List<AdminModel> toAdminModelList(List<AdminEntity> adminEntityList);
}
