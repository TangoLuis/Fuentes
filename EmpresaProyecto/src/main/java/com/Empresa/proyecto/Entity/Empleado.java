package com.Empresa.proyecto.Entity;

import lombok.Data;

@Data
public class Empleado {
    private String nombreEmpleado;
    private String correoEmpleado;
    private Empresa empresa;
    private Rol rol;
    private long id;

}
