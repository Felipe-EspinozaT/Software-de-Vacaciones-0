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

    @Column(name = "nroCompor",length = 50)
    private String NroComprobante;

    @Column(name = "correlativo",length = 10)
    private String correlativo;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "TipComproId")
    private TipoComprobante tipoComprobante;

    public Ventas() {
    }

    public Ventas(int id, double importeVenta, Cliente cliente, Usuario usuario, TipoVenta tipoventa, String nroComprobante, String correlativo, TipoComprobante tipoComprobante) {
        this.id = id;
        this.importeVenta = importeVenta;
        this.cliente = cliente;
        this.usuario = usuario;
        this.tipoventa = tipoventa;
        NroComprobante = nroComprobante;
        this.correlativo = correlativo;
        this.tipoComprobante = tipoComprobante;
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

    public String getNroComprobante() {
        return NroComprobante;
    }

    public void setNroComprobante(String nroComprobante) {
        NroComprobante = nroComprobante;
    }

    public String getCorrelativo() {
        return correlativo;
    }

    public void setCorrelativo(String correlativo) {
        this.correlativo = correlativo;
    }

    public TipoComprobante getTipoComprobante() {
        return tipoComprobante;
    }

    public void setTipoComprobante(TipoComprobante tipoComprobante) {
        this.tipoComprobante = tipoComprobante;
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
