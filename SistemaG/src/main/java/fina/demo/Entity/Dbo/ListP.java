package fina.demo.Entity.Dbo;

import fina.demo.Entity.Producto;

import java.util.List;

public class ListP {

    private List<Producto> lista;

    public ListP(List<Producto> lista) {
        this.lista = lista;
    }

    public List<Producto> getLista() {
        return lista;
    }

    public void setLista(List<Producto> lista) {
        this.lista = lista;
    }

    public ListP() {
    }
}
