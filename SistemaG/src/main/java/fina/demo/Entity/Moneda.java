package fina.demo.Entity;

import jakarta.persistence.*;

@Entity
@Table(name="moneda")
public class Moneda {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "monedaID")
    private int id;

    @Column(name = "tipoMoneda",length = 10)
    private String tipMoneda;

    public Moneda() {
    }

    public Moneda(int id, String tipMoneda) {
        this.id = id;
        this.tipMoneda = tipMoneda;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTipMoneda() {
        return tipMoneda;
    }

    public void setTipMoneda(String tipMoneda) {
        this.tipMoneda = tipMoneda;
    }
}
