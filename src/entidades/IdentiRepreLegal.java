/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author Cactus
 */
public class IdentiRepreLegal {
    
    private int idRepreLegal;
    private String nombres;
    private String apePat;
    private String apeMat;
    private String rut;
    private String estadoCivil;
    private String correo;
    private String telefono;
    private String telefonoRecados;
    private String fechaNacimiento;
    private int idDireccionF;

    public IdentiRepreLegal() {
    }

    public IdentiRepreLegal(int idRepreLegal, String nombres, String apePat, String apeMat, String rut, String estadoCivil, String correo, String telefono, String telefonoRecados, String fechaNacimiento, int idDireccionF) {
        this.setIdRepreLegal(idRepreLegal);
        this.setNombres(nombres);
        this.setApePat(apePat);
        this.setApeMat(apeMat);
        this.setRut(rut);
        this.setEstadoCivil(estadoCivil);
        this.setCorreo(correo);
        this.setTelefono(telefono);
        this.setTelefonoRecados(telefonoRecados);
        this.setFechaNacimiento(fechaNacimiento);
        this.setIdDireccionF(idDireccionF);
    }

    public int getIdRepreLegal() {
        return idRepreLegal;
    }

    public void setIdRepreLegal(int idRepreLegal) {
        this.idRepreLegal = idRepreLegal;
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

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getTelefonoRecados() {
        return telefonoRecados;
    }

    public void setTelefonoRecados(String telefonoRecados) {
        this.telefonoRecados = telefonoRecados;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public int getIdDireccionF() {
        return idDireccionF;
    }

    public void setIdDireccionF(int idDireccionF) {
        this.idDireccionF = idDireccionF;
    }

    @Override
    public String toString() {
        return "IdentiRepreLegal{" + "idRepreLegal=" + idRepreLegal + ", nombres=" + nombres + ", apePat=" + apePat + ", apeMat=" + apeMat + ", rut=" + rut + ", estadoCivil=" + estadoCivil + ", correo=" + correo + ", telefono=" + telefono + ", telefonoRecados=" + telefonoRecados + ", fechaNacimiento=" + fechaNacimiento + ", idDireccionF=" + idDireccionF + '}';
    }

    
    
    
}
