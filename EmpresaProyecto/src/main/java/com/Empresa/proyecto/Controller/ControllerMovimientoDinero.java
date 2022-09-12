package com.Empresa.proyecto.Controller;
import com.Empresa.proyecto.Entity.Empleado;
import com.Empresa.proyecto.Entity.Empresa;
import com.Empresa.proyecto.Entity.MovimientoDinero;
import com.Empresa.proyecto.Entity.Rol;
import com.Empresa.proyecto.Services.IMovimientoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class ControllerMovimientoDinero {

    @Autowired
    private IMovimientoService iMovimientoService;

    @GetMapping("/movimientoEmpresa/{id}")
    public MovimientoDinero getMovimiento(@PathVariable long id){
        return iMovimientoService.getMovimiento(id);
    }
    @GetMapping("/movimiento/{id}")
    public MovimientoDinero findIdMovi(@PathVariable long id){
        return iMovimientoService.findIdMovi(id);
    }
    @GetMapping("/movimientos")
    public List<MovimientoDinero> FindAllEmpresas(){
        return iMovimientoService.FindAllEmpresas();
    }

    @PostMapping("/movimientoEmpresa")
    public MovimientoDinero createMovimiento(@RequestBody MovimientoDinero movimientoDinero) {
        return iMovimientoService.createMovimiento(movimientoDinero);
    }
    @PutMapping("movimientoEmpresa/{id}")
    public MovimientoDinero updateMovimiento(@PathVariable long id, @RequestBody MovimientoDinero movimientoDinero){
        return iMovimientoService.updateMovimiento(id,movimientoDinero);
    }
    @DeleteMapping("/movimiento/{id}")
    public void deleMovimiento(@PathVariable long id){
        iMovimientoService.deleMovimiento(id);
    }
}
