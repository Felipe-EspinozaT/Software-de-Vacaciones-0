package fina.demo.Repository;

import fina.demo.Entity.Linea;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

@Repository("lineRepo")
public interface LineaRepo extends JpaRepository<Linea, Serializable> {
    
}
