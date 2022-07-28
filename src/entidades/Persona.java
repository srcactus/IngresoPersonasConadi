/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author Cactus
 */
public class Persona {
    
    private int idPersona;
    private String rut;
    private String nombres;
    private String apePat;
    private String apeMat;
    private String puebloIndigena;
    private String correo;
    private int telefono;
    private String fechaPostulacion;
    private int idDireccionF;
    
    

    public Persona() {
    }

    public Persona(int idPersona, String rut, String nombres, String apePat, String apeMat, String puebloIndigena, String correo, int telefono, String fechaPostulacion, int idDireccionF) {
        this.setIdPersona(idPersona);
        this.setRut(rut);
        this.setNombres(nombres);
        this.setApePat(apePat);
        this.setApeMat(apeMat);
        this.setPuebloIndigena(puebloIndigena);
        this.setCorreo(correo);
        this.setTelefono(telefono);
        this.setFechaPostulacion(fechaPostulacion);
        this.setIdDireccionF(idDireccionF);
    }

    public int getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApePat() {
        return apePat;
    }

    public void setApePat(String apePat) {
        this.apePat = apePat;
    }

    public String getApeMat() {
        return apeMat;
    }

    public void setApeMat(String apeMat) {
        this.apeMat = apeMat;
    }

    public String getPuebloIndigena() {
        return puebloIndigena;
    }

    public void setPuebloIndigena(String puebloIndigena) {
        this.puebloIndigena = puebloIndigena;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getFechaPostulacion() {
        return fechaPostulacion;
    }

    public void setFechaPostulacion(String fechaPostulacion) {
        this.fechaPostulacion = fechaPostulacion;
    }

    public int getIdDireccionF() {
        return idDireccionF;
    }

    public void setIdDireccionF(int idDireccionF) {
        this.idDireccionF = idDireccionF;
    }

    @Override
    public String toString() {
        return "Persona{" + "idPersona=" + idPersona + ", rut=" + rut + ", nombres=" + nombres + ", apePat=" + apePat + ", apeMat=" + apeMat + ", puebloIndigena=" + puebloIndigena + ", correo=" + correo + ", telefono=" + telefono + ", fechaPostulacion=" + fechaPostulacion + ", idDireccionF=" + idDireccionF + '}';
    }

    
    



    
    

    

    
    
    
}
