package fina.demo.Entity;


import jakarta.persistence.*;

@Entity
@Table(name="cambioMoneda")
public class CambioMoneda {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cambiMonedaID")
    private int id;

    @Column(name = "tipovALOR")
    private double tipValor;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "MonedaID")
    private Moneda moneda;

    public CambioMoneda() {
    }

    public CambioMoneda(int id, double tipValor, Moneda moneda) {
        this.id = id;
        this.tipValor = tipValor;
        this.moneda = moneda;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getTipValor() {
        return tipValor;
    }

    public void setTipValor(double tipValor) {
        this.tipValor = tipValor;
    }

    public Moneda getMoneda() {
        return moneda;
    }

    public void setMoneda(Moneda moneda) {
        this.moneda = moneda;
    }
}
