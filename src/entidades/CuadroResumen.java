/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author Cactus
 */
public class CuadroResumen {
    
    private int idCuadroResumen;
    private int gastosHonorarios;
    private int gastosOperacion;
    private int gastosInversion;
    private int imprevistos;
    private int montoSoliConadi;
    private int aporteConadi;
    private int aportePropio;
    private int aporteTerceros;
    private int costoTotalProy;
    private int idPersonaF;

    public CuadroResumen() {
    }

    public CuadroResumen(int idCuadroResumen, int gastosHonorarios, int gastosOperacion, int gastosInversion, int imprevistos, int montoSoliConadi, int aporteConadi, int aportePropio, int aporteTerceros, int costoTotalProy, int idPersonaF) {
        this.setIdCuadroResumen(idCuadroResumen);
        this.setGastosHonorarios(gastosHonorarios);
        this.setGastosOperacion(gastosOperacion);
        this.setGastosInversion(gastosInversion);
        this.setImprevistos(imprevistos);
        this.setMontoSoliConadi(montoSoliConadi);
        this.setAporteConadi(aporteConadi);
        this.setAportePropio(aportePropio);
        this.setAporteTerceros(aporteTerceros);
        this.setCostoTotalProy(costoTotalProy);
        this.setIdPersonaF(idPersonaF);
    }

    public int getIdCuadroResumen() {
        return idCuadroResumen;
    }

    public void setIdCuadroResumen(int idCuadroResumen) {
        this.idCuadroResumen = idCuadroResumen;
    }

    public int getGastosHonorarios() {
        return gastosHonorarios;
    }

    public void setGastosHonorarios(int gastosHonorarios) {
        this.gastosHonorarios = gastosHonorarios;
    }

    public int getGastosOperacion() {
        return gastosOperacion;
    }

    public void setGastosOperacion(int gastosOperacion) {
        this.gastosOperacion = gastosOperacion;
    }

    public int getGastosInversion() {
        return gastosInversion;
    }

    public void setGastosInversion(int gastosInversion) {
        this.gastosInversion = gastosInversion;
    }

    public int getImprevistos() {
        return imprevistos;
    }

    public void setImprevistos(int imprevistos) {
        this.imprevistos = imprevistos;
    }

    public int getMontoSoliConadi() {
        return montoSoliConadi;
    }

    public void setMontoSoliConadi(int montoSoliConadi) {
        this.montoSoliConadi = montoSoliConadi;
    }

    public int getAporteConadi() {
        return aporteConadi;
    }

    public void setAporteConadi(int aporteConadi) {
        this.aporteConadi = aporteConadi;
    }

    public int getAportePropio() {
        return aportePropio;
    }

    public void setAportePropio(int aportePropio) {
        this.aportePropio = aportePropio;
    }

    public int getAporteTerceros() {
        return aporteTerceros;
    }

    public void setAporteTerceros(int aporteTerceros) {
        this.aporteTerceros = aporteTerceros;
    }

    public int getCostoTotalProy() {
        return costoTotalProy;
    }

    public void setCostoTotalProy(int costoTotalProy) {
        this.costoTotalProy = costoTotalProy;
    }

    public int getIdPersonaF() {
        return idPersonaF;
    }

    public void setIdPersonaF(int idPersonaF) {
        this.idPersonaF = idPersonaF;
    }

    @Override
    public String toString() {
        return "CuadroResumen{" + "idCuadroResumen=" + idCuadroResumen + ", gastosHonorarios=" + gastosHonorarios + ", gastosOperacion=" + gastosOperacion + ", gastosInversion=" + gastosInversion + ", imprevistos=" + imprevistos + ", montoSoliConadi=" + montoSoliConadi + ", aporteConadi=" + aporteConadi + ", aportePropio=" + aportePropio + ", aporteTerceros=" + aporteTerceros + ", costoTotalProy=" + costoTotalProy + ", idPersonaF=" + idPersonaF + '}';
    }
    
    
    
                    
    
}
