package fina.demo.Repository;

import fina.demo.Entity.DetalleAjuste;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

@Repository("detailSettingRepo")
public interface DetalleAjusteRepo extends JpaRepository<DetalleAjuste, Serializable> {
}
