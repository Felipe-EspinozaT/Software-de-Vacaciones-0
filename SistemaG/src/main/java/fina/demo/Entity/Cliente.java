package fina.demo.Entity;

import jakarta.persistence.*;

@Entity
@Table(name="cliente")
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "clienteID")
    private int id;

    @Column(name = "nombreCli",length = 50)
    private String nombre;

    @Column(name = "apellidoCli",length = 50)
    private String apellido;

    @Column(name = "nroDocuCli",length = 15)
    private String NroDocu;

    @Column(name = "tipoDocuID")
    private TIpoDocumento tipoDocumento;

    public Cliente() {
    }

    public String getNroDocu() {
        return NroDocu;
    }

    public void setNroDocu(String nroDocu) {
        NroDocu = nroDocu;
    }

    public TIpoDocumento getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(TIpoDocumento tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public Cliente(int id, String nombre, String apellido, String nroDocu, TIpoDocumento tipoDocumento) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        NroDocu = nroDocu;
        this.tipoDocumento = tipoDocumento;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
