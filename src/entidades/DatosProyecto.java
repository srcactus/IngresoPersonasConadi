/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author Cactus
 */
public class DatosProyecto {
    
    private int idDatosProy;
    private String nombreProy;
    private String sectorComunidad;
    private String propImplProy;
    private String sitPropInm;
    private int idDireccionF;
    private int idPersonaF;
    
    

    public DatosProyecto() {
    }

    public DatosProyecto(int idDatosProy, String nombreProy, String sectorComunidad, String propImplProy, String sitPropInm, int idDireccionF, int idPersonaF) {
        this.setIdDatosProy(idDatosProy);
        this.setNombreProy(nombreProy);
        this.setSectorComunidad(sectorComunidad);
        this.setPropImplProy(propImplProy);
        this.setSitPropInm(sitPropInm);
        this.setIdDireccionF(idDireccionF);
        this.setIdPersonaF(idPersonaF);
    }

    public int getIdDatosProy() {
        return idDatosProy;
    }

    public void setIdDatosProy(int idDatosProy) {
        this.idDatosProy = idDatosProy;
    }

    public String getNombreProy() {
        return nombreProy;
    }

    public void setNombreProy(String nombreProy) {
        this.nombreProy = nombreProy;
    }

    public String getSectorComunidad() {
        return sectorComunidad;
    }

    public void setSectorComunidad(String sectorComunidad) {
        this.sectorComunidad = sectorComunidad;
    }

    public String getPropImplProy() {
        return propImplProy;
    }

    public void setPropImplProy(String propImplProy) {
        this.propImplProy = propImplProy;
    }

    public String getSitPropInm() {
        return sitPropInm;
    }

    public void setSitPropInm(String sitPropInm) {
        this.sitPropInm = sitPropInm;
    }

    public int getIdDireccionF() {
        return idDireccionF;
    }

    public void setIdDireccionF(int idDireccionF) {
        this.idDireccionF = idDireccionF;
    }

    public int getIdPersonaF() {
        return idPersonaF;
    }

    public void setIdPersonaF(int idPersonaF) {
        this.idPersonaF = idPersonaF;
    }

    @Override
    public String toString() {
        return "DatosProyecto{" + "idDatosProy=" + idDatosProy + ", nombreProy=" + nombreProy + ", sectorComunidad=" + sectorComunidad + ", propImplProy=" + propImplProy + ", sitPropInm=" + sitPropInm + ", idDireccionF=" + idDireccionF + ", idPersonaF=" + idPersonaF + '}';
    }

    
    
    
    
}
