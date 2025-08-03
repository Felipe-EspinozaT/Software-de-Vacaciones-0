package fina.demo.Repository;

import fina.demo.Entity.UnidadMedidas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

@Repository("unidMedidaRepo")
public interface UnidadMedidaRepo extends JpaRepository<UnidadMedidas, Serializable> {
}
