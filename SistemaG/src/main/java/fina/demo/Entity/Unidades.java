package fina.demo.Entity;

import jakarta.persistence.*;

@Entity
@Table(name="uni")
public class Unidades {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "uniid")
    private int id;

    @Column(name = "unidad",length = 200)
    private String nom;

    public Unidades(int id, String nom) {
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

    public Unidades() {
    }
}
