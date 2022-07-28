/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author Cactus
 */
public class CostoRes {
    
    private int idCostoRes;
    private int aporteSoliConadi;
    private int aportePropioPost;
    private int idPersonaF;

    public CostoRes() {
    }

    public CostoRes(int idCostoRes, int aporteSoliConadi, int aportePropioPost, int idPersonaF) {
        this.setIdCostoRes(idCostoRes);
        this.setAporteSoliConadi(aporteSoliConadi);
        this.setAportePropioPost(aportePropioPost);
        this.setIdPersonaF(idPersonaF);
    }

    public int getIdCostoRes() {
        return idCostoRes;
    }

    public void setIdCostoRes(int idCostoRes) {
        this.idCostoRes = idCostoRes;
    }

    public int getAporteSoliConadi() {
        return aporteSoliConadi;
    }

    public void setAporteSoliConadi(int aporteSoliConadi) {
        this.aporteSoliConadi = aporteSoliConadi;
    }

    public int getAportePropioPost() {
        return aportePropioPost;
    }

    public void setAportePropioPost(int aportePropioPost) {
        this.aportePropioPost = aportePropioPost;
    }

    public int getIdPersonaF() {
        return idPersonaF;
    }

    public void setIdPersonaF(int idPersonaF) {
        this.idPersonaF = idPersonaF;
    }

    @Override
    public String toString() {
        return "CostoRes{" + "idCostoRes=" + idCostoRes + ", aporteSoliConadi=" + aporteSoliConadi + ", aportePropioPost=" + aportePropioPost + ", idPersonaF=" + idPersonaF + '}';
    }
    
    
    
}
