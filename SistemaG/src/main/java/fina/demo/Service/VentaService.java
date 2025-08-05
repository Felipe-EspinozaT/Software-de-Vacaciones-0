package fina.demo.Service;

import fina.demo.Entity.Ventas;

import java.util.List;

public interface VentaService {
    public abstract List<Ventas> listVenta();
    public abstract Ventas agrevarVenta(Ventas vent);

}
