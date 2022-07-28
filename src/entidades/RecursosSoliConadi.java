/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author Cactus
 */
public class RecursosSoliConadi {
    
    private int idRecursos;
    private String recursosSolicitadosConadi;
    private int cantidad;
    private int monto;
    private int idPersonaF;

    public RecursosSoliConadi() {
    }

    public RecursosSoliConadi(int idRecursos, String recursosSolicitadosConadi, int cantidad, int monto, int idPersonaF) {
        this.setIdRecursos(idRecursos);
        this.setRecursosSolicitadosConadi(recursosSolicitadosConadi);
        this.setCantidad(cantidad);
        this.setMonto(monto);
        this.setIdPersonaF(idPersonaF);
    }

    public int getIdRecursos() {
        return idRecursos;
    }

    public void setIdRecursos(int idRecursos) {
        this.idRecursos = idRecursos;
    }

    public String getRecursosSolicitadosConadi() {
        return recursosSolicitadosConadi;
    }

    public void setRecursosSolicitadosConadi(String recursosSolicitadosConadi) {
        this.recursosSolicitadosConadi = recursosSolicitadosConadi;
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
        return "RecursosSoliConadi{" + "idRecursos=" + idRecursos + ", recursosSolicitadosConadi=" + recursosSolicitadosConadi + ", cantidad=" + cantidad + ", monto=" + monto + ", idPersonaF=" + idPersonaF + '}';
    }
    
    
    
}
