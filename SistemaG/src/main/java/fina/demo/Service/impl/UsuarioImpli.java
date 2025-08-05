package fina.demo.Service.impl;

import fina.demo.Entity.Usuario;
import fina.demo.Repository.UsuarioRepo;
import fina.demo.Service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("usuarioService")
public class UsuarioImpli implements UsuarioService {

    @Autowired
    @Qualifier("userRepo")
    private UsuarioRepo usuRep;
    @Override
    public List<Usuario> listUsu() {
        return usuRep.findAll();
    }

    @Override
    public Usuario agregaUsuario(Usuario usu) {
        return usuRep.save(usu);
    }

    @Override
    public boolean logearUsuario(Usuario usuario) {
        return true;
    }
}
