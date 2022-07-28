/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author Cactus
 */
public class GantCarta {
    
    private int idGantCarta;
    private String actividad;
    private int mes;
    private String respEjecutar;
    private int idPersonaF;

    public GantCarta() {
    }

    public GantCarta(int idGantCarta, String actividad, int mes, String respEjecutar, int idPersonaF) {
        this.setIdGantCarta(idGantCarta);
        this.setActividad(actividad);
        this.setMes(mes);
        this.setRespEjecutar(respEjecutar);
        this.setIdPersonaF(idPersonaF);
    }

    public int getIdGantCarta() {
        return idGantCarta;
    }

    public void setIdGantCarta(int idGantCarta) {
        this.idGantCarta = idGantCarta;
    }

    public String getActividad() {
        return actividad;
    }

    public void setActividad(String actividad) {
        this.actividad = actividad;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public String getRespEjecutar() {
        return respEjecutar;
    }

    public void setRespEjecutar(String respEjecutar) {
        this.respEjecutar = respEjecutar;
    }

    public int getIdPersonaF() {
        return idPersonaF;
    }

    public void setIdPersonaF(int idPersonaF) {
        this.idPersonaF = idPersonaF;
    }

    @Override
    public String toString() {
        return "GantCarta{" + "idGantCarta=" + idGantCarta + ", actividad=" + actividad + ", mes=" + mes + ", respEjecutar=" + respEjecutar + ", idPersonaF=" + idPersonaF + '}';
    }
    
    
    
}
