package fina.demo.Service;

import fina.demo.Entity.Linea;

import java.util.List;

public interface LineaService {

    public abstract List<Linea> listarLi(int idFa);
    public abstract Linea agregarLi(Linea li);
}
