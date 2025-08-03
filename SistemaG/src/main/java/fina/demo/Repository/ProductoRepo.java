package fina.demo.Repository;

import fina.demo.Entity.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

@Repository("productRepo")
public interface ProductoRepo extends JpaRepository<Producto, Serializable> {
}
