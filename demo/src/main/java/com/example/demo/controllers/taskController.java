package com.example.demo.controllers;
import com.example.demo.domain.Empleado;
import com.example.demo.services.Empresa;
import com.example.demo.services.MovimientoDinero;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class taskController {
    @Autowired
    Empresa Empresa;
    public String callEmpresa(){
        Empresa objEmpresa = new Empresa();
        objEmpresa.setDireccion("CALLE 14#9-31");
        objEmpresa.setNit(104924811);
        objEmpresa.setNombre("DEVS_MINTIC");
        objEmpresa.setTelefono("3142377011");
        return objEmpresa.getNombre();
    }
    @GetMapping(path = "/Devs/mintic/h",produces = "application/json")
    public String callEmpleado(){
        Empleado objEmpleado = new Empleado();
        objEmpleado.setNombreEmpleado("Edwin Lopez");
        objEmpleado.setCorreoEmpleado("Edwin@gmail.com");
        objEmpleado.setRolEmpleado("inge");
        String h=callEmpresa();
        log.info("HOLA Edwin");
        return Empresa.inscribirEmpleado(objEmpleado,h);
    }

    public String callMovimientoDinero(){
        MovimientoDinero objMovimi= new MovimientoDinero();
        return null;
    }
}
