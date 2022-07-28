/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import bd.Conexion;
import entidades.FinanCostoProy;
import entidades.FinanInstPublPriv;
import entidades.GastosHonorarios;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Cactus
 */
public class FinanInstPublPrivDAO {
    
    private Conexion conexion = new Conexion();
    

    public boolean insertarRespuesta(FinanInstPublPriv finanInstPublPriv) throws SQLException {

        boolean consultaCorrecta = false;
        Connection conn = conexion.conectar();
        
        try {
            
            String sql = "insert into finan_inst_publ_priv (institucion, tipo_inversion, anio, monto, id_persona) "
                    + "values(?,?,?,?,?)";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, finanInstPublPriv.getInstitucion());
            stmt.setString(2, finanInstPublPriv.getTipoInversion());
            stmt.setInt(3, finanInstPublPriv.getAnio());
            stmt.setInt(4, finanInstPublPriv.getMonto());
            stmt.setInt(5, finanInstPublPriv.getIdPersonaF());
            
            int cantidad = stmt.executeUpdate();
            
            if(cantidad > 0){
                
                consultaCorrecta = true;
                
            }
            
            
        } catch (Exception e) {
            
            System.out.println("Error: " + e.getMessage());
            
        }
        
        return consultaCorrecta;
    }
    
    
    public ArrayList<FinanInstPublPriv> listarFinanInstPublPrivPorId(int id) throws SQLException{
        
        ArrayList<FinanInstPublPriv> finanInstPublPriv = new ArrayList<>();
        Connection cone = conexion.conectar();
        
        try {
            
            
            
            String sql = "select institucion, tipo_inversion, anio, monto from finan_inst_publ_priv "
                    + "where id_persona=(?)";
            PreparedStatement stmt = cone.prepareStatement(sql);
            stmt.setInt(1, id);
            
            ResultSet rs = stmt.executeQuery();
            
            while(rs.next()){
                
                FinanInstPublPriv fipp = new FinanInstPublPriv();
                fipp.setInstitucion(rs.getString("institucion"));
                fipp.setTipoInversion(rs.getString("tipo_inversion"));
                fipp.setAnio(Integer.parseInt(rs.getString("anio")));
                fipp.setMonto(Integer.parseInt(rs.getString("monto")));
                

                finanInstPublPriv.add(fipp);
                
                
            }
            
            
            
        } catch (Exception e) {
            System.out.println("ERROR dao: "+e.getMessage());
        }finally{
            
            cone.close();
            
        }
        
        return finanInstPublPriv;
    }
    
}
