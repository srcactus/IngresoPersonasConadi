/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author Cactus
 */
public class Directos {
    
    private int idDirectos;
    private int hombres;
    private int mujeres;
    private int total;

    public Directos() {
    }

    public Directos(int idDirectos, int hombres, int mujeres, int total) {
        this.setIdDirectos(idDirectos);
        this.setHombres(hombres);
        this.setMujeres(mujeres);
        this.setTotal(total);
    }

    public int getIdDirectos() {
        return idDirectos;
    }

    public void setIdDirectos(int idDirectos) {
        this.idDirectos = idDirectos;
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
        return "Directos{" + "idDirectos=" + idDirectos + ", hombres=" + hombres + ", mujeres=" + mujeres + ", total=" + total + '}';
    }
    
    
    
}
