/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author Cactus
 */
public class Provincia {
    
    private int idProvincia;
    private String nombreProv;
    private int idRegionF;
    private String nombreProvDatosProyecto;
    private int idProvDatosProyecto;
    private String nombreProvRepreLegal;
    private int idProvRepreLegal;
    private String nombreProvPersNat;
    private int idProvPersNat;
    

    public Provincia() {
    }

    public Provincia(int idProvincia, String nombreProv, int idRegionF, String nombreProvDatosProyecto, int idProvDatosProyecto, String nombreProvRepreLegal, int idProvRepreLegal, String nombreProvPersNat, int idProvPersNat) {
        this.setIdProvincia(idProvincia);
        this.setNombreProv(nombreProv);
        this.setIdRegionF(idRegionF);
        this.setNombreProvDatosProyecto(nombreProvDatosProyecto);
        this.setIdProvDatosProyecto(idProvDatosProyecto);
        this.setNombreProvRepreLegal(nombreProvRepreLegal);
        this.setIdProvRepreLegal(idProvRepreLegal);
        this.setNombreProvPersNat(nombreProvPersNat);
        this.setIdProvPersNat(idProvPersNat);
    }

    public int getIdProvincia() {
        return idProvincia;
    }

    public void setIdProvincia(int idProvincia) {
        this.idProvincia = idProvincia;
    }

    public String getNombreProv() {
        return nombreProv;
    }

    public void setNombreProv(String nombreProv) {
        this.nombreProv = nombreProv;
    }

    public int getIdRegionF() {
        return idRegionF;
    }

    public void setIdRegionF(int idRegionF) {
        this.idRegionF = idRegionF;
    }

    public String getNombreProvDatosProyecto() {
        return nombreProvDatosProyecto;
    }

    public void setNombreProvDatosProyecto(String nombreProvDatosProyecto) {
        this.nombreProvDatosProyecto = nombreProvDatosProyecto;
    }

    public int getIdProvDatosProyecto() {
        return idProvDatosProyecto;
    }

    public void setIdProvDatosProyecto(int idProvDatosProyecto) {
        this.idProvDatosProyecto = idProvDatosProyecto;
    }

    public String getNombreProvRepreLegal() {
        return nombreProvRepreLegal;
    }

    public void setNombreProvRepreLegal(String nombreProvRepreLegal) {
        this.nombreProvRepreLegal = nombreProvRepreLegal;
    }

    public int getIdProvRepreLegal() {
        return idProvRepreLegal;
    }

    public void setIdProvRepreLegal(int idProvRepreLegal) {
        this.idProvRepreLegal = idProvRepreLegal;
    }

    public String getNombreProvPersNat() {
        return nombreProvPersNat;
    }

    public void setNombreProvPersNat(String nombreProvPersNat) {
        this.nombreProvPersNat = nombreProvPersNat;
    }

    public int getIdProvPersNat() {
        return idProvPersNat;
    }

    public void setIdProvPersNat(int idProvPersNat) {
        this.idProvPersNat = idProvPersNat;
    }

    @Override
    public String toString() {
        return "Provincia{" + "idProvincia=" + idProvincia + ", nombreProv=" + nombreProv + ", idRegionF=" + idRegionF + ", nombreProvDatosProyecto=" + nombreProvDatosProyecto + ", idProvDatosProyecto=" + idProvDatosProyecto + ", nombreProvRepreLegal=" + nombreProvRepreLegal + ", idProvRepreLegal=" + idProvRepreLegal + ", nombreProvPersNat=" + nombreProvPersNat + ", idProvPersNat=" + idProvPersNat + '}';
    }


    
    
}
