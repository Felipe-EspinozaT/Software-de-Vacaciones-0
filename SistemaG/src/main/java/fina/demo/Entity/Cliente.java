package fina.demo.Entity;

import jakarta.persistence.*;

@Entity
@Table(name="cliente")
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "clienteID")
    private int id;

    @Column(name = "nroDocuCli",length = 15)
    private String NroDocu;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "tipDocuId")
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

    public Cliente(int id,String nroDocu, TIpoDocumento tipoDocumento) {
        this.id = id;
        NroDocu = nroDocu;
        this.tipoDocumento = tipoDocumento;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
