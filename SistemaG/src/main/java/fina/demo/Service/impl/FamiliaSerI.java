package fina.demo.Service.impl;

import fina.demo.Entity.Familia;
import fina.demo.Repository.FamiliaRepo;
import fina.demo.Service.FamiliaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("famservi")
public class FamiliaSerI  implements FamiliaService {

    @Autowired
    @Qualifier("famrepo")
    private FamiliaRepo famrepo;

    @Override
    public List<Familia> findAllFamil() {
        System.out.println("a");
        return famrepo.findAll();
    }
}
