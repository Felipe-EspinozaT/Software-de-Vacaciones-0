package fina.demo.Service.impl;

import fina.demo.Entity.Moneda;
import fina.demo.Repository.MonedaRepo;
import fina.demo.Service.MonedaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("monedaService")
public class MonedaImple implements MonedaService {
    @Autowired
    @Qualifier("moneyRepo")
    private MonedaRepo monRepo;
    @Override
    public List<Moneda> listMoneda() {
        return monRepo.findAll();
    }
}
