package fina.demo.Repository;

import fina.demo.Entity.Proveedor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

@Repository("proveRepo")
public interface ProveedorRepo extends JpaRepository<Proveedor, Serializable> {
}
