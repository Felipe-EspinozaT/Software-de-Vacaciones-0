package fina.demo.Service;

import fina.demo.Entity.Compra;
import org.springframework.stereotype.Service;

import java.util.List;

public interface CompraService {

    public abstract List<Compra> comp();
    public abstract Compra agregarComp(Compra comp);
}
