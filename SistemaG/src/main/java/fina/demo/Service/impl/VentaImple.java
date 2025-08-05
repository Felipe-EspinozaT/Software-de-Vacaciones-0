package fina.demo.Service.impl;

import fina.demo.Entity.Ventas;
import fina.demo.Repository.VentaRepo;
import fina.demo.Service.VentaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("ventaService")
public class VentaImple implements VentaService {

    @Autowired
    @Qualifier("ventasRepo")
    private VentaRepo ventRepo;
    @Override
    public List<Ventas> listVenta() {
        return ventRepo.findAll();
    }

    @Override
    public Ventas agrevarVenta(Ventas vent) {
        return ventRepo.save(vent);
    }
}
