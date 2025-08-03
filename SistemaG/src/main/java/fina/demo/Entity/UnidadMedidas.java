package fina.demo.Entity;


import jakarta.persistence.*;

@Entity
@Table(name="unidadMedidad")
public class UnidadMedidas {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "unidadMedidaID")
    private int id;

    @Column(name = "unidad",length = 50)
    private String unidadMedi;

    public UnidadMedidas() {
    }

    public UnidadMedidas(String unidadMedi, int id) {
        this.unidadMedi = unidadMedi;
        this.id = id;
    }

    public String getUnidadMedi() {
        return unidadMedi;
    }

    public void setUnidadMedi(String unidadMedi) {
        this.unidadMedi = unidadMedi;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
