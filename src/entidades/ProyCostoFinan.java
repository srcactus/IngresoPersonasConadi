/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author Cactus
 */
public class ProyCostoFinan {
    
    private int idProyCostoFinan;
    private int montoSoliConadi;
    
    private String detalle;
    
    private int idPersonaF;
    private int idPreguntaF;
    private String detalle2;
    private String detalle3;
    private int montoSoliConadi2;
    private int montoSoliConadi3;

    public ProyCostoFinan() {
    }

    public ProyCostoFinan(int idProyCostoFinan, int montoSoliConadi, String detalle, int idPersonaF, int idPreguntaF, String detalle2, String detalle3, int montoSoliConadi2, int montoSoliConadi3) {
        this.setIdProyCostoFinan(idProyCostoFinan);
        this.setMontoSoliConadi(montoSoliConadi);
        this.setDetalle(detalle);
        this.setIdPersonaF(idPersonaF);
        this.setIdPreguntaF(idPreguntaF);
        this.setDetalle2(detalle2);
        this.setDetalle3(detalle3);
        this.setMontoSoliConadi2(montoSoliConadi2);
        this.setMontoSoliConadi3(montoSoliConadi3);
    }

    public int getIdProyCostoFinan() {
        return idProyCostoFinan;
    }

    public void setIdProyCostoFinan(int idProyCostoFinan) {
        this.idProyCostoFinan = idProyCostoFinan;
    }

    public int getMontoSoliConadi() {
        return montoSoliConadi;
    }

    public void setMontoSoliConadi(int montoSoliConadi) {
        this.montoSoliConadi = montoSoliConadi;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public int getIdPersonaF() {
        return idPersonaF;
    }

    public void setIdPersonaF(int idPersonaF) {
        this.idPersonaF = idPersonaF;
    }

    public int getIdPreguntaF() {
        return idPreguntaF;
    }

    public void setIdPreguntaF(int idPreguntaF) {
        this.idPreguntaF = idPreguntaF;
    }

    public String getDetalle2() {
        return detalle2;
    }

    public void setDetalle2(String detalle2) {
        this.detalle2 = detalle2;
    }

    public String getDetalle3() {
        return detalle3;
    }

    public void setDetalle3(String detalle3) {
        this.detalle3 = detalle3;
    }

    public int getMontoSoliConadi2() {
        return montoSoliConadi2;
    }

    public void setMontoSoliConadi2(int montoSoliConadi2) {
        this.montoSoliConadi2 = montoSoliConadi2;
    }

    public int getMontoSoliConadi3() {
        return montoSoliConadi3;
    }

    public void setMontoSoliConadi3(int montoSoliConadi3) {
        this.montoSoliConadi3 = montoSoliConadi3;
    }

    @Override
    public String toString() {
        return "ProyCostoFinan{" + "idProyCostoFinan=" + idProyCostoFinan + ", montoSoliConadi=" + montoSoliConadi + ", detalle=" + detalle + ", idPersonaF=" + idPersonaF + ", idPreguntaF=" + idPreguntaF + ", detalle2=" + detalle2 + ", detalle3=" + detalle3 + ", montoSoliConadi2=" + montoSoliConadi2 + ", montoSoliConadi3=" + montoSoliConadi3 + '}';
    }

    
    
    
    
}
