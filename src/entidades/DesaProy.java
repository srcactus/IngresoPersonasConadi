/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author Cactus
 */
public class DesaProy {
    
    private int idDesaProy;
    private int idPersonaF;
    private int idPreguntaF;
    private String r1;
    private String r2;
    private String r3;
    private String r4;
    private String r5;
    private String r6;
    private String r7;
    private String r8;
    private String respuestas;

    public DesaProy() {
    }

    public DesaProy(int idDesaProy, int idPersonaF, int idPreguntaF, String r1, String r2, String r3, String r4, String r5, String r6, String r7, String r8, String respuestas) {
        this.setIdDesaProy(idDesaProy);
        this.setIdPersonaF(idPersonaF);
        this.setIdPreguntaF(idPreguntaF);
        this.setR1(r1);
        this.setR2(r2);
        this.setR3(r3);
        this.setR4(r4);
        this.setR5(r5);
        this.setR6(r6);
        this.setR7(r7);
        this.setR8(r8);
        this.setRespuestas(respuestas);
    }

    public int getIdDesaProy() {
        return idDesaProy;
    }

    public void setIdDesaProy(int idDesaProy) {
        this.idDesaProy = idDesaProy;
    }

    public int getIdPersonaF() {
        return idPersonaF;
    }

    public void setIdPersonaF(int idPersonaF) {
        this.idPersonaF = idPersonaF;
    }

    public int getIdPreguntaF() {
        return idPreguntaF;
    }

    public void setIdPreguntaF(int idPreguntaF) {
        this.idPreguntaF = idPreguntaF;
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

    public String getR4() {
        return r4;
    }

    public void setR4(String r4) {
        this.r4 = r4;
    }

    public String getR5() {
        return r5;
    }

    public void setR5(String r5) {
        this.r5 = r5;
    }

    public String getR6() {
        return r6;
    }

    public void setR6(String r6) {
        this.r6 = r6;
    }

    public String getR7() {
        return r7;
    }

    public void setR7(String r7) {
        this.r7 = r7;
    }

    public String getR8() {
        return r8;
    }

    public void setR8(String r8) {
        this.r8 = r8;
    }

    public String getRespuestas() {
        return respuestas;
    }

    public void setRespuestas(String respuestas) {
        this.respuestas = respuestas;
    }

    @Override
    public String toString() {
        return respuestas;
    }

    
    
}
