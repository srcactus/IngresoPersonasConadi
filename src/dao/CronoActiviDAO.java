/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import bd.Conexion;
import entidades.BeneProy;
import entidades.CronoActivi;
import entidades.DatosProyecto;
import entidades.Direccion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Cactus
 */
public class CronoActiviDAO {
    
    private Conexion conexion = new Conexion();

    public boolean consultaDatos(CronoActivi cronoActivi) throws SQLException {

        boolean consultaCorrecta = false;
        Connection conn = conexion.conectar();

        try {

            String sql = "insert into crono_actvi(actividad, responsable, mes, id_persona) values (?,?,?,?)";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, cronoActivi.getActividad());
            stmt.setString(2, cronoActivi.getResponsable());
            stmt.setString(3, cronoActivi.getMes());
            stmt.setInt(4, cronoActivi.getIdPersonaF());

            int cantidad = stmt.executeUpdate();

            if (cantidad > 0) {
                
                consultaCorrecta = true;
                
            }

        } catch (Exception e) {
            
            System.out.println("ERROR: " + e.getMessage());
            
        }

        return consultaCorrecta;
    }
    
    
    public ArrayList<CronoActivi> listarCronoActividadesPorId(int id) throws SQLException{
        
        ArrayList<CronoActivi> cronoActivi = new ArrayList<>();
        Connection cone = conexion.conectar();
        
        try {
            
            String sql = "select actividad, responsable, mes from crono_actvi "
                    + "where id_persona=(?)";
            PreparedStatement stmt = cone.prepareStatement(sql);
            stmt.setInt(1, id);
            
            ResultSet rs = stmt.executeQuery();
            
            while(rs.next()){
                
                CronoActivi ca = new CronoActivi();
                ca.setActividad(rs.getString("actividad"));
                ca.setResponsable(rs.getString("responsable"));
                ca.setMes(rs.getString("mes"));

                cronoActivi.add(ca);
                
                
            }
            
            
            
        } catch (Exception e) {
            System.out.println("ERROR dao: "+e.getMessage());
        }finally{
            
            cone.close();
            
        }
        
        return cronoActivi;
    }
    
}
