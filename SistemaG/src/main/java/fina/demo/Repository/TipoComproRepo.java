package fina.demo.Repository;

import fina.demo.Entity.TipoAjuste;
import fina.demo.Entity.TipoComprobante;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

@Repository("typeComproRepo")
public interface TipoComproRepo extends JpaRepository<TipoComprobante, Serializable> {
}
