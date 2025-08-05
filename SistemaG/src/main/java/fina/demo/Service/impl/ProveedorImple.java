package fina.demo.Service.impl;

import fina.demo.Entity.Proveedor;
import fina.demo.Repository.ProveedorRepo;
import fina.demo.Service.ProveedorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("proveservice")
public class ProveedorImple implements ProveedorService {

    @Autowired
    @Qualifier("proveRepo")
    private ProveedorRepo proveRepo;

    @Override
    public List<Proveedor> listaP() {
        return proveRepo.findAll();
    }

    @Override
    public Proveedor agregarProveedor(Proveedor p) {
        return proveRepo.save(p);
    }

    @Override
    public Proveedor getProveedor(int idP) {
        return proveRepo.getById(idP);
    }
}
