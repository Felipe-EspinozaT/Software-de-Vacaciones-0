package fina.demo.Repository;

import fina.demo.Entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

@Repository("userRepo")
public interface UsuarioRepo extends JpaRepository<Usuario, Serializable> {
}
