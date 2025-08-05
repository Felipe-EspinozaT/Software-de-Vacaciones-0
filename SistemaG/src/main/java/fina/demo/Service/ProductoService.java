package fina.demo.Service;

import fina.demo.Entity.Producto;

import java.util.List;

public interface ProductoService {

    public abstract List<Producto> listaP();
    public abstract List<Producto> listP(int idProveedor, int idLinea);
    public abstract Producto agregarProducto(Producto p);
    public abstract Producto getProducto(int idP);

}
