package fina.demo.Entity;


import jakarta.persistence.*;

@Entity
@Table(name="usuarios")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "usuarioID")
    private int id;

    @Column(name = "usuarioNom",length = 200)
    private String nom;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "tipoUsuarioID")
    private TipoUsuario tipousuario;

    public Usuario() {
    }

    public Usuario(int id, String nom, TipoUsuario tipousuario) {
        this.id = id;
        this.nom = nom;
        this.tipousuario = tipousuario;
    }

    public TipoUsuario getTipousuario() {
        return tipousuario;
    }

    public void setTipousuario(TipoUsuario tipousuario) {
        this.tipousuario = tipousuario;
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
