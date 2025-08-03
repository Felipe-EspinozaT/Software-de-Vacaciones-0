package fina.demo.Entity;


import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name="compra")
public class Compra {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "comprraID")
    private int id;

    @Column(name = "fechaCompra")
    private Date fechaCom;

    @Column(name = "importeTotal")
    private double imporTotal;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "UsuarioID")
    private Usuario usuario;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "ClienteID")
    private Cliente cliente;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "ProveedorID")
    private Proveedor proveedor;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "MonedaID")
    private Moneda moneda;

    public Compra() {
    }

    public Compra(int id, Date fechaCom, double imporTotal, Usuario usuario, Cliente cliente, Proveedor proveedor, Moneda moneda) {
        this.id = id;
        this.fechaCom = fechaCom;
        this.imporTotal = imporTotal;
        this.usuario = usuario;
        this.cliente = cliente;
        this.proveedor = proveedor;
        this.moneda = moneda;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getFechaCom() {
        return fechaCom;
    }

    public void setFechaCom(Date fechaCom) {
        this.fechaCom = fechaCom;
    }

    public double getImporTotal() {
        return imporTotal;
    }

    public void setImporTotal(double imporTotal) {
        this.imporTotal = imporTotal;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Proveedor getProveedor() {
        return proveedor;
    }

    public void setProveedor(Proveedor proveedor) {
        this.proveedor = proveedor;
    }

    public Moneda getMoneda() {
        return moneda;
    }

    public void setMoneda(Moneda moneda) {
        this.moneda = moneda;
    }
}
