package fina.demo.Service;

import fina.demo.Entity.Producto;

import java.util.List;

public interface ProductoService {

    public abstract List<Producto> listaP();
    public abstract List<Producto> listP(int idProveedor, int idLinea);
    public abstract List<Producto> lisP(int idL, int idF);
    public abstract List<Producto> listPCod(int idL, int idF, String cod);
    public abstract List<Producto> listPnom(int idL, int idF, String nom);
    public abstract Producto agregarProducto(Producto p);
    public abstract Producto getProducto(int idP);


}
