package fina.demo.Repository;

import fina.demo.Entity.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.io.Serializable;
import java.util.List;

@Repository("productRepo")
public interface ProductoRepo extends JpaRepository<Producto, Serializable> {

    @Query(value="SELECT p.productoid,p.codigo,p.descripcion,p.modelo_producto,p.precio_sugerido,p.stock,p.lineaid,p.unidad_medidaid FROM producto p where p.lineaid =?1")
    public List<Producto> listxlinea(int id);

    @Query(value = "SELECT p.productoid,p.codigo,p.descripcion,p.modelo_producto,p.precio_sugerido,p.stock,p.lineaid,p.unidad_medidaid  FROM producto p where p.lineaid = ?1 and p.codigo like '%?2%'")
    public List<Producto> listxlineaxcod(int idl,String cod);


    @Query(value = "SELECT p.productoid,p.codigo,p.descripcion,p.modelo_producto,p.precio_sugerido,p.stock,p.lineaid,p.unidad_medidaid  FROM producto p where p.lineaid = ?1 and p.descripcion like '%?2%'")
    public List<Producto> listxlineaxdescrip(int idl,String cod);
}
