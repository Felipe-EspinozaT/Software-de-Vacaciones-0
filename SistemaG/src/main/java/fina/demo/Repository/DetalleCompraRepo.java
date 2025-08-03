package fina.demo.Repository;

import fina.demo.Entity.DetalleCompra;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

@Repository("detailCompraRepo")
public interface DetalleCompraRepo extends JpaRepository<DetalleCompra, Serializable> {
}
