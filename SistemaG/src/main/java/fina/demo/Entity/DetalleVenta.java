package fina.demo.Entity;


import jakarta.persistence.*;

@Entity
@Table(name="detalleVenta")
public class DetalleVenta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "detalleVentaID")
    private int id;

    @Column(name = "cantidadDeVenta")
    private int cantidad;

    @Column(name = "precioVendido")
    private double precioVendi;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "VentaID")
    private Ventas ventas;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "ProductoID")
    private Producto producto;

    public DetalleVenta() {
    }

    public DetalleVenta(int id, int cantidad, double precioVendi, Ventas ventas, Producto producto) {
        this.id = id;
        this.cantidad = cantidad;
        this.precioVendi = precioVendi;
        this.ventas = ventas;
        this.producto = producto;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecioVendi() {
        return precioVendi;
    }

    public void setPrecioVendi(double precioVendi) {
        this.precioVendi = precioVendi;
    }

    public Ventas getVentas() {
        return ventas;
    }

    public void setVentas(Ventas ventas) {
        this.ventas = ventas;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }
}
