/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author Cactus
 */
public class Indirectos {
    
    private int idIndirectos;
    private int hombres;
    private int mujeres;
    private int total;

    public Indirectos() {
    }

    public Indirectos(int idIndirectos, int hombres, int mujeres, int total) {
        this.setIdIndirectos(idIndirectos);
        this.setHombres(hombres);
        this.setMujeres(mujeres);
        this.setTotal(total);
    }

    public int getIdIndirectos() {
        return idIndirectos;
    }

    public void setIdIndirectos(int idIndirectos) {
        this.idIndirectos = idIndirectos;
    }

    public int getHombres() {
        return hombres;
    }

    public void setHombres(int hombres) {
        this.hombres = hombres;
    }

    public int getMujeres() {
        return mujeres;
    }

    public void setMujeres(int mujeres) {
        this.mujeres = mujeres;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "Indirectos{" + "idIndirectos=" + idIndirectos + ", hombres=" + hombres + ", mujeres=" + mujeres + ", total=" + total + '}';
    }
    
    
    
}
