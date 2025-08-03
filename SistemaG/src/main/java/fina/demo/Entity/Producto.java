package fina.demo.Entity;

import jakarta.persistence.*;

@Entity
@Table(name="producto")
public class Producto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "productoID")
    private int id;

    @Column(name = "descripcion",length = 200)
    private String descrip;

    @Column(name = "codigo",length = 50)
    private String cod;

    @Column(name = "precioSugerido")
    private double precioSuge;

    @Column(name = "Stock")
    private int stock;

    @Column(name = "modeloProducto", length = 100)
    private String modeloProdu;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "unidadMedidaID")
    private UnidadMedidas unidadMedida;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "lineaID")
    private Linea linea;

    public Producto() {
    }

    public Producto(int id, String descrip, String cod, double precioSuge, int stock, String modeloProdu, UnidadMedidas unidadMedida, Linea linea) {
        this.id = id;
        this.descrip = descrip;
        this.cod = cod;
        this.precioSuge = precioSuge;
        this.stock = stock;
        this.modeloProdu = modeloProdu;
        this.unidadMedida = unidadMedida;
        this.linea = linea;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescrip() {
        return descrip;
    }

    public void setDescrip(String descrip) {
        this.descrip = descrip;
    }

    public String getCod() {
        return cod;
    }

    public void setCod(String cod) {
        this.cod = cod;
    }

    public double getPrecioSuge() {
        return precioSuge;
    }

    public void setPrecioSuge(double precioSuge) {
        this.precioSuge = precioSuge;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getModeloProdu() {
        return modeloProdu;
    }

    public void setModeloProdu(String modeloProdu) {
        this.modeloProdu = modeloProdu;
    }

    public UnidadMedidas getUnidadMedida() {
        return unidadMedida;
    }

    public void setUnidadMedida(UnidadMedidas unidadMedida) {
        this.unidadMedida = unidadMedida;
    }

    public Linea getLinea() {
        return linea;
    }

    public void setLinea(Linea linea) {
        this.linea = linea;
    }
}
