/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author Cactus
 */
public class FinanCostoProy {
    
    private int idFinan;
    private int montoSoliConadi;
    private int montoSoliConadi2;
    private String detallesProd;
    private String detallesProd2;
    private int idPreguntaF;
    private int idPersonaF;

    public FinanCostoProy() {
    }

    public FinanCostoProy(int idFinan, int montoSoliConadi, int montoSoliConadi2, String detallesProd, String detallesProd2, int idPreguntaF, int idPersonaF) {
        this.setIdFinan(idFinan);
        this.setMontoSoliConadi(montoSoliConadi);
        this.setMontoSoliConadi2(montoSoliConadi2);
        this.setDetallesProd(detallesProd);
        this.setDetallesProd2(detallesProd2);
        this.setIdPreguntaF(idPreguntaF);
        this.setIdPersonaF(idPersonaF);
    }

    public int getIdFinan() {
        return idFinan;
    }

    public void setIdFinan(int idFinan) {
        this.idFinan = idFinan;
    }

    public int getMontoSoliConadi() {
        return montoSoliConadi;
    }

    public void setMontoSoliConadi(int montoSoliConadi) {
        this.montoSoliConadi = montoSoliConadi;
    }

    public int getMontoSoliConadi2() {
        return montoSoliConadi2;
    }

    public void setMontoSoliConadi2(int montoSoliConadi2) {
        this.montoSoliConadi2 = montoSoliConadi2;
    }

    public String getDetallesProd() {
        return detallesProd;
    }

    public void setDetallesProd(String detallesProd) {
        this.detallesProd = detallesProd;
    }

    public String getDetallesProd2() {
        return detallesProd2;
    }

    public void setDetallesProd2(String detallesProd2) {
        this.detallesProd2 = detallesProd2;
    }

    public int getIdPreguntaF() {
        return idPreguntaF;
    }

    public void setIdPreguntaF(int idPreguntaF) {
        this.idPreguntaF = idPreguntaF;
    }

    public int getIdPersonaF() {
        return idPersonaF;
    }

    public void setIdPersonaF(int idPersonaF) {
        this.idPersonaF = idPersonaF;
    }

    @Override
    public String toString() {
        return "FinanCostoProy{" + "idFinan=" + idFinan + ", montoSoliConadi=" + montoSoliConadi + ", montoSoliConadi2=" + montoSoliConadi2 + ", detallesProd=" + detallesProd + ", detallesProd2=" + detallesProd2 + ", idPreguntaF=" + idPreguntaF + ", idPersonaF=" + idPersonaF + '}';
    }

    
    
    
    
}
