/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author Cactus
 */
public class GastosHonorarios {
    
    private int idHonorarios;
    private int montoSoliConadi;
    private int idPersonaF;
    private String item;

    public GastosHonorarios() {
    }

    public GastosHonorarios(int idHonorarios, int montoSoliConadi, int idPersonaF, String item) {
        this.setIdHonorarios(idHonorarios);
        this.setMontoSoliConadi(montoSoliConadi);
        this.setIdPersonaF(idPersonaF);
        this.setItem(item);
    }

    public int getIdHonorarios() {
        return idHonorarios;
    }

    public void setIdHonorarios(int idHonorarios) {
        this.idHonorarios = idHonorarios;
    }

    public int getMontoSoliConadi() {
        return montoSoliConadi;
    }

    public void setMontoSoliConadi(int montoSoliConadi) {
        this.montoSoliConadi = montoSoliConadi;
    }

    public int getIdPersonaF() {
        return idPersonaF;
    }

    public void setIdPersonaF(int idPersonaF) {
        this.idPersonaF = idPersonaF;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    @Override
    public String toString() {
        return "GastosHonorarios{" + "idHonorarios=" + idHonorarios + ", montoSoliConadi=" + montoSoliConadi + ", idPersonaF=" + idPersonaF + ", item=" + item + '}';
    }

    

    
    
    
    
}
