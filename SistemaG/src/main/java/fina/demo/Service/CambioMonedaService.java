package fina.demo.Service;

import fina.demo.Entity.CambioMoneda;

import java.util.List;

public interface CambioMonedaService {
    public abstract List<CambioMoneda> listCambMone(int idMoneda);
    public abstract CambioMoneda agregaCamMone(CambioMoneda cambMoneda);
}
