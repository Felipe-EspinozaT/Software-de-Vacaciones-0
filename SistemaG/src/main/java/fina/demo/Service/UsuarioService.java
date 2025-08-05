package fina.demo.Service;

import fina.demo.Entity.Usuario;

import java.util.List;

public interface UsuarioService {

    public abstract List<Usuario> listUsu();
    public abstract Usuario agregaUsuario(Usuario usu);
    public abstract boolean logearUsuario(Usuario usuario);
}
