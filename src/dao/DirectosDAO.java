/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import bd.Conexion;
import entidades.BeneProy;
import entidades.CronoActivi;
import entidades.DatosPersonaPostulante;
import entidades.DesarrolloProy;
import entidades.Directos;
import entidades.Persona;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Cactus
 */
public class DirectosDAO {

    private Conexion conexion = new Conexion();

    public boolean consultaDatos(Directos directos, BeneProy beneProy) throws SQLException {

        boolean consultaCorrecta = false;
        Connection conn = conexion.conectar();

        try {

            String sql = "insert into directos(hombres, mujeres, total) values (?,?,?)";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, directos.getHombres());
            stmt.setInt(2, directos.getMujeres());
            stmt.setInt(3, directos.getTotal());

            int cantidad = stmt.executeUpdate();

            if (cantidad > 0) {
                
                String sql2 = "select last_insert_id()";
                
                PreparedStatement stmt2 = conn.prepareStatement(sql2);

                ResultSet rs = stmt2.executeQuery();

                int valor = 0;

                while (rs.next()) {
                    valor = rs.getInt("last_insert_id()");
                }
                
                beneProy.setIdDirectosF(valor);
                System.out.println("valor de getIdDirectosF");
                
                consultaCorrecta = true;
                
            }

        } catch (Exception e) {
            
            System.out.println("ERROR: " + e.getMessage());
            
        }

        return consultaCorrecta;
    }
    
    
    public ArrayList<Directos> listarDirectosPorId(int id) throws SQLException{
        
        ArrayList<Directos> directos = new ArrayList<>();
        Connection cone = conexion.conectar();
        
        try {
            
            String sqlA = "select id_directos from bene_proy where id_persona=(?)";
            PreparedStatement stmtA = cone.prepareStatement(sqlA);
            stmtA.setInt(1, id);
            
            ResultSet rsA = stmtA.executeQuery();
            
            int valorIdDirectos = 0;
            
            while(rsA.next()){
                
                valorIdDirectos = rsA.getInt("id_directos");
                
            }
            
            String sql = "select hombres, mujeres, total from directos "
                    + "where id_directos=(?)";
            PreparedStatement stmt = cone.prepareStatement(sql);
            stmt.setInt(1, valorIdDirectos);
            
            ResultSet rs = stmt.executeQuery();
            
            while(rs.next()){
                
                Directos di = new Directos();
                di.setHombres(Integer.parseInt(rs.getString("hombres")));
                di.setMujeres(Integer.parseInt(rs.getString("mujeres")));
                di.setTotal(Integer.parseInt(rs.getString("total")));

                directos.add(di);
                
                
            }
            
            
            
        } catch (Exception e) {
            System.out.println("ERROR dao: "+e.getMessage());
        }finally{
            
            cone.close();
            
        }
        
        return directos;
    }

}
