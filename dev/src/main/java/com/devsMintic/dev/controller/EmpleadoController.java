package com.devsMintic.dev.controller;

import com.devsMintic.dev.entity.Empleado;
import com.devsMintic.dev.entity.Empresa;
import com.devsMintic.dev.entity.Rol;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class EmpleadoController {
    @GetMapping("/empleado")
    public Empleado newEmpleado(){
        Empleado empleado=new Empleado();
        empleado.setNombreEmpleado("Edwin");
        empleado.setCorreoEmpleado("edwinlopez@gmail.com");
        Rol rol= Rol.administrador;
        empleado.setRol(rol);
        Empresa empresa = new Empresa();
        empresa.setNombreEmpresa("DevMinTic");
        empresa.setDireccionEmpresa("Calle 13");
        empresa.setTelefono("3142377011");
        empresa.setNit(12302312);
        empleado.setEmpresa(empresa);
        return empleado;
    }
}
