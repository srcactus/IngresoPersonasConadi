/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author Cactus
 */
public class BeneProy {
    
    private int idBeneProy;
    private int idDirectosF;
    private int idIndirectosF;
    private int idPersona;

    public BeneProy() {
    }

    public BeneProy(int idBeneProy, int idDirectosF, int idIndirectosF, int idPersona) {
        this.setIdBeneProy(idBeneProy);
        this.setIdDirectosF(idDirectosF);
        this.setIdIndirectosF(idIndirectosF);
        this.setIdPersona(idPersona);
    }

    public int getIdBeneProy() {
        return idBeneProy;
    }

    public void setIdBeneProy(int idBeneProy) {
        this.idBeneProy = idBeneProy;
    }

    public int getIdDirectosF() {
        return idDirectosF;
    }

    public void setIdDirectosF(int idDirectosF) {
        this.idDirectosF = idDirectosF;
    }

    public int getIdIndirectosF() {
        return idIndirectosF;
    }

    public void setIdIndirectosF(int idIndirectosF) {
        this.idIndirectosF = idIndirectosF;
    }

    public int getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    @Override
    public String toString() {
        return "BeneProy{" + "idBeneProy=" + idBeneProy + ", idDirectosF=" + idDirectosF + ", idIndirectosF=" + idIndirectosF + ", idPersona=" + idPersona + '}';
    }
    
    
    
}
