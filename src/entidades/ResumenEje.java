/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author Cactus
 */
public class ResumenEje {
    
    private int idResuEje;
    private String tipoPostulante;
    private String autoridadTradiAgenAnces;
    private int numCertIndi;
    private String puebloPertenece;
    private int persJurF;
    private int persNatF;
    private int idDatosProyF;
    private int idIdentiRepreLegalF;
    

    public ResumenEje() {
    }

    public ResumenEje(int idResuEje, String tipoPostulante, String autoridadTradiAgenAnces, int numCertIndi, String puebloPertenece, int persJurF, int persNatF, int idDatosProyF, int idIdentiRepreLegalF) {
        this.setIdResuEje(idResuEje);
        this.setTipoPostulante(tipoPostulante);
        this.setAutoridadTradiAgenAnces(autoridadTradiAgenAnces);
        this.setNumCertIndi(numCertIndi);
        this.setPuebloPertenece(puebloPertenece);
        this.setPersJurF(persJurF);
        this.setPersNatF(persNatF);
        this.setIdDatosProyF(idDatosProyF);
        this.setIdIdentiRepreLegalF(idIdentiRepreLegalF);
    }

    public int getIdResuEje() {
        return idResuEje;
    }

    public void setIdResuEje(int idResuEje) {
        this.idResuEje = idResuEje;
    }

    public String getTipoPostulante() {
        return tipoPostulante;
    }

    public void setTipoPostulante(String tipoPostulante) {
        this.tipoPostulante = tipoPostulante;
    }

    public String getAutoridadTradiAgenAnces() {
        return autoridadTradiAgenAnces;
    }

    public void setAutoridadTradiAgenAnces(String autoridadTradiAgenAnces) {
        this.autoridadTradiAgenAnces = autoridadTradiAgenAnces;
    }

    public int getNumCertIndi() {
        return numCertIndi;
    }

    public void setNumCertIndi(int numCertIndi) {
        this.numCertIndi = numCertIndi;
    }

    public String getPuebloPertenece() {
        return puebloPertenece;
    }

    public void setPuebloPertenece(String puebloPertenece) {
        this.puebloPertenece = puebloPertenece;
    }

    public int getPersJurF() {
        return persJurF;
    }

    public void setPersJurF(int persJurF) {
        this.persJurF = persJurF;
    }

    public int getPersNatF() {
        return persNatF;
    }

    public void setPersNatF(int persNatF) {
        this.persNatF = persNatF;
    }

    public int getIdDatosProyF() {
        return idDatosProyF;
    }

    public void setIdDatosProyF(int idDatosProyF) {
        this.idDatosProyF = idDatosProyF;
    }

    public int getIdIdentiRepreLegalF() {
        return idIdentiRepreLegalF;
    }

    public void setIdIdentiRepreLegalF(int idIdentiRepreLegalF) {
        this.idIdentiRepreLegalF = idIdentiRepreLegalF;
    }

    @Override
    public String toString() {
        return "ResumenEje{" + "idResuEje=" + idResuEje + ", tipoPostulante=" + tipoPostulante + ", autoridadTradiAgenAnces=" + autoridadTradiAgenAnces + ", numCertIndi=" + numCertIndi + ", puebloPertenece=" + puebloPertenece + ", persJurF=" + persJurF + ", persNatF=" + persNatF + ", idDatosProyF=" + idDatosProyF + ", idIdentiRepreLegalF=" + idIdentiRepreLegalF + '}';
    }

    
    

    
    
    
    
}
