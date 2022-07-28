/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import bd.Conexion;
import entidades.GastosHonorarios;
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
public class GastosOperacionDAO {
    
    private Conexion conexion = new Conexion();

    public boolean consultaDatos(GastosOperacion gastosOperacion) throws SQLException {

        boolean consultaCorrecta = false;
        Connection conn = conexion.conectar();

        try {

            String sql = "insert into gastos_operacion(gastos_operacion, monto_soli_conadi, id_persona) values (?,?,?)";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, gastosOperacion.getItem());
            stmt.setInt(2, gastosOperacion.getMontoSoliConadi());
            stmt.setInt(3, gastosOperacion.getIdPersonaF());

            int cantidad = stmt.executeUpdate();

            if (cantidad > 0) {
                
                consultaCorrecta = true;
                
            }

        } catch (Exception e) {
            
            System.out.println("ERROR: " + e.getMessage());
            
        }

        return consultaCorrecta;
    }
    
    
    public ArrayList<GastosOperacion> listarGastosOperacionPorId(int id) throws SQLException{
        
        ArrayList<GastosOperacion> gastosOperacion = new ArrayList<>();
        Connection cone = conexion.conectar();
        
        try {
            
            
            
            String sql = "select gastos_operacion, monto_soli_conadi from gastos_operacion "
                    + "where id_persona=(?)";
            PreparedStatement stmt = cone.prepareStatement(sql);
            stmt.setInt(1, id);
            
            ResultSet rs = stmt.executeQuery();
            
            while(rs.next()){
                
                GastosOperacion go = new GastosOperacion();
                go.setItem(rs.getString("gastos_operacion"));
                go.setMontoSoliConadi(Integer.parseInt(rs.getString("monto_soli_conadi")));
                

                gastosOperacion.add(go);
                
                
            }
            
            
            
        } catch (Exception e) {
            System.out.println("ERROR dao: "+e.getMessage());
        }finally{
            
            cone.close();
            
        }
        
        return gastosOperacion;
    }
    
}
