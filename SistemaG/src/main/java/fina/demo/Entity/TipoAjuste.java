package fina.demo.Entity;


import jakarta.persistence.*;

@Entity
@Table(name="tipoAjuste")
public class TipoAjuste {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "tipoAjusteID")
    private int id;

    @Column(name = "nombre",length = 100)
    private String nom;

    public TipoAjuste() {
    }

    public TipoAjuste(int id, String nom) {
        this.id = id;
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
