/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author Cactus
 */
public class Direccion {
    
    private int idDireccion;
    private String direccion;
    private String direccionDatosProyecto;
    private int idComunaDatosProyectoF;
    private int idComunaF;
    private String direccionPersonaNat;
    private int idComunaPersonaNat;
    private String direccionRepreLegal;
    private int idDireccionRepreLegal;
    private int idDatosProyecto;
    private int idDireccionPersNat;
    
    

    public Direccion() {
    }

    public Direccion(int idDireccion, String direccion, String direccionDatosProyecto, int idComunaDatosProyectoF, int idComunaF, String direccionPersonaNat, int idComunaPersonaNat, String direccionRepreLegal, int idDireccionRepreLegal, int idDatosProyecto, int idDireccionPersNat) {
        this.setDireccionDatosProyecto(direccionDatosProyecto);
        this.setIdComunaDatosProyectoF(idComunaDatosProyectoF);
        this.setIdDireccion(idDireccion);
        this.setDireccion(direccion);
        this.setIdComunaF(idComunaF);
        this.setDireccionPersonaNat(direccionPersonaNat);
        this.setIdComunaPersonaNat(idComunaPersonaNat);
        this.setDireccionRepreLegal(direccionRepreLegal);
        this.setIdDireccionRepreLegal(idDireccionRepreLegal);
        this.setIdDatosProyecto(idDatosProyecto);
        this.setIdDireccionPersNat(idDireccionPersNat);
    }

    public int getIdDireccion() {
        return idDireccion;
    }

    public void setIdDireccion(int idDireccion) {
        this.idDireccion = idDireccion;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getDireccionDatosProyecto() {
        return direccionDatosProyecto;
    }

    public void setDireccionDatosProyecto(String direccionDatosProyecto) {
        this.direccionDatosProyecto = direccionDatosProyecto;
    }

    public int getIdComunaDatosProyectoF() {
        return idComunaDatosProyectoF;
    }

    public void setIdComunaDatosProyectoF(int idComunaDatosProyectoF) {
        this.idComunaDatosProyectoF = idComunaDatosProyectoF;
    }

    public int getIdComunaF() {
        return idComunaF;
    }

    public void setIdComunaF(int idComunaF) {
        this.idComunaF = idComunaF;
    }

    public String getDireccionPersonaNat() {
        return direccionPersonaNat;
    }

    public void setDireccionPersonaNat(String direccionPersonaNat) {
        this.direccionPersonaNat = direccionPersonaNat;
    }

    public int getIdComunaPersonaNat() {
        return idComunaPersonaNat;
    }

    public void setIdComunaPersonaNat(int idComunaPersonaNat) {
        this.idComunaPersonaNat = idComunaPersonaNat;
    }

    public String getDireccionRepreLegal() {
        return direccionRepreLegal;
    }

    public void setDireccionRepreLegal(String direccionRepreLegal) {
        this.direccionRepreLegal = direccionRepreLegal;
    }

    public int getIdDireccionRepreLegal() {
        return idDireccionRepreLegal;
    }

    public void setIdDireccionRepreLegal(int idDireccionRepreLegal) {
        this.idDireccionRepreLegal = idDireccionRepreLegal;
    }

    public int getIdDatosProyecto() {
        return idDatosProyecto;
    }

    public void setIdDatosProyecto(int idDatosProyecto) {
        this.idDatosProyecto = idDatosProyecto;
    }

    public int getIdDireccionPersNat() {
        return idDireccionPersNat;
    }

    public void setIdDireccionPersNat(int idDireccionPersNat) {
        this.idDireccionPersNat = idDireccionPersNat;
    }

    @Override
    public String toString() {
        return "Direccion{" + "idDireccion=" + idDireccion + ", direccion=" + direccion + ", direccionDatosProyecto=" + direccionDatosProyecto + ", idComunaDatosProyectoF=" + idComunaDatosProyectoF + ", idComunaF=" + idComunaF + ", direccionPersonaNat=" + direccionPersonaNat + ", idComunaPersonaNat=" + idComunaPersonaNat + ", direccionRepreLegal=" + direccionRepreLegal + ", idDireccionRepreLegal=" + idDireccionRepreLegal + ", idDatosProyecto=" + idDatosProyecto + ", idDireccionPersNat=" + idDireccionPersNat + '}';
    }

    

    
}
