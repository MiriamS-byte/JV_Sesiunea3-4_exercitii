package itFactory.sesiunea3_4.exercitii3_4.laptop_12.electronice;

import itFactory.sesiunea3_4.exercitii3_4.laptop_12.componente.MemorieSSD;
import itFactory.sesiunea3_4.exercitii3_4.laptop_12.componente.Ram;

public class Laptop {
    private String marca;
    private String culoare;
    private double dimensiuneEcran;

    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca =marca;
    }
    public String getCuloare() {
        return culoare;
    }
    public void setCuloare(String culoare) {
        this.culoare = culoare;
    }
    public double getDimensiuneEcran() {
        return dimensiuneEcran;
    }
    public void setDimensiuneEcran(double dimensiuneEcran) {
        this.dimensiuneEcran = dimensiuneEcran;
    }
}