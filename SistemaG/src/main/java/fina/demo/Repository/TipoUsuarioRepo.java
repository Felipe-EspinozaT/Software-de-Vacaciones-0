package fina.demo.Repository;

import fina.demo.Entity.TipoUsuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

@Repository("typeUserRepo")
public interface TipoUsuarioRepo extends JpaRepository<TipoUsuario, Serializable> {
}
