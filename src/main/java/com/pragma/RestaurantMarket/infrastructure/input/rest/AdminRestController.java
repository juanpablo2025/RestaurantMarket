package com.pragma.RestaurantMarket.infrastructure.input.rest;

import com.pragma.RestaurantMarket.application.dto.request.AdminRequestDto;
import com.pragma.RestaurantMarket.application.handler.IAdminHandler;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/admin")
@RequiredArgsConstructor
public class AdminRestController {

    private final IAdminHandler adminHandler;

    @PostMapping("/")
    public ResponseEntity<Void> saveAdmin(@RequestBody AdminRequestDto  adminRequestDto) {
        adminHandler.saveObject(adminRequestDto);
        return new ResponseEntity<>(HttpStatus.CREATED);

    }

    @GetMapping("/")
public ResponseEntity<AdminRequestDto> getAllAdmins() {
    return ResponseEntity.ok((AdminRequestDto) adminHandler.getAllAdmins());
}
}
