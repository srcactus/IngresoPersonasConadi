/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author Cactus
 */
public class Region {
    
    private int idRegion;
    private String nombreReg;
    private int idRegDatosProyecto;
    private String nombreRegDatosProyecto;
    private int idRegRepreLegal;
    private String nombreRegRepreLegal;
    private int idRegPersNat;
    private String nombreRegPersNat;

    public Region() {
    }

    public Region(int idRegion, String nombreReg, int idRegDatosProyecto, String nombreRegDatosProyecto, int idRegRepreLegal, String nombreRegRepreLegal, int idRegPersNat, String nombreRegPersNat) {
        this.setIdRegion(idRegion);
        this.setNombreReg(nombreReg);
        this.setIdRegDatosProyecto(idRegDatosProyecto);
        this.setNombreRegDatosProyecto(nombreRegDatosProyecto);
        this.setIdRegRepreLegal(idRegRepreLegal);
        this.setNombreRegRepreLegal(nombreRegRepreLegal);
        this.setIdRegPersNat(idRegPersNat);
        this.setNombreRegPersNat(nombreRegPersNat);
    }

    public int getIdRegion() {
        return idRegion;
    }

    public void setIdRegion(int idRegion) {
        this.idRegion = idRegion;
    }

    public String getNombreReg() {
        return nombreReg;
    }

    public void setNombreReg(String nombreReg) {
        this.nombreReg = nombreReg;
    }

    public int getIdRegDatosProyecto() {
        return idRegDatosProyecto;
    }

    public void setIdRegDatosProyecto(int idRegDatosProyecto) {
        this.idRegDatosProyecto = idRegDatosProyecto;
    }

    public String getNombreRegDatosProyecto() {
        return nombreRegDatosProyecto;
    }

    public void setNombreRegDatosProyecto(String nombreRegDatosProyecto) {
        this.nombreRegDatosProyecto = nombreRegDatosProyecto;
    }

    public int getIdRegRepreLegal() {
        return idRegRepreLegal;
    }

    public void setIdRegRepreLegal(int idRegRepreLegal) {
        this.idRegRepreLegal = idRegRepreLegal;
    }

    public String getNombreRegRepreLegal() {
        return nombreRegRepreLegal;
    }

    public void setNombreRegRepreLegal(String nombreRegRepreLegal) {
        this.nombreRegRepreLegal = nombreRegRepreLegal;
    }

    public int getIdRegPersNat() {
        return idRegPersNat;
    }

    public void setIdRegPersNat(int idRegPersNat) {
        this.idRegPersNat = idRegPersNat;
    }

    public String getNombreRegPersNat() {
        return nombreRegPersNat;
    }

    public void setNombreRegPersNat(String nombreRegPersNat) {
        this.nombreRegPersNat = nombreRegPersNat;
    }

    @Override
    public String toString() {
        return "Region{" + "idRegion=" + idRegion + ", nombreReg=" + nombreReg + ", idRegDatosProyecto=" + idRegDatosProyecto + ", nombreRegDatosProyecto=" + nombreRegDatosProyecto + ", idRegRepreLegal=" + idRegRepreLegal + ", nombreRegRepreLegal=" + nombreRegRepreLegal + ", idRegPersNat=" + idRegPersNat + ", nombreRegPersNat=" + nombreRegPersNat + '}';
    }

    

    

    
    
    
}
