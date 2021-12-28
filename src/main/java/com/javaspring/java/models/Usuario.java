package com.javaspring.java.models;

import lombok.Data;

@Data
public class Usuario {
    private Long id;
    private String nombre;
    private String apellido;
    private String email;
    private String telefono;
    private String password;


}
