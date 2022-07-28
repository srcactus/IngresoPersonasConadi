/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author Cactus
 */
public class GastosOperacion {
    
    private int idOperacion;
    private int montoSoliConadi;
    private String item;
    private int idPersonaF;

    public GastosOperacion() {
    }

    public GastosOperacion(int idOperacion, int montoSoliConadi, String item, int idPersonaF) {
        this.setIdOperacion(idOperacion);
        this.setMontoSoliConadi(montoSoliConadi);
        this.setItem(item);
        this.setIdPersonaF(idPersonaF);
    }

    public int getIdOperacion() {
        return idOperacion;
    }

    public void setIdOperacion(int idOperacion) {
        this.idOperacion = idOperacion;
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
        return "GastosOperacion{" + "idOperacion=" + idOperacion + ", montoSoliConadi=" + montoSoliConadi + ", item=" + item + ", idPersonaF=" + idPersonaF + '}';
    }

    
    
    
    
}
