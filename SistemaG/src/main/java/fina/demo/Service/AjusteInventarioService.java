package fina.demo.Service;

import fina.demo.Entity.AjusteInventario;

import java.util.List;

public interface AjusteInventarioService {

    public abstract List<AjusteInventario> listAjusInve();
    public abstract AjusteInventario agregarAjusInve(AjusteInventario ajus);
}
