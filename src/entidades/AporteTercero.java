/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author Cactus
 */
public class AporteTercero {
    
    private int idAporteTercero;
    private String descItem;
    private int cantidad;
    private int total;
    private int idPersonaF;

    public AporteTercero() {
    }

    public AporteTercero(int idAporteTercero, String descItem, int cantidad, int total, int idPersonaF) {
        this.setIdAporteTercero(idAporteTercero);
        this.setDescItem(descItem);
        this.setCantidad(cantidad);
        this.setTotal(total);
        this.setIdPersonaF(idPersonaF);
    }

    public int getIdAporteTercero() {
        return idAporteTercero;
    }

    public void setIdAporteTercero(int idAporteTercero) {
        this.idAporteTercero = idAporteTercero;
    }

    public String getDescItem() {
        return descItem;
    }

    public void setDescItem(String descItem) {
        this.descItem = descItem;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getIdPersonaF() {
        return idPersonaF;
    }

    public void setIdPersonaF(int idPersonaF) {
        this.idPersonaF = idPersonaF;
    }

    @Override
    public String toString() {
        return "AporteTercero{" + "idAporteTercero=" + idAporteTercero + ", descItem=" + descItem + ", cantidad=" + cantidad + ", total=" + total + ", idPersonaF=" + idPersonaF + '}';
    }
    
    
    
    
}
