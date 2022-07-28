/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author Cactus
 */
public class CartaGant {
    
    private int idGant;
    private String actividad;
    private String responsable;
    private String mes;
    private int idPersonaF;

    public CartaGant() {
    }

    public CartaGant(int idGant, String actividad, String responsable, String mes, int idPersonaF) {
        this.setIdGant(idGant);
        this.setActividad(actividad);
        this.setResponsable(responsable);
        this.setMes(mes);
        this.setIdPersonaF(idPersonaF);
    }

    public int getIdGant() {
        return idGant;
    }

    public void setIdGant(int idGant) {
        this.idGant = idGant;
    }

    public String getActividad() {
        return actividad;
    }

    public void setActividad(String actividad) {
        this.actividad = actividad;
    }

    public String getResponsable() {
        return responsable;
    }

    public void setResponsable(String responsable) {
        this.responsable = responsable;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public int getIdPersonaF() {
        return idPersonaF;
    }

    public void setIdPersonaF(int idPersonaF) {
        this.idPersonaF = idPersonaF;
    }

    @Override
    public String toString() {
        return "CartaGant{" + "idGant=" + idGant + ", actividad=" + actividad + ", responsable=" + responsable + ", mes=" + mes + ", idPersonaF=" + idPersonaF + '}';
    }
    
    

    
    
    
           
    
}
