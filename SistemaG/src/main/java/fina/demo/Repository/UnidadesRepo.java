package fina.demo.Repository;

import fina.demo.Entity.Unidades;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

@Repository("unidadRepo")
public interface UnidadesRepo extends JpaRepository<Unidades, Serializable> {
}
