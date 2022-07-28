/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import bd.Conexion;
import entidades.BeneProy;
import entidades.Directos;
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
public class IndirectosDAO {
    
    private Conexion conexion = new Conexion();

    public boolean consultaDatos(Indirectos indirectos, BeneProy beneProy) throws SQLException {

        boolean consultaCorrecta = false;
        Connection conn = conexion.conectar();

        try {

            String sql = "insert into indirectos(hombres, mujeres, total) values (?,?,?)";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, indirectos.getHombres());
            stmt.setInt(2, indirectos.getMujeres());
            stmt.setInt(3, indirectos.getTotal());

            int cantidad = stmt.executeUpdate();

            if (cantidad > 0) {
                
                String sql2 = "select last_insert_id()";
                
                PreparedStatement stmt2 = conn.prepareStatement(sql2);

                ResultSet rs = stmt2.executeQuery();

                int valor = 0;

                while (rs.next()) {
                    valor = rs.getInt("last_insert_id()");
                }
                
                beneProy.setIdIndirectosF(valor);
                System.out.println("valor de getIdDirectosF");
                
                consultaCorrecta = true;
                
            }

        } catch (Exception e) {
            
            System.out.println("ERROR: " + e.getMessage());
            
        }

        return consultaCorrecta;
    }
    
    
    public ArrayList<Indirectos> listarIndirectoPorId(int id) throws SQLException{
        
        ArrayList<Indirectos> indirectos = new ArrayList<>();
        Connection cone = conexion.conectar();
        
        try {
            
            String sqlA = "select id_indirectos from bene_proy where id_persona=(?)";
            PreparedStatement stmtA = cone.prepareStatement(sqlA);
            stmtA.setInt(1, id);
            
            ResultSet rsA = stmtA.executeQuery();
            
            int valorIdIndirectos = 0;
            
            while(rsA.next()){
                
                valorIdIndirectos = rsA.getInt("id_indirectos");
                
            }
            
            String sql = "select hombres, mujeres, total from indirectos "
                    + "where id_indirectos=(?)";
            PreparedStatement stmt = cone.prepareStatement(sql);
            stmt.setInt(1, valorIdIndirectos);
            
            ResultSet rs = stmt.executeQuery();
            
            while(rs.next()){
                
                Indirectos in = new Indirectos();
                in.setHombres(Integer.parseInt(rs.getString("hombres")));
                in.setMujeres(Integer.parseInt(rs.getString("mujeres")));
                in.setTotal(Integer.parseInt(rs.getString("total")));

                indirectos.add(in);
                
                
            }
            
            
            
        } catch (Exception e) {
            System.out.println("ERROR dao: "+e.getMessage());
        }finally{
            
            cone.close();
            
        }
        
        return indirectos;
    }
    
}
