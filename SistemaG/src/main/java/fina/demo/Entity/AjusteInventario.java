package fina.demo.Entity;


import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name="ajusteInventario")
public class AjusteInventario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ajusteInvenID")
    private int id;

    @Column(name = "fecha")
    private Date fecha;

    @Column(name = "motivo",length = 200)
    private String moti;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "TipoAjusteID")
    private TipoAjuste tipoAjuste;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "UsuarioID")
    private Usuario usuario;

    public AjusteInventario() {
    }

    public AjusteInventario(int id, Date fecha, String moti, TipoAjuste tipoAjuste, Usuario usuario) {
        this.id = id;
        this.fecha = fecha;
        this.moti = moti;
        this.tipoAjuste = tipoAjuste;
        this.usuario = usuario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getMoti() {
        return moti;
    }

    public void setMoti(String moti) {
        this.moti = moti;
    }

    public TipoAjuste getTipoAjuste() {
        return tipoAjuste;
    }

    public void setTipoAjuste(TipoAjuste tipoAjuste) {
        this.tipoAjuste = tipoAjuste;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
