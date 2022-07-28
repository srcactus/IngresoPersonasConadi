/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author Cactus
 */
public class PresSoliConadi {
    
    private int idPres;
    private int idHonorariosF;
    private int idOperacionF;
    private int idInversionF;
    private int idImprevistosF;
    private int idPersonaF;

    public PresSoliConadi() {
    }

    public PresSoliConadi(int idPres, int idHonorariosF, int idOperacionF, int idInversionF, int idImprevistosF, int idPersonaF) {
        this.setIdPres(idPres);
        this.setIdHonorariosF(idHonorariosF);
        this.setIdOperacionF(idOperacionF);
        this.setIdInversionF(idInversionF);
        this.setIdImprevistosF(idImprevistosF);
        this.setIdPersonaF(idPersonaF);
    }

    public int getIdPres() {
        return idPres;
    }

    public void setIdPres(int idPres) {
        this.idPres = idPres;
    }

    public int getIdHonorariosF() {
        return idHonorariosF;
    }

    public void setIdHonorariosF(int idHonorariosF) {
        this.idHonorariosF = idHonorariosF;
    }

    public int getIdOperacionF() {
        return idOperacionF;
    }

    public void setIdOperacionF(int idOperacionF) {
        this.idOperacionF = idOperacionF;
    }

    public int getIdInversionF() {
        return idInversionF;
    }

    public void setIdInversionF(int idInversionF) {
        this.idInversionF = idInversionF;
    }

    public int getIdImprevistosF() {
        return idImprevistosF;
    }

    public void setIdImprevistosF(int idImprevistosF) {
        this.idImprevistosF = idImprevistosF;
    }

    public int getIdPersonaF() {
        return idPersonaF;
    }

    public void setIdPersonaF(int idPersonaF) {
        this.idPersonaF = idPersonaF;
    }

    @Override
    public String toString() {
        return "PresSoliConadi{" + "idPres=" + idPres + ", idHonorariosF=" + idHonorariosF + ", idOperacionF=" + idOperacionF + ", idInversionF=" + idInversionF + ", idImprevistosF=" + idImprevistosF + ", idPersonaF=" + idPersonaF + '}';
    }
    
    
    
}
