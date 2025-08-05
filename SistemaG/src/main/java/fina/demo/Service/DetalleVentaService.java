package fina.demo.Service;

import fina.demo.Entity.DetalleVenta;

import java.util.List;

public interface DetalleVentaService {

    public abstract List<DetalleVenta> detaVenta(int idVenta);
    public abstract DetalleVenta agregarDetaVenta(DetalleVenta detaVent);

}
