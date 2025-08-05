package fina.demo.Service.impl;

import fina.demo.Entity.UnidadMedidas;
import fina.demo.Repository.UnidadMedidaRepo;
import fina.demo.Service.UnidadMedidaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("unidaMedidaService")
public class UnidadMedidaImple implements UnidadMedidaService {

    @Autowired
    @Qualifier("unidMedidaRepo")
    private UnidadMedidaRepo uniMeRep;
    @Override
    public List<UnidadMedidas> listUniMedi() {
        return uniMeRep.findAll();
    }
}
