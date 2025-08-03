package fina.demo.Entity;


import jakarta.persistence.*;

@Entity
@Table(name="detalleCompra")
public class DetalleCompra {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "detalleCompraID")
    private int id;

    @Column(name = "precio")
    private double precio;

    @Column(name = "cantidad")
    private int cant;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "ProductoID")
    private Producto producto;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "ComprID")
    private Compra compra;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "MonedaID")
    private Moneda moneda;

    public DetalleCompra() {
    }

    public DetalleCompra(int id, double precio, int cant, Producto producto, Compra compra, Moneda moneda) {
        this.id = id;
        this.precio = precio;
        this.cant = cant;
        this.producto = producto;
        this.compra = compra;
        this.moneda = moneda;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCant() {
        return cant;
    }

    public void setCant(int cant) {
        this.cant = cant;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public Compra getCompra() {
        return compra;
    }

    public void setCompra(Compra compra) {
        this.compra = compra;
    }

    public Moneda getMoneda() {
        return moneda;
    }

    public void setMoneda(Moneda moneda) {
        this.moneda = moneda;
    }
}
