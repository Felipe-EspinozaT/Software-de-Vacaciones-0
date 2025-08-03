package fina.demo.Repository;

import fina.demo.Entity.Compra;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

@Repository("compRepo")
public interface CompraRepo extends JpaRepository<Compra, Serializable> {
}
