package fina.demo.Service.impl;

import fina.demo.Entity.Producto;
import fina.demo.Repository.ProductoRepo;
import fina.demo.Service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("produservi")
public class ProductoImple implements ProductoService {

    @Autowired
    @Qualifier("productRepo")
    private ProductoRepo produRepo;

    @Override
    public List<Producto> listaP() {
        return produRepo.findAll();
    }

    @Override
    public List<Producto> listP(int idProveedor, int idLinea) {
        return produRepo.findAll();
    }

    @Override
    public Producto agregarProducto(Producto p) {
        return produRepo.save(p);
    }

    @Override
    public Producto getProducto(int idP) {
        return produRepo.getById(idP);
    }
}
