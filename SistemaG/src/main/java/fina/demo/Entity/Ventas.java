package fina.demo.Entity;


import jakarta.persistence.*;

@Entity
@Table(name="venta")
public class Ventas {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ventaID")
    private int id;

    @Column(name = "importeVenta")
    private double importeVenta;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "clienteID")
    private Cliente cliente;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "usuarioID")
    private Usuario usuario;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "TipVentaId")
    private TipoVenta tipoventa;

    public Ventas() {
    }

    public Ventas(int id, double importeVenta, Cliente cliente, Usuario usuario, TipoVenta tipoventa) {
        this.id = id;
        this.importeVenta = importeVenta;
        this.cliente = cliente;
        this.usuario = usuario;
        this.tipoventa = tipoventa;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getImporteVenta() {
        return importeVenta;
    }

    public void setImporteVenta(double importeVenta) {
        this.importeVenta = importeVenta;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public TipoVenta getTipoventa() {
        return tipoventa;
    }

    public void setTipoventa(TipoVenta tipoventa) {
        this.tipoventa = tipoventa;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
