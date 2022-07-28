/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import bd.Conexion;
import entidades.AportePropEje;
import entidades.AporteTercero;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Cactus
 */
public class AporteTerceroDAO {
    
    private Conexion conexion = new Conexion();

    public boolean consultaDatos(AporteTercero aporteTercero) throws SQLException {

        boolean consultaCorrecta = false;
        Connection conn = conexion.conectar();

        try {

            String sql = "insert into aporte_terceros(desc_item, cantidad, total, id_persona) values (?,?,?,?)";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, aporteTercero.getDescItem());
            stmt.setInt(2, aporteTercero.getCantidad());
            stmt.setInt(3, aporteTercero.getTotal());
            stmt.setInt(4, aporteTercero.getIdPersonaF());

            int cantidad = stmt.executeUpdate();

            if (cantidad > 0) {
                
                consultaCorrecta = true;
                
            }

        } catch (Exception e) {
            
            System.out.println("ERROR: " + e.getMessage());
            
        }

        return consultaCorrecta;
    }
    
    
    public ArrayList<AporteTercero> listarAporteTerceroPorId(int id) throws SQLException{
        
        ArrayList<AporteTercero> aporteTercero = new ArrayList<>();
        Connection cone = conexion.conectar();
        
        try {
            
            
            
            String sql = "select desc_item, cantidad, total from aporte_terceros "
                    + "where id_persona=(?)";
            PreparedStatement stmt = cone.prepareStatement(sql);
            stmt.setInt(1, id);
            
            ResultSet rs = stmt.executeQuery();
            
            while(rs.next()){
                
                AporteTercero at = new AporteTercero();
                at.setDescItem(rs.getString("desc_item"));
                at.setCantidad(Integer.parseInt(rs.getString("cantidad")));
                at.setTotal(Integer.parseInt(rs.getString("total")));
                

                aporteTercero.add(at);
                
                
            }
            
            
            
        } catch (Exception e) {
            System.out.println("ERROR dao: "+e.getMessage());
        }finally{
            
            cone.close();
            
        }
        
        return aporteTercero;
    }
    
}
