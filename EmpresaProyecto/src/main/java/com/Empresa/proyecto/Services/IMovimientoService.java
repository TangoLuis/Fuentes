package com.Empresa.proyecto.Services;

import com.Empresa.proyecto.Entity.MovimientoDinero;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface IMovimientoService {
    public MovimientoDinero getMovimiento(long id);
    public MovimientoDinero findIdMovi(long id);
    public List<MovimientoDinero> FindAllEmpresas();
    public MovimientoDinero createMovimiento(MovimientoDinero movimientoDinero);
    public MovimientoDinero updateMovimiento(long id, @RequestBody MovimientoDinero movimientoDinero);
    public void deleMovimiento(long id);
}
