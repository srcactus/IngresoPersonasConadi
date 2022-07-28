/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import bd.Conexion;
import entidades.GastosInversion;
import entidades.GastosOperacion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Cactus
 */
public class GastosInversionDAO {
    
    private Conexion conexion = new Conexion();

    public boolean consultaDatos(GastosInversion gastosInversion) throws SQLException {

        boolean consultaCorrecta = false;
        Connection conn = conexion.conectar();

        try {

            String sql = "insert into gastos_inversion(gastos_inversion, monto_soli_conadi, id_persona) values (?,?,?)";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, gastosInversion.getItem());
            stmt.setInt(2, gastosInversion.getMontoSoliConadi());
            stmt.setInt(3, gastosInversion.getIdPersonaF());

            int cantidad = stmt.executeUpdate();

            if (cantidad > 0) {
                
                consultaCorrecta = true;
                
            }

        } catch (Exception e) {
            
            System.out.println("ERROR: " + e.getMessage());
            
        }

        return consultaCorrecta;
    }
    
    
    public ArrayList<GastosInversion> listarGastosInversionPorId(int id) throws SQLException{
        
        ArrayList<GastosInversion> gastosInversion = new ArrayList<>();
        Connection cone = conexion.conectar();
        
        try {
            
            
            
            String sql = "select gastos_inversion, monto_soli_conadi from gastos_inversion "
                    + "where id_persona=(?)";
            PreparedStatement stmt = cone.prepareStatement(sql);
            stmt.setInt(1, id);
            
            ResultSet rs = stmt.executeQuery();
            
            while(rs.next()){
                
                GastosInversion go = new GastosInversion();
                go.setItem(rs.getString("gastos_inversion"));
                go.setMontoSoliConadi(Integer.parseInt(rs.getString("monto_soli_conadi")));
                

                gastosInversion.add(go);
                
                
            }
            
            
            
        } catch (Exception e) {
            System.out.println("ERROR dao: "+e.getMessage());
        }finally{
            
            cone.close();
            
        }
        
        return gastosInversion;
    }
    
}
