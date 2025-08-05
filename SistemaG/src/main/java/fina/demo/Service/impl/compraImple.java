package fina.demo.Service.impl;

import fina.demo.Entity.Compra;
import fina.demo.Repository.CompraRepo;
import fina.demo.Service.CompraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("compraServi")
public class compraImple implements CompraService {
   @Autowired
   @Qualifier("compRepo")
   private CompraRepo compRep;

    @Override
    public List<Compra> comp() {
        return compRep.findAll();
    }

    @Override
    public Compra agregarComp(Compra comp) {
        return compRep.save(comp);
    }
}
