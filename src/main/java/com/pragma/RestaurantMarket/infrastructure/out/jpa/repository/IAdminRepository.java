package com.pragma.RestaurantMarket.infrastructure.out.jpa.repository;

import com.pragma.RestaurantMarket.infrastructure.out.jpa.entity.AdminEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IAdminRepository extends JpaRepository<AdminEntity, Long> {
}
