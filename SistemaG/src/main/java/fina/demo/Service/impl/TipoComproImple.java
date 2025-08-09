package fina.demo.Service.impl;

import fina.demo.Entity.TipoComprobante;
import fina.demo.Entity.TipoUsuario;
import fina.demo.Repository.TipoComproRepo;
import fina.demo.Repository.TipoUsuarioRepo;
import fina.demo.Service.TipoComproService;
import fina.demo.Service.TipoUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("tipComproService")
public class TipoComproImple implements TipoComproService {
    @Autowired
    @Qualifier("typeComproRepo")
    private TipoComproRepo tipComRepo;


    @Override
    public List<TipoComprobante> listTipCompro() {
        return tipComRepo.findAll();
    }
}
