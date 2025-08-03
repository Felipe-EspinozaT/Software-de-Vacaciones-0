package fina.demo.Entity;

import jakarta.persistence.*;

@Entity
@Table(name="proveedores")
public class Proveedor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "proveedorID")
    private int id;

    @Column(name = "razonSocial",length = 200)
    private String raSocial;

    @Column(name = "RUC",length = 14)
    private String ruc;

    @Column(name = "direccion",length = 20)
    private String direc;

    public Proveedor() {
    }

    public Proveedor(int id, String raSocial, String ruc, String direc) {
        this.id = id;
        this.raSocial = raSocial;
        this.ruc = ruc;
        this.direc = direc;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRaSocial() {
        return raSocial;
    }

    public void setRaSocial(String raSocial) {
        this.raSocial = raSocial;
    }

    public String getRuc() {
        return ruc;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

    public String getDirec() {
        return direc;
    }

    public void setDirec(String direc) {
        this.direc = direc;
    }
}
