package fina.demo.Repository;

import fina.demo.Entity.DetalleVenta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

@Repository("detailVentaRepo")
public interface DetalleVentaRepo extends JpaRepository<DetalleVenta, Serializable> {
}
