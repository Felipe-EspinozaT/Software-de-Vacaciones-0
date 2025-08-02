package fina.demo.Repository;


import fina.demo.Entity.Familia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

@Repository("famrepo")
public interface FamiliaRepo  extends JpaRepository<Familia, Serializable> {
    /*
    @Query(value = "select e.EstId , e.EstNombre, r.RepClimaTemp, (select count(*)\n" +
            "from zonaturistica z \n" +
            "where z.ZonaEstacion = e.EstId ) as Zonas, 'url',r.RepClimaIntensidadLluvia \n" +
            "from estacion e \n" +
            "inner join reporteclima r \n" +
            "on r.RepClimaEstacion = e.EstId\n" +
            "where r.RepClimaHora = :hora and DATE(r.RepClimaFecha) = CURRENT_DATE()\n" +
            ";", nativeQuery = true)
    public List<EstacionDto> getInfoEstaciones(int hora);

    @Query(value = "select e.EstId, e.EstNombre from estacion e;", nativeQuery = true)
    public List<AyudaEstacion> getAll();*/

}