package com.Empresa.proyecto.Services;
import com.Empresa.proyecto.Entity.Empresa;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;
@Service
public class EmpresaService implements IEmpresaService {
    @Override
    public Empresa findId(long id) {
        Empresa empresa = new Empresa();
        empresa.setNombreEmpresa("DevMinTic");
        empresa.setDireccionEmpresa("Calle 13");
        empresa.setTelefono("3142377011");
        empresa.setNit(id);
        return empresa;
    }

    @Override
    public List<Empresa> findAll() {
        List<Empresa> empresas = new ArrayList<Empresa>();
        Empresa empresa1 = new Empresa();
        empresa1.setNombreEmpresa("DevMinTic");
        empresa1.setDireccionEmpresa("Calle 13");
        empresa1.setTelefono("3142377011");
        empresa1.setNit(12302312);
        Empresa empresa2 = new Empresa();
        empresa2.setNombreEmpresa("DevMinTic dos");
        empresa2.setDireccionEmpresa("Calle 13");
        empresa2.setTelefono("3142377011");
        empresa2.setNit(11302312);
        empresas.add(empresa1);
        empresas.add(empresa1);
        return empresas;
    }

    @Override
    public Empresa createEmpresa(Empresa empresa) {
        Empresa newEmpresa = new Empresa();
        newEmpresa.setNombreEmpresa(empresa.getNombreEmpresa());
        newEmpresa.setDireccionEmpresa(empresa.getDireccionEmpresa());
        newEmpresa.setTelefono(empresa.getTelefono());
        newEmpresa.setNit(empresa.getNit());
        return newEmpresa;
    }

    @Override
    public Empresa updateEmpresa(long id, Empresa empresa) {
        Empresa putEmpresa = findId(id);
        putEmpresa.setDireccionEmpresa(empresa.getDireccionEmpresa());
        putEmpresa.setNombreEmpresa(empresa.getNombreEmpresa());
        putEmpresa.setTelefono(empresa.getTelefono());
        return putEmpresa;
    }

    @Override
    public void deleteEmpresa(long id) {
        Empresa deleteEmpre = findId(id);
    }
}
