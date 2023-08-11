package com.pragma.RestaurantMarket.infrastructure.configuration;

import com.pragma.RestaurantMarket.infrastructure.out.jpa.mapper.IAdminEntityMapper;
import com.pragma.RestaurantMarket.infrastructure.out.jpa.repository.IAdminRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Configuration;

@Configuration
@RequiredArgsConstructor
public class BeanConfiguration {

    private final IAdminRepository adminRepository;

    private final IAdminEntityMapper adminEntityMapper;
}
