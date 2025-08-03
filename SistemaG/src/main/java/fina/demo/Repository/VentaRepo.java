package fina.demo.Repository;

import fina.demo.Entity.Ventas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

@Repository("ventasRepo")
public interface VentaRepo extends JpaRepository<Ventas, Serializable> {
}
