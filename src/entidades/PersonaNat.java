/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author Cactus
 */
public class PersonaNat {
    
    private int idNat;
    private String nombres;
    private String apellidoPat;
    private String apellidoMat;
    private String rut;
    private String estadoCivil;
    private String correo;
    private String telefono;
    private String telefonoDos;
    private String fechaNac;
    private int idDireccionF;

    public PersonaNat() {
    }

    public PersonaNat(int idNat, String nombres, String apellidoPat, String apellidoMat, String rut, String estadoCivil, String correo, String telefono, String telefonoDos, String fechaNac, int idDireccionF) {
        this.setIdNat(idNat);
        this.setNombres(nombres);
        this.setApellidoPat(apellidoPat);
        this.setApellidoMat(apellidoMat);
        this.setRut(rut);
        this.setEstadoCivil(estadoCivil);
        this.setCorreo(correo);
        this.setTelefono(telefono);
        this.setTelefonoDos(telefonoDos);
        this.setFechaNac(fechaNac);
        this.setIdDireccionF(idDireccionF);
    }

    public int getIdNat() {
        return idNat;
    }

    public void setIdNat(int idNat) {
        this.idNat = idNat;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidoPat() {
        return apellidoPat;
    }

    public void setApellidoPat(String apellidoPat) {
        this.apellidoPat = apellidoPat;
    }

    public String getApellidoMat() {
        return apellidoMat;
    }

    public void setApellidoMat(String apellidoMat) {
        this.apellidoMat = apellidoMat;
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

    public String getTelefonoDos() {
        return telefonoDos;
    }

    public void setTelefonoDos(String telefonoDos) {
        this.telefonoDos = telefonoDos;
    }

    public String getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(String fechaNac) {
        this.fechaNac = fechaNac;
    }

    public int getIdDireccionF() {
        return idDireccionF;
    }

    public void setIdDireccionF(int idDireccionF) {
        this.idDireccionF = idDireccionF;
    }

    @Override
    public String toString() {
        return "PersonaNat{" + "idNat=" + idNat + ", nombres=" + nombres + ", apellidoPat=" + apellidoPat + ", apellidoMat=" + apellidoMat + ", rut=" + rut + ", estadoCivil=" + estadoCivil + ", correo=" + correo + ", telefono=" + telefono + ", telefonoDos=" + telefonoDos + ", fechaNac=" + fechaNac + ", idDireccionF=" + idDireccionF + '}';
    }

    

    
    
    

    
    
    
    
}
