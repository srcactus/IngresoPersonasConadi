/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author Cactus
 */
public class FinanInstPublPriv {
    
    private int idPublPriv;
    private String institucion;
    private String tipoInversion;
    private int anio;
    private int monto;
    private int idPersonaF;

    public FinanInstPublPriv() {
    }

    public FinanInstPublPriv(int idPublPriv, String institucion, String tipoInversion, int anio, int monto, int idPersonaF) {
        this.setIdPublPriv(idPublPriv);
        this.setInstitucion(institucion);
        this.setTipoInversion(tipoInversion);
        this.setAnio(anio);
        this.setMonto(monto);
        this.setIdPersonaF(idPersonaF);
    }

    public int getIdPublPriv() {
        return idPublPriv;
    }

    public void setIdPublPriv(int idPublPriv) {
        this.idPublPriv = idPublPriv;
    }

    public String getInstitucion() {
        return institucion;
    }

    public void setInstitucion(String institucion) {
        this.institucion = institucion;
    }

    public String getTipoInversion() {
        return tipoInversion;
    }

    public void setTipoInversion(String tipoInversion) {
        this.tipoInversion = tipoInversion;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public int getMonto() {
        return monto;
    }

    public void setMonto(int monto) {
        this.monto = monto;
    }

    public int getIdPersonaF() {
        return idPersonaF;
    }

    public void setIdPersonaF(int idPersonaF) {
        this.idPersonaF = idPersonaF;
    }

    @Override
    public String toString() {
        return "FinanInstPublPriv{" + "idPublPriv=" + idPublPriv + ", institucion=" + institucion + ", tipoInversion=" + tipoInversion + ", anio=" + anio + ", monto=" + monto + ", idPersonaF=" + idPersonaF + '}';
    }
    
    
    
}
