package fina.demo.Service.impl;

import fina.demo.Entity.AjusteInventario;
import fina.demo.Repository.AjusteInventarioRepo;
import fina.demo.Service.AjusteInventarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("ajusteInvenService")
public class AjusteInventarioImple implements AjusteInventarioService {
    @Autowired
    @Qualifier("ajusteInventaryRepo")
    private AjusteInventarioRepo ajusInRepo;

    @Override
    public List<AjusteInventario> listAjusInve() {
        return ajusInRepo.findAll();
    }

    @Override
    public AjusteInventario agregarAjusInve(AjusteInventario ajus) {
        return ajusInRepo.save(ajus);
    }
}
