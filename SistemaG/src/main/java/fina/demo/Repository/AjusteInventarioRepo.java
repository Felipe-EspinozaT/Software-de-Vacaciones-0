package fina.demo.Repository;

import fina.demo.Entity.AjusteInventario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

@Repository("ajusteInventaryRepo")
public interface AjusteInventarioRepo extends JpaRepository<AjusteInventario, Serializable> {
}
