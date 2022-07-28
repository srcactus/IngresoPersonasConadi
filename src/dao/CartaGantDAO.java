/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import bd.Conexion;
import entidades.CartaGant;
import entidades.FinanInstPublPriv;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Cactus
 */
public class CartaGantDAO {
    
    private Conexion conexion = new Conexion();
    

    public boolean insertarRespuesta(CartaGant cartaGant) throws SQLException {

        boolean consultaCorrecta = false;
        Connection conn = conexion.conectar();
        
        try {
            
            String sql = "insert into carta_gant (actividad, responsable, mes, id_persona) "
                    + "values(?,?,?,?)";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, cartaGant.getActividad());
            stmt.setString(2, cartaGant.getResponsable());
            stmt.setString(3, cartaGant.getMes());
            stmt.setInt(4, cartaGant.getIdPersonaF());
            
            int cantidad = stmt.executeUpdate();
            
            if(cantidad > 0){
                
                consultaCorrecta = true;
                
            }
            
            
        } catch (Exception e) {
            
            System.out.println("Error: " + e.getMessage());
            
        }
        
        return consultaCorrecta;
    }
    
    
    public ArrayList<CartaGant> listarCartaGantPorId(int id) throws SQLException{
        
        ArrayList<CartaGant> cartaGant = new ArrayList<>();
        Connection cone = conexion.conectar();
        
        try {
            
            
            
            String sql = "select actividad, responsable, mes from carta_gant "
                    + "where id_persona=(?)";
            PreparedStatement stmt = cone.prepareStatement(sql);
            stmt.setInt(1, id);
            
            ResultSet rs = stmt.executeQuery();
            
            while(rs.next()){
                
                CartaGant cg = new CartaGant();
                cg.setActividad(rs.getString("actividad"));
                cg.setResponsable(rs.getString("responsable"));
                cg.setMes(rs.getString("mes"));

                cartaGant.add(cg);
                
                
            }
            
            
            
        } catch (Exception e) {
            System.out.println("ERROR dao: "+e.getMessage());
        }finally{
            
            cone.close();
            
        }
        
        return cartaGant;
    }
    
}
