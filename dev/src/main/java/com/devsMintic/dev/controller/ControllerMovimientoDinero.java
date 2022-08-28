package com.devsMintic.dev.controller;

import com.devsMintic.dev.entity.Empleado;
import com.devsMintic.dev.entity.MovimientoDinero;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ControllerMovimientoDinero {
    @GetMapping("/movimiento")
    public MovimientoDinero getMovimiento(){
        MovimientoDinero movi=new MovimientoDinero();
        movi.setMonto(10000.0);
        movi.setConceptoMovi("Pagos");
        Empleado empleado=new Empleado();
        empleado.setNombreEmpleado("Edwin");
        empleado.setCorreoEmpleado("edwinlopez@gmail.com");
        movi.setEmpleado(empleado);
        movi.dato(false);
        return movi;
    }
}
