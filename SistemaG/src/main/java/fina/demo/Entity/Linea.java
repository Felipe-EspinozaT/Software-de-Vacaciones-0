package fina.demo.Entity;


import jakarta.persistence.*;

@Entity
@Table(name="Linea")
public class Linea {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "LimId")
    private int id;

    @Column(name = "LimNom",length = 200)
    private String nom;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "LimFam")
    private Familia familia;

    public Linea(int id, String nom, Familia familia) {
        this.id = id;
        this.nom = nom;
        this.familia = familia;
    }

    public Linea() {
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

    public Familia getFamilia() {
        return familia;
    }

    public void setFamilia(Familia familia) {
        this.familia = familia;
    }
}
