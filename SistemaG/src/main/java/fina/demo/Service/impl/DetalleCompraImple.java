package fina.demo.Service.impl;

import fina.demo.Entity.DetalleCompra;
import fina.demo.Repository.DetalleCompraRepo;
import fina.demo.Service.DetalleCompraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("detalleCompService")
public class DetalleCompraImple implements DetalleCompraService {
    @Autowired
    @Qualifier("detailCompraRepo")
    private DetalleCompraRepo detaCompRepo;

    @Override
    public List<DetalleCompra> listDetaCompra(int idCompra) {
        return detaCompRepo.findAll();
    }

    @Override
    public DetalleCompra agregarDetaCompra(DetalleCompra detaComp) {
        return detaCompRepo.save(detaComp);
    }
}
