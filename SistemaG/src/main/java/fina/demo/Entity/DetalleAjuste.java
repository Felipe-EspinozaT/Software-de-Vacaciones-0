package fina.demo.Entity;


import jakarta.persistence.*;

@Entity
@Table(name="detalleAjuste")
public class DetalleAjuste {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "detalleAjusteID")
    private int id;

    @Column(name = "cantidad")
    private int cant;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "ProductoID")
    private Producto producto;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "AjusteID")
    private AjusteInventario ajusteInventario;

    public DetalleAjuste() {
    }

    public DetalleAjuste(int id, int cant, Producto producto, AjusteInventario ajusteInventario) {
        this.id = id;
        this.cant = cant;
        this.producto = producto;
        this.ajusteInventario = ajusteInventario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public AjusteInventario getAjusteInventario() {
        return ajusteInventario;
    }

    public void setAjusteInventario(AjusteInventario ajusteInventario) {
        this.ajusteInventario = ajusteInventario;
    }
}
