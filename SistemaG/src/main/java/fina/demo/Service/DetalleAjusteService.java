package fina.demo.Service;

import fina.demo.Entity.DetalleAjuste;

import java.util.List;

public interface DetalleAjusteService {

    public abstract List<DetalleAjuste> listDetaAJu(int IDajus);
    public abstract DetalleAjuste agregarDetaAju(DetalleAjuste detaAjus);
}
