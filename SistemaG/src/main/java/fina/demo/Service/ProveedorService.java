package fina.demo.Service;

import fina.demo.Entity.Producto;
import fina.demo.Entity.Proveedor;

import java.util.List;

public interface ProveedorService {
    public abstract List<Proveedor> listaP();
    public abstract Proveedor agregarProveedor(Proveedor p);
    public abstract Proveedor getProveedor(int idP);
}
