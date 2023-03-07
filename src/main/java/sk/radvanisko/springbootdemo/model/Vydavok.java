package sk.radvanisko.springbootdemo.model;


import jakarta.persistence.*;
import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;


import java.sql.Date;

@Entity
@Table(name="vydavky01")

public class Vydavok {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)  // toto doplnit

    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "popisvydavku")
    private String popisVydavku;
    @Column(name = "kategoria")
    private String kategoria;
    @Column(name = "suma", nullable = false)
    private double suma;

    @Column(name = "datum")

    private Date datum;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    // Gettery Settery
    public String getPopisVydavku() {
        return popisVydavku;
    }

    public void setPopisVydavku(String popisVydavku) {
        this.popisVydavku = popisVydavku;
    }

    public String getKategoria() {
        return kategoria;
    }

    public void setKategoria(String kategoria) {
        this.kategoria = kategoria;
    }

    public double getSuma() {
        return suma;
    }

    public void setSuma(double suma) {
        this.suma = suma;
    }

    public Date getDatum() {
        return datum;
    }

    public void setDatum(Date datum) {
        this.datum = datum;
    }
}
