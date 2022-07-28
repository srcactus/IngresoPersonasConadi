/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import bd.Conexion;
import entidades.AportePropEje;
import entidades.GastosHonorarios;
import entidades.GastosInversion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Cactus
 */
public class AportePropEjeDAO {
    
    private Conexion conexion = new Conexion();

    public boolean consultaDatos(AportePropEje aportePropEje) throws SQLException {

        boolean consultaCorrecta = false;
        Connection conn = conexion.conectar();

        try {

            String sql = "insert into aporte_prop_eje(desc_item, cantidad, total, id_persona) values (?,?,?,?)";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, aportePropEje.getDescripcionItem());
            stmt.setInt(2, aportePropEje.getCantidad());
            stmt.setInt(3, aportePropEje.getTotal());
            stmt.setInt(4, aportePropEje.getIdPersonaF());

            int cantidad = stmt.executeUpdate();

            if (cantidad > 0) {
                
                consultaCorrecta = true;
                
            }

        } catch (Exception e) {
            
            System.out.println("ERROR: " + e.getMessage());
            
        }

        return consultaCorrecta;
    }
    
    
    public ArrayList<AportePropEje> listarAportePropEjePorId(int id) throws SQLException{
        
        ArrayList<AportePropEje> aportePropEje = new ArrayList<>();
        Connection cone = conexion.conectar();
        
        try {
            
            
            
            String sql = "select desc_item, cantidad, total from aporte_prop_eje "
                    + "where id_persona=(?)";
            PreparedStatement stmt = cone.prepareStatement(sql);
            stmt.setInt(1, id);
            
            ResultSet rs = stmt.executeQuery();
            
            while(rs.next()){
                
                AportePropEje ape = new AportePropEje();
                ape.setDescripcionItem(rs.getString("desc_item"));
                ape.setCantidad(Integer.parseInt(rs.getString("cantidad")));
                ape.setTotal(Integer.parseInt(rs.getString("total")));
                

                aportePropEje.add(ape);
                
                
            }
            
            
            
        } catch (Exception e) {
            System.out.println("ERROR dao: "+e.getMessage());
        }finally{
            
            cone.close();
            
        }
        
        return aportePropEje;
    }
    
}
