/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author Cactus
 */
public class GastosInversion {
    
    private int idInversion;
    private int montoSoliConadi;
    private String item;
    private int idPersonaF;

    public GastosInversion() {
    }

    public GastosInversion(int idInversion, int montoSoliConadi, String item, int idPersonaF) {
        this.setIdInversion(idInversion);
        this.setMontoSoliConadi(montoSoliConadi);
        this.setItem(item);
        this.setIdPersonaF(idPersonaF);
    }

    public int getIdInversion() {
        return idInversion;
    }

    public void setIdInversion(int idInversion) {
        this.idInversion = idInversion;
    }

    public int getMontoSoliConadi() {
        return montoSoliConadi;
    }

    public void setMontoSoliConadi(int montoSoliConadi) {
        this.montoSoliConadi = montoSoliConadi;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public int getIdPersonaF() {
        return idPersonaF;
    }

    public void setIdPersonaF(int idPersonaF) {
        this.idPersonaF = idPersonaF;
    }

    @Override
    public String toString() {
        return "GastosInversion{" + "idInversion=" + idInversion + ", montoSoliConadi=" + montoSoliConadi + ", item=" + item + ", idPersonaF=" + idPersonaF + '}';
    }

    
    
    
    
}
