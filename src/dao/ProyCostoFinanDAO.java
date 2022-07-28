/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import bd.Conexion;
import entidades.Comuna;
import entidades.FinanCostoProy;
import entidades.Provincia;
import entidades.ProyCostoFinan;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Cactus
 */
public class ProyCostoFinanDAO {

    int contadorF = 47;
    private Conexion conexion = new Conexion();

    public boolean consultaDatos(ProyCostoFinan proyCostoFinan) throws SQLException {

        boolean consultaCorrecta = false;
        Connection conn = conexion.conectar();

        try {

            if (contadorF <= 49) {

                String sql1 = "insert into proy_costo_finan(monto_soli_conadi, detalle, id_persona, id_pregunta) "
                        + "values(?,?,?,?)";
                PreparedStatement stmt1 = conn.prepareStatement(sql1);
                stmt1.setInt(1, proyCostoFinan.getMontoSoliConadi());
                stmt1.setString(2, proyCostoFinan.getDetalle());
                stmt1.setInt(3, proyCostoFinan.getIdPersonaF());
                stmt1.setInt(4, contadorF);

                stmt1.executeUpdate();
                contadorF++;

                if (contadorF <= 49) {

                    String sql2 = "insert into proy_costo_finan(monto_soli_conadi, detalle, id_persona, id_pregunta) "
                            + "values(?,?,?,?)";
                    PreparedStatement stmt2 = conn.prepareStatement(sql2);
                    stmt2.setInt(1, proyCostoFinan.getMontoSoliConadi2());
                    stmt2.setString(2, proyCostoFinan.getDetalle2());
                    stmt2.setInt(3, proyCostoFinan.getIdPersonaF());
                    stmt2.setInt(4, contadorF);

                    stmt2.executeUpdate();
                    contadorF++;

                    if (contadorF <= 49) {

                        String sql3 = "insert into proy_costo_finan(monto_soli_conadi, detalle, id_persona, id_pregunta) "
                                + "values(?,?,?,?)";
                        PreparedStatement stmt3 = conn.prepareStatement(sql3);
                        stmt3.setInt(1, proyCostoFinan.getMontoSoliConadi3());
                        stmt3.setString(2, proyCostoFinan.getDetalle3());
                        stmt3.setInt(3, proyCostoFinan.getIdPersonaF());
                        stmt3.setInt(4, contadorF);

                        stmt3.executeUpdate();
                        contadorF++;
                        
                        consultaCorrecta = true;
                        
                    }
                }
            }

        } catch (Exception e) {
            
            System.out.println("Error: " + e.getMessage());
            
        }

        return consultaCorrecta;
    }
    
    
    public ArrayList<ProyCostoFinan> listarProyCostoFinanPorId(int id) throws SQLException{
        
        ArrayList<ProyCostoFinan> proyCostoFinan = new ArrayList<>();
        Connection cone = conexion.conectar();
        
        try {
            
            
            
            String sql = "select monto_soli_conadi, detalle from proy_costo_finan "
                    + "where id_persona=(?)";
            PreparedStatement stmt = cone.prepareStatement(sql);
            stmt.setInt(1, id);
            
            ResultSet rs = stmt.executeQuery();
            
            while(rs.next()){
                
                ProyCostoFinan pcf = new ProyCostoFinan();
                pcf.setMontoSoliConadi(Integer.parseInt(rs.getString("monto_soli_conadi")));
                pcf.setDetalle(rs.getString("detalle"));
                
                proyCostoFinan.add(pcf);
                
                
            }
            
            
            
        } catch (Exception e) {
            System.out.println("ERROR dao: "+e.getMessage());
        }finally{
            
            cone.close();
            
        }
        
        return proyCostoFinan;
    }

}
