/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author Cactus
 */
public class ResCostoProy {
    
    private int idRes;
    private String r1;
    private String r2;
    private String r3;
    private int idPreguntaF;
    private int idPersonaF;

    public ResCostoProy() {
    }

    public ResCostoProy(int idRes, String r1, String r2, String r3, int idPreguntaF, int idPersonaF) {
        this.setR1(r1);
        this.setR2(r2);
        this.setR3(r3);
        this.setIdRes(idRes);
        this.setIdPreguntaF(idPreguntaF);
        this.setIdPersonaF(idPersonaF);
    }

    public int getIdRes() {
        return idRes;
    }

    public void setIdRes(int idRes) {
        this.idRes = idRes;
    }

    public String getR1() {
        return r1;
    }

    public void setR1(String r1) {
        this.r1 = r1;
    }

    public String getR2() {
        return r2;
    }

    public void setR2(String r2) {
        this.r2 = r2;
    }

    public String getR3() {
        return r3;
    }

    public void setR3(String r3) {
        this.r3 = r3;
    }

    public int getIdPreguntaF() {
        return idPreguntaF;
    }

    public void setIdPreguntaF(int idPreguntaF) {
        this.idPreguntaF = idPreguntaF;
    }

    public int getIdPersonaF() {
        return idPersonaF;
    }

    public void setIdPersonaF(int idPersonaF) {
        this.idPersonaF = idPersonaF;
    }

    @Override
    public String toString() {
        return "ResCostoProy{" + "idRes=" + idRes + ", r1=" + r1 + ", r2=" + r2 + ", r3=" + r3 + ", idPreguntaF=" + idPreguntaF + ", idPersonaF=" + idPersonaF + '}';
    }

    

    

    
    
    
    
}
