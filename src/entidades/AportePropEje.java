/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author Cactus
 */
public class AportePropEje {
    
    private int idAporte;
    private String descripcionItem;
    private int cantidad;
    private int total;
    private int idPersonaF;

    public AportePropEje() {
    }

    public AportePropEje(int idAporte, String descripcionItem, int cantidad, int total, int idPersonaF) {
        this.setIdAporte(idAporte);
        this.setDescripcionItem(descripcionItem);
        this.setCantidad(cantidad);
        this.setTotal(total);
        this.setIdPersonaF(idPersonaF);
    }

    public int getIdAporte() {
        return idAporte;
    }

    public void setIdAporte(int idAporte) {
        this.idAporte = idAporte;
    }

    public String getDescripcionItem() {
        return descripcionItem;
    }

    public void setDescripcionItem(String descripcionItem) {
        this.descripcionItem = descripcionItem;
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
        return "AportePropEje{" + "idAporte=" + idAporte + ", descripcionItem=" + descripcionItem + ", cantidad=" + cantidad + ", total=" + total + ", idPersonaF=" + idPersonaF + '}';
    }
    
    
    
}
