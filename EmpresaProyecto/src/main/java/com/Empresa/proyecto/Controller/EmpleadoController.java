package com.Empresa.proyecto.Controller;

import com.Empresa.proyecto.Entity.Empleado;
import com.Empresa.proyecto.Entity.Empresa;
import com.Empresa.proyecto.Entity.Rol;
import com.Empresa.proyecto.Services.IEmpleadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class EmpleadoController {
    @Autowired
    private IEmpleadoService iEmpleadoService;
    @GetMapping("/empleado/{id}")
    public Empleado findByid(@PathVariable long id) {
        return iEmpleadoService.findByid(id);
    }
    @GetMapping("/empleados")
    public List<Empleado> findAll() {
        return iEmpleadoService.findAll();
    }
    @PostMapping("/empleado")
    public Empleado createEmpleado(@RequestBody Empleado empleado) {
        return iEmpleadoService.createEmpleado(empleado);
    }
    @PutMapping("/empleado/{id}")
    public Empleado updateEmpleado(@PathVariable long id, @RequestBody Empleado empleado) {
        return iEmpleadoService.updateEmpleado(id,empleado);
    }
    @DeleteMapping("/empleado/{id}")
    public void deleEmpleado(@PathVariable long id){
        iEmpleadoService.deleEmpleado(id);
    }

}
