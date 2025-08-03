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

    public Ventas() {
    }

    public Ventas(int id, double importeVenta, Cliente cliente, Usuario usuario) {
        this.id = id;
        this.importeVenta = importeVenta;
        this.cliente = cliente;
        this.usuario = usuario;
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

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
