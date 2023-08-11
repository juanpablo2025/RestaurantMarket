package com.pragma.RestaurantMarket.infrastructure.exceptionhandler;

import com.pragma.RestaurantMarket.infrastructure.exception.NoDataFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.Collections;
import java.util.Map;

@ControllerAdvice
public class ControllerAdvisor {

    private static final String Message = "message";

    @ExceptionHandler(NoDataFoundException.class)
    public ResponseEntity<Map<String,String>>handleNoDataFoundException(NoDataFoundException ignoredNoDataFoundException){
        return ResponseEntity.status(HttpStatus.NOT_FOUND)
                .body(Collections.singletonMap (Message,ExceptionResponse.NO_DATA_FOUND.getMessage()));
    }
}
