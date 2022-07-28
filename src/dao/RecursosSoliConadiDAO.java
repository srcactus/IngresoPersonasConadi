/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import bd.Conexion;
import entidades.CartaGant;
import entidades.RecursosSoliConadi;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Cactus
 */
public class RecursosSoliConadiDAO {
    
    private Conexion conexion = new Conexion();
    

    public boolean insertarRespuesta(RecursosSoliConadi recursosSoliConadi) throws SQLException {

        boolean consultaCorrecta = false;
        Connection conn = conexion.conectar();
        
        try {
            
            String sql = "insert into recursos_soli_conadi (recursos_solicitados_conadi, cantidad, monto, id_persona) "
                    + "values(?,?,?,?)";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, recursosSoliConadi.getRecursosSolicitadosConadi());
            stmt.setInt(2, recursosSoliConadi.getCantidad());
            stmt.setInt(3, recursosSoliConadi.getMonto());
            stmt.setInt(4, recursosSoliConadi.getIdPersonaF());
            
            int cantidad = stmt.executeUpdate();
            
            if(cantidad > 0){
                
                consultaCorrecta = true;
                
            }
            
            
        } catch (Exception e) {
            
            System.out.println("Error: " + e.getMessage());
            
        }
        
        return consultaCorrecta;
    }
    
    
    public ArrayList<RecursosSoliConadi> listarRecursosSoliConadiPorId(int id) throws SQLException{
        
        ArrayList<RecursosSoliConadi> recursosSoliConadi = new ArrayList<>();
        Connection cone = conexion.conectar();
        
        try {
            
            
            
            String sql = "select recursos_solicitados_conadi, cantidad, monto from recursos_soli_conadi "
                    + "where id_persona=(?)";
            PreparedStatement stmt = cone.prepareStatement(sql);
            stmt.setInt(1, id);
            
            ResultSet rs = stmt.executeQuery();
            
            while(rs.next()){
                
                RecursosSoliConadi rsc = new RecursosSoliConadi();
                rsc.setRecursosSolicitadosConadi(rs.getString("recursos_solicitados_conadi"));
                rsc.setCantidad(Integer.parseInt(rs.getString("cantidad")));
                rsc.setMonto(Integer.parseInt(rs.getString("monto")));

                recursosSoliConadi.add(rsc);
                
                
            }
            
            
            
        } catch (Exception e) {
            System.out.println("ERROR dao: "+e.getMessage());
        }finally{
            
            cone.close();
            
        }
        
        return recursosSoliConadi;
    }
    
}
