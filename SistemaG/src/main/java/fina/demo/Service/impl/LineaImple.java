package fina.demo.Service.impl;

import fina.demo.Entity.Familia;
import fina.demo.Entity.Linea;
import fina.demo.Repository.LineaRepo;
import fina.demo.Service.LineaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("linservi")
public class LineaImple implements LineaService {

    @Autowired
    @Qualifier("lineRepo")
    private LineaRepo linRepo;
    @Override
    public List<Linea> listarLi(int idFa) {
        return linRepo.findAll();
    }

    @Override
    public List<Linea> listarxNom(String nom, Integer idf) {
        if(nom==null)
            return linRepo.findAll();
        else{
            if(idf==null){
                return linRepo.listanom(nom);
            }else{
                return  linRepo.listanomandIdf(nom,idf);
            }

        }

    }

    @Override
    public List<Linea> listLine() {
        return linRepo.findAll();
    }

    @Override
    public Linea agregarLi(Linea li) {
        return linRepo.save(li);
    }

    @Override
    public Linea getLinea(int id) {
        return linRepo.getById(id);
    }
}
