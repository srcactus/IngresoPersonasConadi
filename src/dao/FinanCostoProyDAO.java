/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import bd.Conexion;
import entidades.FinanCostoProy;
import entidades.Imprevistos;
import entidades.InfoReqProg;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Cactus
 */
public class FinanCostoProyDAO {

    private Conexion conexion = new Conexion();
    int contador = 32;

    public boolean insertarRespuesta(FinanCostoProy finanCostoProy) throws SQLException {

        boolean consultaCorrecta = false;
        Connection conn = conexion.conectar();

        try {
            
            

            String sql = "insert into finan_costo_proy (monto_soli_conadi, detalles_prod"
                    + ", id_pregunta, id_persona) values(?,?,?,?)";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, finanCostoProy.getMontoSoliConadi());
            stmt.setString(2, finanCostoProy.getDetallesProd());
            stmt.setInt(3, 32);
            stmt.setInt(4, finanCostoProy.getIdPersonaF());

            int cantidad = stmt.executeUpdate();

            if (cantidad > 0) {

                String sql2 = "insert into finan_costo_proy (monto_soli_conadi, detalles_prod"
                        + ", id_pregunta, id_persona) values(?,?,?,?)";
                PreparedStatement stmt2 = conn.prepareStatement(sql2);
                stmt2.setInt(1, finanCostoProy.getMontoSoliConadi2());
                stmt2.setString(2, finanCostoProy.getDetallesProd2());
                stmt2.setInt(3, 33);
                stmt2.setInt(4, finanCostoProy.getIdPersonaF());
                
                int cantidad2 = stmt2.executeUpdate();
                
                if(cantidad2>0){
                    consultaCorrecta = true;
                }

            }

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        return consultaCorrecta;
    }
    
    public ArrayList<FinanCostoProy> listarFinanCostoProyPorId(int id) throws SQLException{
        
        ArrayList<FinanCostoProy> finanCostoProy = new ArrayList<>();
        Connection cone = conexion.conectar();
        
        try {
            
            
            
            String sql = "select monto_soli_conadi, detalles_prod from finan_costo_proy "
                    + "where id_persona=(?)";
            PreparedStatement stmt = cone.prepareStatement(sql);
            stmt.setInt(1, id);
            
            ResultSet rs = stmt.executeQuery();
            
            while(rs.next()){
                
                FinanCostoProy fcp = new FinanCostoProy();
                fcp.setMontoSoliConadi(Integer.parseInt(rs.getString("monto_soli_conadi")));
                fcp.setDetallesProd(rs.getString("detalles_prod"));
                

                finanCostoProy.add(fcp);
                
                
            }
            
            
            
        } catch (Exception e) {
            System.out.println("ERROR dao: "+e.getMessage());
        }finally{
            
            cone.close();
            
        }
        
        return finanCostoProy;
    }

}
