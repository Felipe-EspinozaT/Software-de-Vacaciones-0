package fina.demo.Repository;

import fina.demo.Entity.CambioMoneda;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

@Repository("cambioMonyRepo")
public interface CambioMonedaRepo extends JpaRepository<CambioMoneda, Serializable> {

}
