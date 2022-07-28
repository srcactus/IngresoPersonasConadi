/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author Cactus
 */
public class FichaCuadroResumen {
    
    private int idCuadroResumen;
    private int totalSoliConadi;
    private int total;
    private int idPersonaF;

    public FichaCuadroResumen() {
    }

    public FichaCuadroResumen(int idCuadroResumen, int totalSoliConadi, int total, int idPersonaF) {
        this.idCuadroResumen = idCuadroResumen;
        this.totalSoliConadi = totalSoliConadi;
        this.total = total;
        this.idPersonaF = idPersonaF;
    }

    public int getIdCuadroResumen() {
        return idCuadroResumen;
    }

    public void setIdCuadroResumen(int idCuadroResumen) {
        this.idCuadroResumen = idCuadroResumen;
    }

    public int getTotalSoliConadi() {
        return totalSoliConadi;
    }

    public void setTotalSoliConadi(int totalSoliConadi) {
        this.totalSoliConadi = totalSoliConadi;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getIdPersonaF() {
        return idPersonaF;
    }

    public void setIdPersonaF(int idPersonaF) {
        this.idPersonaF = idPersonaF;
    }

    @Override
    public String toString() {
        return "FichaCuadroResumen{" + "idCuadroResumen=" + idCuadroResumen + ", totalSoliConadi=" + totalSoliConadi + ", total=" + total + ", idPersonaF=" + idPersonaF + '}';
    }
    
    
    
}
