/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author Cactus
 */
public class Comuna {
    
    private int idComuna;
    private String nombreCom;
    private int idProvinciaF;
    private String nombreComDatosProyecto;
    private int idComDatosProyecto;
    private String nombreComRepreLegal;
    private int idComRepreLegal;
    private String nombreComPersNat;
    private int idComPersNat;

    public Comuna() {
    }

    public Comuna(int idComuna, String nombreCom, int idProvinciaF, String nombreComDatosProyecto, int idComDatosProyecto, String nombreComRepreLegal, int idComRepreLegal, String nombreComPersNat, int idComPersNat) {
        this.setIdComuna(idComuna);
        this.setNombreCom(nombreCom);
        this.setIdProvinciaF(idProvinciaF);
        this.setNombreComDatosProyecto(nombreComDatosProyecto);
        this.setIdComDatosProyecto(idComDatosProyecto);
        this.setNombreComRepreLegal(nombreComRepreLegal);
        this.setIdComRepreLegal(idComRepreLegal);
        this.setNombreComPersNat(nombreComPersNat);
        this.setIdComPersNat(idComPersNat);
    }

    public int getIdComuna() {
        return idComuna;
    }

    public void setIdComuna(int idComuna) {
        this.idComuna = idComuna;
    }

    public String getNombreCom() {
        return nombreCom;
    }

    public void setNombreCom(String nombreCom) {
        this.nombreCom = nombreCom;
    }

    public int getIdProvinciaF() {
        return idProvinciaF;
    }

    public void setIdProvinciaF(int idProvinciaF) {
        this.idProvinciaF = idProvinciaF;
    }

    public String getNombreComDatosProyecto() {
        return nombreComDatosProyecto;
    }

    public void setNombreComDatosProyecto(String nombreComDatosProyecto) {
        this.nombreComDatosProyecto = nombreComDatosProyecto;
    }

    public int getIdComDatosProyecto() {
        return idComDatosProyecto;
    }

    public void setIdComDatosProyecto(int idComDatosProyecto) {
        this.idComDatosProyecto = idComDatosProyecto;
    }

    public String getNombreComRepreLegal() {
        return nombreComRepreLegal;
    }

    public void setNombreComRepreLegal(String nombreComRepreLegal) {
        this.nombreComRepreLegal = nombreComRepreLegal;
    }

    public int getIdComRepreLegal() {
        return idComRepreLegal;
    }

    public void setIdComRepreLegal(int idComRepreLegal) {
        this.idComRepreLegal = idComRepreLegal;
    }

    public String getNombreComPersNat() {
        return nombreComPersNat;
    }

    public void setNombreComPersNat(String nombreComPersNat) {
        this.nombreComPersNat = nombreComPersNat;
    }

    public int getIdComPersNat() {
        return idComPersNat;
    }

    public void setIdComPersNat(int idComPersNat) {
        this.idComPersNat = idComPersNat;
    }

    @Override
    public String toString() {
        return "Comuna{" + "idComuna=" + idComuna + ", nombreCom=" + nombreCom + ", idProvinciaF=" + idProvinciaF + ", nombreComDatosProyecto=" + nombreComDatosProyecto + ", idComDatosProyecto=" + idComDatosProyecto + ", nombreComRepreLegal=" + nombreComRepreLegal + ", idComRepreLegal=" + idComRepreLegal + ", nombreComPersNat=" + nombreComPersNat + ", idComPersNat=" + idComPersNat + '}';
    }

    
    

    
    
    
    
}
