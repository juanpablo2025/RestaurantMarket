package com.pragma.RestaurantMarket.infrastructure.out.jpa.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "Owner")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class OwnerEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id",nullable = false)
    private Long id;
//Nombre, Apellido, DocumentoDeIdentidad, celular, fechaNacimiento, correo y clave(encriptada con bcrypt)
    @Column(length = 50)
    private String name;

    @Column(length = 50)
    private String document;

    @Column(length = 50)
    private int phone;

    @Column(length = 50)
    private String fechaNacimineto;

    @Column(length = 50)
    private String email;

    @Column(length = 50)
    private String password;

    @Column(length = 50)
    private String rol="Owner";


}
