package com.example.demo.services;

import com.example.demo.domain.Empleado;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Service;

@Service
@Data
public class Empresa {

    private String nombre;
    private String direccion;
    private String telefono;
    private int nit;

    public String inscribirEmpleado(Empleado trabajador,String nombreEmpresa){
        String inscrito = "El trabajador "+ trabajador.getNombreEmpleado() + " Correo: "+ trabajador.getCorreoEmpleado() + "Rol: "+ trabajador.getRolEmpleado() + " Trabaja en la empresa: "+ nombreEmpresa;
        return inscrito;
    }
}
