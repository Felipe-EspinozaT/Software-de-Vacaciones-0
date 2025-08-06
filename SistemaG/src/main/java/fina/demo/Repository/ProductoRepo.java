package fina.demo.Repository;

import fina.demo.Entity.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.io.Serializable;
import java.util.List;

@Repository("productRepo")
public interface ProductoRepo extends JpaRepository<Producto, Serializable> {

    @Query("SELECT p FROM Producto p WHERE p.linea.id = ?1")
    List<Producto> findAllByLinea(int id);


    @Query("SELECT p FROM Producto p WHERE p.linea.id = ?1 AND p.cod LIKE %?2%")
    List<Producto> listxlineaxcod(int idl, String cod);

    @Query("SELECT p FROM Producto p WHERE p.linea.id = ?1 AND p.descrip LIKE %?2%")
    List<Producto> listxlineaxdescrip(int idl, String desc);
}
