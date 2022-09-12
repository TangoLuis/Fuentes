package com.Empresa.proyecto.Services;

import com.Empresa.proyecto.Entity.Empleado;
import com.Empresa.proyecto.Entity.Empresa;
import com.Empresa.proyecto.Entity.Rol;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class EmpleadoService implements IEmpleadoService {
    @Override
    public Empleado findByid(long id) {
        Empleado empleado = new Empleado();
        empleado.setId(id);
        empleado.setNombreEmpleado("Edwin");
        empleado.setCorreoEmpleado("edwinlopez@gmail.com");
        Rol rol = Rol.administrador;
        empleado.setRol(rol);
        Empresa empresa = new Empresa();
        empresa.setNombreEmpresa("DevMinTic");
        empresa.setDireccionEmpresa("Calle 13");
        empresa.setTelefono("3142377011");
        empresa.setNit(12302312);
        empleado.setEmpresa(empresa);
        return empleado;
    }

    @Override
    public List<Empleado> findAll() {
        List<Empleado> empleados = new ArrayList<Empleado>();
        Empleado empleado1 = new Empleado();
        empleado1.setId(1);
        empleado1.setNombreEmpleado("Luis");
        empleado1.setCorreoEmpleado("edwinlopez@gmail.com");
        Rol rol2 = Rol.administrador;
        empleado1.setRol(rol2);
        Empresa empresa1 = new Empresa();
        empresa1.setNombreEmpresa("DevMinTic");
        empresa1.setDireccionEmpresa("Calle 13");
        empresa1.setTelefono("3142377011");
        empresa1.setNit(12302312);
        empleado1.setEmpresa(empresa1);
        Empleado empleado2 = new Empleado();
        empleado2.setId(2);
        empleado2.setNombreEmpleado("Jhon");
        empleado2.setCorreoEmpleado("edwinlopez@gmail.com");
        Rol rol1 = Rol.administrador;
        empleado2.setRol(rol1);
        Empresa empresa2 = new Empresa();
        empresa2.setNombreEmpresa("DevMinTic");
        empresa2.setDireccionEmpresa("Calle 13");
        empresa2.setTelefono("3142377011");
        empresa2.setNit(12302312);
        empleado2.setEmpresa(empresa2);
        empleados.add(empleado1);
        empleados.add(empleado2);
        return empleados;
    }

    @Override
    public Empleado createEmpleado(Empleado empleado) {
        Empleado newempleado1 = new Empleado();
        newempleado1.setId(empleado.getId());
        newempleado1.setNombreEmpleado(empleado.getNombreEmpleado());
        newempleado1.setCorreoEmpleado(empleado.getCorreoEmpleado());
        Rol rol2 = Rol.operativo;
        newempleado1.setRol(rol2);
        Empresa empresa1 = new Empresa();
        empresa1.setNombreEmpresa("Los Alpes");
        empresa1.setDireccionEmpresa("Calle 14");
        empresa1.setTelefono("3142377011");
        empresa1.setNit(12302312);
        newempleado1.setEmpresa(empresa1);
        return newempleado1;
    }

    @Override
    public Empleado updateEmpleado(long id, Empleado empleado) {
        Empleado putEmpleado = findByid(id);
        putEmpleado.setNombreEmpleado(empleado.getNombreEmpleado());
        putEmpleado.setCorreoEmpleado(empleado.getCorreoEmpleado());
        Rol rol = Rol.administrador;
        putEmpleado.setRol(rol);
        Empresa empresa = new Empresa();
        empresa.setNombreEmpresa(empresa.getNombreEmpresa());
        empresa.setDireccionEmpresa(empresa.getDireccionEmpresa());
        empresa.setTelefono(empresa.getTelefono());
        empresa.setNit(empresa.getNit());
        putEmpleado.setEmpresa(empresa);
        return putEmpleado;
    }

    @Override
    public void deleEmpleado(long id) {
        Empleado deleteEmpleado = findByid(id);
    }
}
