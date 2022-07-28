/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import bd.Conexion;
import entidades.BeneProy;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Cactus
 */
public class BeneProyDAO {
    
    private Conexion conexion = new Conexion();

    public boolean consultaDatos(BeneProy beneProy) throws SQLException {

        boolean consultaCorrecta = false;
        Connection conn = conexion.conectar();

        try {

            String sql = "insert into bene_proy(id_directos, id_indirectos, id_persona) values (?,?,?)";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, beneProy.getIdDirectosF());
            stmt.setInt(2, beneProy.getIdIndirectosF());
            stmt.setInt(3, beneProy.getIdPersona());

            int cantidad = stmt.executeUpdate();

            if (cantidad > 0) {
                
                consultaCorrecta = true;
                
            }

        } catch (Exception e) {
            
            System.out.println("ERROR: " + e.getMessage());
            
        }

        return consultaCorrecta;
    }
    
    
    
}
