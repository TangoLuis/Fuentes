package com.Empresa.proyecto.Services;

import com.Empresa.proyecto.Entity.Empleado;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface IEmpleadoService {
    public Empleado findByid(long id);
    public List<Empleado> findAll();
    public Empleado createEmpleado(Empleado empleado);
    public Empleado updateEmpleado(long id,Empleado empleado);
    public void deleEmpleado(long id);
}
