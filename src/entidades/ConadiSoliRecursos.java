/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author Cactus
 */
public class ConadiSoliRecursos {
    
    private int idConadiSoliRecursos;
    private String detalle;
    private int cantidad;
    private int monto;
    private int idPersonaF;

    public ConadiSoliRecursos() {
    }

    public ConadiSoliRecursos(int idConadiSoliRecursos, String detalle, int cantidad, int monto, int idPersonaF) {
        this.setIdConadiSoliRecursos(idConadiSoliRecursos);
        this.setDetalle(detalle);
        this.setCantidad(cantidad);
        this.setMonto(monto);
        this.setIdPersonaF(idPersonaF);
    }

    public int getIdConadiSoliRecursos() {
        return idConadiSoliRecursos;
    }

    public void setIdConadiSoliRecursos(int idConadiSoliRecursos) {
        this.idConadiSoliRecursos = idConadiSoliRecursos;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
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
        return "ConadiSoliRecursos{" + "idConadiSoliRecursos=" + idConadiSoliRecursos + ", detalle=" + detalle + ", cantidad=" + cantidad + ", monto=" + monto + ", idPersonaF=" + idPersonaF + '}';
    }
    
    
    
}
