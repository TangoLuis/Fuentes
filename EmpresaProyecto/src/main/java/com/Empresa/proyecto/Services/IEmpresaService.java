package com.Empresa.proyecto.Services;

import com.Empresa.proyecto.Entity.Empresa;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface IEmpresaService {
    public Empresa findId(long id);
    public List<Empresa> findAll();
    public Empresa createEmpresa(@RequestBody Empresa empresa);
    public Empresa updateEmpresa( long id, Empresa empresa);
    public void deleteEmpresa(long id);

}
