/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author Cactus
 */
public class RecursosAportPostulante {
    
    private int idRecuAportPost;
    private String descripcion;
    private int cantidad;
    private int monto;
    private int idPersonaF;

    public RecursosAportPostulante() {
    }

    public RecursosAportPostulante(int idRecuAportPost, String descripcion, int cantidad, int monto, int idPersonaF) {
        this.setIdRecuAportPost(idRecuAportPost);
        this.setDescripcion(descripcion);
        this.setCantidad(cantidad);
        this.setMonto(monto);
        this.setIdPersonaF(idPersonaF);
    }

    public int getIdRecuAportPost() {
        return idRecuAportPost;
    }

    public void setIdRecuAportPost(int idRecuAportPost) {
        this.idRecuAportPost = idRecuAportPost;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
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
        return "RecursosAportPostulante{" + "idRecuAportPost=" + idRecuAportPost + ", descripcion=" + descripcion + ", cantidad=" + cantidad + ", monto=" + monto + ", idPersonaF=" + idPersonaF + '}';
    }
    
    
    
}
