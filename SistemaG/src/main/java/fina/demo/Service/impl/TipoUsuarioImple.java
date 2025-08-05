package fina.demo.Service.impl;

import fina.demo.Entity.TipoUsuario;
import fina.demo.Repository.TipoUsuarioRepo;
import fina.demo.Service.TipoUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("tipUsuService")
public class TipoUsuarioImple implements TipoUsuarioService {
    @Autowired
    @Qualifier("typeUserRepo")
    private TipoUsuarioRepo tipUsuRepo;

    @Override
    public List<TipoUsuario> listTipUsu() {
        return tipUsuRepo.findAll();
    }
}
