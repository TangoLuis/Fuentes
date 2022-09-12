package com.Empresa.proyecto.Controller;
import com.Empresa.proyecto.Entity.Empleado;
import com.Empresa.proyecto.Entity.Empresa;
import com.Empresa.proyecto.Entity.Rol;
import com.Empresa.proyecto.Services.IEmpresaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping("/api")
public class EmpresaController {
    @Autowired
    private IEmpresaService iEmpresaService;
    @GetMapping("/empresa/{id}")
    public Empresa findId(@PathVariable long id){
        return iEmpresaService.findId(id);
    }
    @GetMapping("/empresas")
    public List<Empresa> findAll(){
        return iEmpresaService.findAll();
    }
    @PostMapping("/empresa/{id}")
    public Empresa createEmpresa(@RequestBody Empresa empresa){
        return iEmpresaService.createEmpresa(empresa);
    }
    @PutMapping("/empresa/{id}")
    public Empresa updateEmpresa(@PathVariable long id, @RequestBody Empresa empresa) {
        return iEmpresaService.updateEmpresa(id,empresa);
    }
    @DeleteMapping("/empresa/{id}")
    public void deleteEmpresa(@PathVariable long id){
        iEmpresaService.deleteEmpresa(id);
    }
}
