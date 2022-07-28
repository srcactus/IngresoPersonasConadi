/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author Cactus
 */
public class CronoActivi {
    
    private int idCronoActivi;
    private String actividad;
    private String responsable;
    private String mes;
    private int idPersonaF;

    public CronoActivi() {
    }

    public CronoActivi(int idCronoActivi, String actividad, String responsable, String mes, int idPersonaF) {
        this.setIdCronoActivi(idCronoActivi);
        this.setActividad(actividad);
        this.setResponsable(responsable);
        this.setMes(mes);
        this.setIdPersonaF(idPersonaF);
    }

    public int getIdCronoActivi() {
        return idCronoActivi;
    }

    public void setIdCronoActivi(int idCronoActivi) {
        this.idCronoActivi = idCronoActivi;
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
        return "CronoActivi{" + "idCronoActivi=" + idCronoActivi + ", actividad=" + actividad + ", responsable=" + responsable + ", mes=" + mes + ", idPersonaF=" + idPersonaF + '}';
    }

    
    
    
    
}
