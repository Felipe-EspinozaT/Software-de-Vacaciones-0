package fina.demo.Service.impl;

import fina.demo.Entity.DetalleVenta;
import fina.demo.Repository.DetalleVentaRepo;
import fina.demo.Service.DetalleVentaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("detaVentService")
public class DetalleVentaImple implements DetalleVentaService {
    @Autowired
    @Qualifier("detailVentaRepo")
    private DetalleVentaRepo detailVentRepo;

    @Override
    public List<DetalleVenta> detaVenta(int idVenta) {
        return detailVentRepo.findAll();
    }

    @Override
    public DetalleVenta agregarDetaVenta(DetalleVenta detaVent) {
        return detailVentRepo.save(detaVent);
    }
}
