/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author Cactus
 */
public class FichaDesaProy {
    
    private int idFichaDesaProy;
    private String respuesta;
    private int idPreguntaF;
    private int idPersonaF;

    public FichaDesaProy() {
    }

    public FichaDesaProy(int idFichaDesaProy, String respuesta, int idPreguntaF, int idPersonaF) {
        this.setIdFichaDesaProy(idFichaDesaProy);
        this.setRespuesta(respuesta);
        this.setIdPreguntaF(idPreguntaF);
        this.setIdPersonaF(idPersonaF);
    }

    public int getIdFichaDesaProy() {
        return idFichaDesaProy;
    }

    public void setIdFichaDesaProy(int idFichaDesaProy) {
        this.idFichaDesaProy = idFichaDesaProy;
    }

    public String getRespuesta() {
        return respuesta;
    }

    public void setRespuesta(String respuesta) {
        this.respuesta = respuesta;
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
        return "FichaDesaProy{" + "idFichaDesaProy=" + idFichaDesaProy + ", respuesta=" + respuesta + ", idPreguntaF=" + idPreguntaF + ", idPersonaF=" + idPersonaF + '}';
    }
    
    
    
}
