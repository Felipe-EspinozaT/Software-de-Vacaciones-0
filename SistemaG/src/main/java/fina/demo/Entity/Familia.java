package fina.demo.Entity;

import jakarta.persistence.*;

@Entity
@Table(name="Familia")
public class Familia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "FamId")
    private int id;

    @Column(name = "FamNom",length = 200)
    private String nom;
    @Column(name = "FamCorr",length = 10)
    private String correlativo;

    public Familia(int id, String nom, String correlativo) {
        this.id = id;
        this.nom = nom;
        this.correlativo = correlativo;
    }

    public Familia() {
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

    public String getCorrelativo() {
        return correlativo;
    }

    public void setCorrelativo(String correlativo) {
        this.correlativo = correlativo;
    }
}
