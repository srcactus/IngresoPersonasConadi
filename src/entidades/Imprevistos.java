/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author Cactus
 */
public class Imprevistos {
    
    private int idImprevistos;
    private int montoSoliConadi;
    private String item;
    private int idPersonaF;

    public Imprevistos() {
    }

    public Imprevistos(int idImprevistos, int montoSoliConadi, String item, int idPersonaF) {
        this.setIdImprevistos(idImprevistos);
        this.setMontoSoliConadi(montoSoliConadi);
        this.setItem(item);
        this.setIdPersonaF(idPersonaF);
    }

    public int getIdImprevistos() {
        return idImprevistos;
    }

    public void setIdImprevistos(int idImprevistos) {
        this.idImprevistos = idImprevistos;
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
        return "Imprevistos{" + "idImprevistos=" + idImprevistos + ", montoSoliConadi=" + montoSoliConadi + ", item=" + item + ", idPersonaF=" + idPersonaF + '}';
    }

    
    
    
    
}
