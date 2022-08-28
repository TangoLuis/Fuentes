package com.devsMintic.dev.controller;

import com.devsMintic.dev.entity.Empresa;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api")
public class EmpresaController {
    @GetMapping("/empresa")
    public Empresa mostrarEmpresa(){
        Empresa empresa = new Empresa();
        empresa.setNombreEmpresa("DevMinTic");
        empresa.setDireccionEmpresa("Calle 13");
        empresa.setTelefono("3142377011");
        empresa.setNit(12302312);
        return empresa;
    }

}
