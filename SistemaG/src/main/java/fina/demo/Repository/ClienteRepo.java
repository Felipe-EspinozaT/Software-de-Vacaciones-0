package fina.demo.Repository;

import fina.demo.Entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

@Repository("clientRepo")
public interface ClienteRepo extends JpaRepository<Cliente, Serializable> {
}
