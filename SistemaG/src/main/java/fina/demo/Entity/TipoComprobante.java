package fina.demo.Entity;

import jakarta.persistence.*;

@Entity
@Table(name= "tipoComprobante")
public class TipoComprobante {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "tipoComproID")
    private int id;

    @Column(name = "nombre",length = 100)
    private String nom;

    public TipoComprobante(int id, String nom) {
        this.id = id;
        this.nom = nom;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public TipoComprobante() {
    }
}
