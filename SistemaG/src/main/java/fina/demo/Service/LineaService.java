package fina.demo.Service;

import fina.demo.Entity.Familia;
import fina.demo.Entity.Linea;

import java.util.List;

public interface LineaService {

    public abstract List<Linea> listarLi(int idFa);
    public abstract List<Linea> listarxNom(String nom, Integer idf);
    public abstract List<Linea> listLine();
    public abstract Linea agregarLi(Linea li);
    public abstract Linea getLinea(int id);
}
