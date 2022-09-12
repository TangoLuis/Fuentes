package com.Empresa.proyecto.Services;

import com.Empresa.proyecto.Entity.Empleado;
import com.Empresa.proyecto.Entity.Empresa;
import com.Empresa.proyecto.Entity.MovimientoDinero;
import com.Empresa.proyecto.Entity.Rol;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class MovimientoService implements IMovimientoService{

    //Este es un ejemplo con solo empresa
    @Override
    public MovimientoDinero getMovimiento(long id) {
        MovimientoDinero movi2= new MovimientoDinero();
        movi2.setMonto(10000.0);
        movi2.setConceptoMovi("Pagos");
        Empresa empresa = new Empresa();
        empresa.setNombreEmpresa("DevMinTic");
        empresa.setDireccionEmpresa("Calle 13");
        empresa.setTelefono("3142377011");
        empresa.setNit(id);
        movi2.setEmpresa(empresa);
        movi2.dato(false);
        return movi2;
    }

    @Override
    public MovimientoDinero findIdMovi(long id) {
        MovimientoDinero movi = new MovimientoDinero();
        movi.setMonto(10000.0);
        movi.setConceptoMovi("Pagos");
        Empleado empleado=new Empleado();
        empleado.setNombreEmpleado("Edwin");
        empleado.setCorreoEmpleado("edwinlopez@gmail.com");
        Rol rol = Rol.administrador;
        empleado.setRol(rol);
        Empresa empresa = new Empresa();
        empresa.setNombreEmpresa("DevMinTic");
        empresa.setDireccionEmpresa("Calle 13");
        empresa.setTelefono("3142377011");
        empresa.setNit(id);
        empleado.setEmpresa(empresa);
        movi.setEmpleado(empleado);
        movi.setEmpresa(empresa);
        movi.dato(false);
        return movi;
    }

    @Override
    public List<MovimientoDinero> FindAllEmpresas() {
        List<MovimientoDinero> Movimientos = new ArrayList<MovimientoDinero>();
        MovimientoDinero movi=new MovimientoDinero();
        movi.setMonto(10000.0);
        movi.setConceptoMovi("Pagos");
        Empleado empleado=new Empleado();
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
        movi.setEmpleado(empleado);
        movi.setEmpresa(empresa);
        movi.dato(false);
        Movimientos.add(movi);
        MovimientoDinero movi2=new MovimientoDinero();
        movi2.setMonto(10000.0);
        movi2.setConceptoMovi("Pagos");
        Empleado empleado2=new Empleado();
        empleado2.setNombreEmpleado("Edwin");
        empleado2.setCorreoEmpleado("edwinlopez@gmail.com");
        Rol rol2 = Rol.administrador;
        empleado2.setRol(rol2);
        Empresa empresa2 = new Empresa();
        empresa2.setNombreEmpresa("DevMinTic");
        empresa2.setDireccionEmpresa("Calle 13");
        empresa2.setTelefono("3142377011");
        empresa2.setNit(112);
        empleado2.setEmpresa(empresa);
        movi2.setEmpleado(empleado);
        movi2.setEmpresa(empresa);
        movi2.dato(false);
        Movimientos.add(movi2);
        return Movimientos;
    }

    @Override
    public MovimientoDinero createMovimiento(MovimientoDinero movimientoDinero) {
        MovimientoDinero newMov=new MovimientoDinero();
        newMov.setIdMovi(movimientoDinero.getIdMovi());
        newMov.setMonto(movimientoDinero.getMonto());
        newMov.setConceptoMovi(movimientoDinero.getConceptoMovi());
        Empleado empleado=new Empleado();
        empleado.setNombreEmpleado("Edwin");
        empleado.setCorreoEmpleado("edwinlopez@gmail.com");
        Rol rol = Rol.administrador;
        empleado.setRol(rol);
        Empresa empresa = new Empresa();
        empresa.setNombreEmpresa("DevMinTic");
        empresa.setDireccionEmpresa("Calle 13");
        empresa.setTelefono("3142377011");
        empresa.setNit(2302312);
        empleado.setEmpresa(empresa);
        newMov.setEmpleado(empleado);
        newMov.setEmpresa(empresa);
        newMov.dato(false);
        return newMov;
    }

    @Override
    public MovimientoDinero updateMovimiento(long id, MovimientoDinero movimientoDinero) {
        MovimientoDinero putMovimientoDinero = findIdMovi(id);
        putMovimientoDinero.setConceptoMovi(movimientoDinero.getConceptoMovi());
        putMovimientoDinero.setIdMovi(movimientoDinero.getIdMovi());
        putMovimientoDinero.setMonto(movimientoDinero.getMonto());
        putMovimientoDinero.setConceptoMovi(movimientoDinero.getConceptoMovi());
        Empleado empleado= new Empleado();
        empleado.setNombreEmpleado("MArio");
        empleado.setCorreoEmpleado("Mlopez@gmail.com");
        Rol rol = Rol.operativo;
        empleado.setRol(rol);
        Empresa empresa = new Empresa();
        empresa.setNombreEmpresa("MinTic");
        empresa.setDireccionEmpresa("Clle 13");
        empresa.setTelefono("314237701");
        empresa.setNit(230231);
        empleado.setEmpresa(empresa);
        putMovimientoDinero.setEmpleado(empleado);
        putMovimientoDinero.setEmpresa(empresa);
        putMovimientoDinero.dato(false);
        return putMovimientoDinero;
    }
    @Override
    public void deleMovimiento(long id) {
        MovimientoDinero m = findIdMovi(id);
    }
}
