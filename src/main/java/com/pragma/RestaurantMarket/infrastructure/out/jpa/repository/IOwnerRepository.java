package com.pragma.RestaurantMarket.infrastructure.out.jpa.repository;

import com.pragma.RestaurantMarket.infrastructure.out.jpa.entity.OwnerEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IOwnerRepository extends JpaRepository<OwnerEntity, Long> {
}
