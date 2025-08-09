package fina.demo.Repository;

import fina.demo.Entity.Linea;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.io.Serializable;
import java.util.List;

@Repository("lineRepo")
public interface LineaRepo extends JpaRepository<Linea, Serializable> {

    @Query("select l from Linea l where l.nom like %?1%  ")
    public List<Linea> listanom(String nom );


    @Query("select l from Linea l where l.nom like %?1% and l.familia.id = ?2   ")
    public List<Linea> listanomandIdf(String nom, int idf );
    
}
