/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author Cactus
 */
public class DatosPersonaPostulante {
    
    private int idDatosPersPost;
    private String telefonoDos;
    private String sector;
    private int numCertIndigena;
    private int idPersonaF;

    public DatosPersonaPostulante() {
    }

    public DatosPersonaPostulante(int idDatosPersPost, String telefonoDos, String sector, int numCertIndigena, int idPersonaF) {
        this.setIdDatosPersPost(idDatosPersPost);
        this.setTelefonoDos(telefonoDos);
        this.setSector(sector);
        this.setNumCertIndigena(numCertIndigena);
        this.setIdPersonaF(idPersonaF);
    }

    public int getIdDatosPersPost() {
        return idDatosPersPost;
    }

    public void setIdDatosPersPost(int idDatosPersPost) {
        this.idDatosPersPost = idDatosPersPost;
    }

    public String getTelefonoDos() {
        return telefonoDos;
    }

    public void setTelefonoDos(String telefonoDos) {
        this.telefonoDos = telefonoDos;
    }

    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }

    public int getNumCertIndigena() {
        return numCertIndigena;
    }

    public void setNumCertIndigena(int numCertIndigena) {
        this.numCertIndigena = numCertIndigena;
    }

    public int getIdPersonaF() {
        return idPersonaF;
    }

    public void setIdPersonaF(int idPersonaF) {
        this.idPersonaF = idPersonaF;
    }

    @Override
    public String toString() {
        return "DatosPersonaPostulante{" + "idDatosPersPost=" + idDatosPersPost + ", telefonoDos=" + telefonoDos + ", sector=" + sector + ", numCertIndigena=" + numCertIndigena + ", idPersonaF=" + idPersonaF + '}';
    }
    
    
    
}
