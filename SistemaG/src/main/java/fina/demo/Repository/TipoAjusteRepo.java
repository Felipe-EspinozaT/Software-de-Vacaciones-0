package fina.demo.Repository;

import fina.demo.Entity.TipoAjuste;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.io.Serial;
import java.io.Serializable;

@Repository("typeSettingRepo")
public interface TipoAjusteRepo extends JpaRepository<TipoAjuste, Serializable> {
}
