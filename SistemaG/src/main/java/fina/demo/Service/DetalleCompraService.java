package fina.demo.Service;

import fina.demo.Entity.DetalleCompra;

import java.util.List;

public interface DetalleCompraService {

    public abstract List<DetalleCompra> listDetaCompra(int idCompra);
    public abstract DetalleCompra agregarDetaCompra(DetalleCompra detaComp);
}
