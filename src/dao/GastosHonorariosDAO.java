/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import bd.Conexion;
import entidades.BeneProy;
import entidades.GastosHonorarios;
import entidades.Indirectos;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Cactus
 */
public class GastosHonorariosDAO {
    
    private Conexion conexion = new Conexion();

    public boolean consultaDatos(GastosHonorarios gastosHonorarios) throws SQLException {

        boolean consultaCorrecta = false;
        Connection conn = conexion.conectar();

        try {

            String sql = "insert into gastos_honorarios(gastos_honorarios, monto_soli_conadi, id_persona) values (?,?,?)";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, gastosHonorarios.getItem());
            stmt.setInt(2, gastosHonorarios.getMontoSoliConadi());
            stmt.setInt(3, gastosHonorarios.getIdPersonaF());

            int cantidad = stmt.executeUpdate();

            if (cantidad > 0) {
                
                consultaCorrecta = true;
                
            }

        } catch (Exception e) {
            
            System.out.println("ERROR: " + e.getMessage());
            
        }

        return consultaCorrecta;
    }
    
    
    public ArrayList<GastosHonorarios> listarGastosHonorariosPorId(int id) throws SQLException{
        
        ArrayList<GastosHonorarios> gastosHonorarios = new ArrayList<>();
        Connection cone = conexion.conectar();
        
        try {
            
            
            
            String sql = "select gastos_honorarios, monto_soli_conadi from gastos_honorarios "
                    + "where id_persona=(?)";
            PreparedStatement stmt = cone.prepareStatement(sql);
            stmt.setInt(1, id);
            
            ResultSet rs = stmt.executeQuery();
            
            while(rs.next()){
                
                GastosHonorarios gh = new GastosHonorarios();
                gh.setItem(rs.getString("gastos_honorarios"));
                gh.setMontoSoliConadi(Integer.parseInt(rs.getString("monto_soli_conadi")));
                

                gastosHonorarios.add(gh);
                
                
            }
            
            
            
        } catch (Exception e) {
            System.out.println("ERROR dao: "+e.getMessage());
        }finally{
            
            cone.close();
            
        }
        
        return gastosHonorarios;
    }
    
}
