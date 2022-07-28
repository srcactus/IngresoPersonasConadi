/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author Cactus
 */
public class FichaPostulante {
    
    private int idFichaPostulante;
    private String nombreProy;
    private String nombrePostulante;
    private String telefono;
    private String correo;
    private int idPersonaF;

    public FichaPostulante() {
    }

    public FichaPostulante(int idFichaPostulante, String nombreProy, String nombrePostulante, String telefono, String correo, int idPersonaF) {
        this.setIdFichaPostulante(idFichaPostulante);
        this.setNombreProy(nombreProy);
        this.setNombrePostulante(nombrePostulante);
        this.setTelefono(telefono);
        this.setCorreo(correo);
        this.setIdPersonaF(idPersonaF);
    }

    public int getIdFichaPostulante() {
        return idFichaPostulante;
    }

    public void setIdFichaPostulante(int idFichaPostulante) {
        this.idFichaPostulante = idFichaPostulante;
    }

    public String getNombreProy() {
        return nombreProy;
    }

    public void setNombreProy(String nombreProy) {
        this.nombreProy = nombreProy;
    }

    public String getNombrePostulante() {
        return nombrePostulante;
    }

    public void setNombrePostulante(String nombrePostulante) {
        this.nombrePostulante = nombrePostulante;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getIdPersonaF() {
        return idPersonaF;
    }

    public void setIdPersonaF(int idPersonaF) {
        this.idPersonaF = idPersonaF;
    }

    @Override
    public String toString() {
        return "FichaPostulante{" + "idFichaPostulante=" + idFichaPostulante + ", nombreProy=" + nombreProy + ", nombrePostulante=" + nombrePostulante + ", telefono=" + telefono + ", correo=" + correo + ", idPersonaF=" + idPersonaF + '}';
    }
    
    
    
}
