package fina.demo.Repository;

import fina.demo.Entity.Moneda;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

@Repository("moneyRepo")
public interface MonedaRepo extends JpaRepository<Moneda, Serializable> {
}
