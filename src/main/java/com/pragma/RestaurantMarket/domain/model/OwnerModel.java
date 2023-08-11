package com.pragma.RestaurantMarket.domain.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class OwnerModel {

    private Long id;
    //Nombre, Apellido, DocumentoDeIdentidad, celular, fechaNacimiento, correo y clave(encriptada con bcrypt)

    private String name;


    private String document;


    private int phone;


    private String fechaNacimineto;


    private String email;


    private String password;


    private String rol;

}
