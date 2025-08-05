package fina.demo.Service.impl;

import fina.demo.Entity.DetalleAjuste;
import fina.demo.Repository.DetalleAjusteRepo;
import fina.demo.Service.DetalleAjusteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("dettaleajusteService")
public class DetalleAjusteImple implements DetalleAjusteService {
    @Autowired
    @Qualifier("detailSettingRepo")
    private DetalleAjusteRepo detaAjRepo;
    @Override
    public List<DetalleAjuste> listDetaAJu(int IDajus) {
        return detaAjRepo.findAll();
    }

    @Override
    public DetalleAjuste agregarDetaAju(DetalleAjuste detaAjus) {
        return detaAjRepo.save(detaAjus);
    }
}
