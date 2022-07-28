/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import bd.Conexion;
import entidades.FinanCostoProy;
import entidades.ProyCostoFinan;
import entidades.ResCostoProy;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Cactus
 */
public class ResCostoProyDAO {

    private Conexion conexion = new Conexion();

    public boolean insertarRespuesta(ResCostoProy resCostoProy) throws SQLException {

        boolean consultaCorrecta = false;
        Connection conn = conexion.conectar();

        try {

            String sql = "insert into res_costo_proy (respuesta"
                    + ", id_pregunta, id_persona) values(?,?,?)";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, resCostoProy.getR1());
            stmt.setInt(2, 50);
            stmt.setInt(3, resCostoProy.getIdPersonaF());
            

            int cantidad = stmt.executeUpdate();

            if (cantidad > 0) {

                String sql2 = "insert into res_costo_proy (respuesta"
                        + ", id_pregunta, id_persona) values(?,?,?)";
                PreparedStatement stmt2 = conn.prepareStatement(sql2);
                stmt2.setString(1, resCostoProy.getR2());
                stmt2.setInt(2, 51);
                stmt2.setInt(3, resCostoProy.getIdPersonaF());
                

                int cantidad2 = stmt2.executeUpdate();

                if (cantidad2 > 0) {

                    String sql3 = "insert into res_costo_proy (respuesta"
                            + ", id_pregunta, id_persona) values(?,?,?)";
                    PreparedStatement stmt3 = conn.prepareStatement(sql3);
                    stmt3.setString(1, resCostoProy.getR3());
                    stmt3.setInt(2, 52);
                    stmt3.setInt(3, resCostoProy.getIdPersonaF());
                    

                    int cantidad3 = stmt2.executeUpdate();
                    
                    if(cantidad3>0){
                        consultaCorrecta = true;
                    }

                }

            }

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        return consultaCorrecta;
    }
    
    
    public ArrayList<ResCostoProy> listarResCostoProyPorId(int id) throws SQLException{
        
        ArrayList<ResCostoProy> resCostoProy = new ArrayList<>();
        Connection cone = conexion.conectar();
        
        try {
            
            
            
            String sql = "select respuesta from res_costo_proy where "
                    + "id_persona=(?)";
            PreparedStatement stmt = cone.prepareStatement(sql);
            stmt.setInt(1, id);
            
            ResultSet rs = stmt.executeQuery();
            
            while(rs.next()){
                
                ResCostoProy rcp = new ResCostoProy();
                rcp.setR1(rs.getString("respuesta"));
                
                
                resCostoProy.add(rcp);
                
                
            }
            
            
            
        } catch (Exception e) {
            System.out.println("ERROR dao: "+e.getMessage());
        }finally{
            
            cone.close();
            
        }
        
        return resCostoProy;
    }

}
