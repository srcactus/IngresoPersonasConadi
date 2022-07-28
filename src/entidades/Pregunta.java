/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author Cactus
 */
public class Pregunta {
    
    private int idPregunta;
    private String Pregunta;

    public Pregunta() {
    }

    public Pregunta(int idPregunta, String Pregunta) {
        this.setIdPregunta(idPregunta);
        this.setPregunta(Pregunta);
    }

    public int getIdPregunta() {
        return idPregunta;
    }

    public void setIdPregunta(int idPregunta) {
        this.idPregunta = idPregunta;
    }

    public String getPregunta() {
        return Pregunta;
    }

    public void setPregunta(String Pregunta) {
        this.Pregunta = Pregunta;
    }

    @Override
    public String toString() {
        return "Pregunta{" + "idPregunta=" + idPregunta + ", Pregunta=" + Pregunta + '}';
    }
    
    
    
}
