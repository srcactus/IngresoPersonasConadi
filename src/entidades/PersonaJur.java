/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author Cactus
 */
public class PersonaJur {
    
    private int idJur;
    private String nombrePersJur;
    private String rut;
    private String razonSocial;
    private String fechaConstPj;
    private String numeroPj;

    public PersonaJur() {
    }

    public PersonaJur(int idJur, String nombrePersJur, String rut, String razonSocial, String fechaConstPj, String numeroPj) {
        this.setIdJur(idJur);
        this.setNombrePersJur(nombrePersJur);
        this.setRut(rut);
        this.setRazonSocial(razonSocial);
        this.setFechaConstPj(fechaConstPj);
        this.setNumeroPj(numeroPj);
    }

    public int getIdJur() {
        return idJur;
    }

    public void setIdJur(int idJur) {
        this.idJur = idJur;
    }

    public String getNombrePersJur() {
        return nombrePersJur;
    }

    public void setNombrePersJur(String nombrePersJur) {
        this.nombrePersJur = nombrePersJur;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public String getFechaConstPj() {
        return fechaConstPj;
    }

    public void setFechaConstPj(String fechaConstPj) {
        this.fechaConstPj = fechaConstPj;
    }

    public String getNumeroPj() {
        return numeroPj;
    }

    public void setNumeroPj(String numeroPj) {
        this.numeroPj = numeroPj;
    }

    @Override
    public String toString() {
        return "PersonaJur{" + "idJur=" + idJur + ", nombrePersJur=" + nombrePersJur + ", rut=" + rut + ", razonSocial=" + razonSocial + ", fechaConstPj=" + fechaConstPj + ", numeroPj=" + numeroPj + '}';
    }


    
}
