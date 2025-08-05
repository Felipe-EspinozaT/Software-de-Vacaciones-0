package fina.demo.Service.impl;

import fina.demo.Entity.CambioMoneda;
import fina.demo.Repository.CambioMonedaRepo;
import fina.demo.Service.CambioMonedaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("cambioMoneService")
public class CambioMonedaIMple implements CambioMonedaService {
    @Autowired
    @Qualifier("cambioMonyRepo")
    private CambioMonedaRepo camRe;

    @Override
    public List<CambioMoneda> listCambMone(int idMoneda) {
        return camRe.findAll();
    }

    @Override
    public CambioMoneda agregaCamMone(CambioMoneda cambMoneda) {
        return camRe.save(cambMoneda);
    }
}
