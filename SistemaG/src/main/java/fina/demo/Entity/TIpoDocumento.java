package fina.demo.Entity;

import jakarta.persistence.*;


@Entity
@Table(name="tipoDocumento")
public class TIpoDocumento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "tipoDocuID")
    private int id;

    @Column(name = "tipoDocuNom")
    private String nom;

    public TIpoDocumento() {
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

    public TIpoDocumento(int id, String nom) {
        this.id = id;
        this.nom = nom;
    }
}
