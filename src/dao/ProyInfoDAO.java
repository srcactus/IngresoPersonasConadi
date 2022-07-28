/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import bd.Conexion;
import entidades.InfoProy;
import entidades.InfoReqProg;
import entidades.ProyInfo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Cactus
 */
public class ProyInfoDAO {

    private Conexion conexion = new Conexion();
    int contadorF = 42;

    public boolean insertarRespuesta(ProyInfo proyInfo) throws SQLException {

        boolean consultaCorrecta = false;
        Connection conn = conexion.conectar();

        try {
            if (contadorF <= 46) {

                String sql = "insert into proy_info(respuesta, id_pregunta, id_persona) "
                        + "values(?,?,?)";
                PreparedStatement stmt = conn.prepareStatement(sql);
                stmt.setString(1, proyInfo.getR1());
                stmt.setInt(2, contadorF);
                stmt.setInt(3, proyInfo.getIdPersonaF());
                stmt.executeUpdate();
                contadorF++;

                if (contadorF <= 46) {

                    String sql2 = "insert into proy_info(respuesta, id_pregunta, id_persona) "
                            + "values(?,?,?)";
                    PreparedStatement stmt2 = conn.prepareStatement(sql2);
                    stmt2.setString(1, proyInfo.getR2());
                    stmt2.setInt(2, contadorF);
                    stmt2.setInt(3, proyInfo.getIdPersonaF());
                    stmt2.executeUpdate();
                    contadorF++;

                    if (contadorF <= 46) {

                        String sq3 = "insert into proy_info(respuesta, id_pregunta, id_persona) "
                                + "values(?,?,?)";
                        PreparedStatement stm3 = conn.prepareStatement(sq3);
                        stm3.setString(1, proyInfo.getR3());
                        stm3.setInt(2, contadorF);
                        stm3.setInt(3, proyInfo.getIdPersonaF());
                        stm3.executeUpdate();
                        contadorF++;

                        if (contadorF <= 46) {

                            String sql4 = "insert into proy_info(respuesta, id_pregunta, id_persona) "
                                    + "values(?,?,?)";
                            PreparedStatement stmt4 = conn.prepareStatement(sql4);
                            stmt4.setString(1, proyInfo.getR4());
                            stmt4.setInt(2, contadorF);
                            stmt4.setInt(3, proyInfo.getIdPersonaF());
                            stmt4.executeUpdate();
                            contadorF++;

                            if (contadorF <= 46) {

                                String sql5 = "insert into proy_info(respuesta, id_pregunta, id_persona) "
                                        + "values(?,?,?)";
                                PreparedStatement stmt5 = conn.prepareStatement(sql5);
                                stmt5.setString(1, proyInfo.getR5());
                                stmt5.setInt(2, contadorF);
                                stmt5.setInt(3, proyInfo.getIdPersonaF());
                                stmt5.executeUpdate();
                                contadorF++;
                                
                                consultaCorrecta = true;
                                
                            }
                        }
                    }
                }
            }
        } catch (Exception e) {
            
            System.out.println("Error: " + e.getMessage());

        }

        return consultaCorrecta;
    }
    
    
    public ArrayList<ProyInfo> listarRespuestaProyInfoPorId(int id) throws SQLException{
        
        ArrayList<ProyInfo> proyInfo = new ArrayList<>();
        Connection cone = conexion.conectar();
        
        try {
            
            String sql = "select respuesta from proy_info where id_persona=(?)";
            PreparedStatement stmt = cone.prepareStatement(sql);
            stmt.setInt(1, id);
            
            ResultSet rs = stmt.executeQuery();
            
            while(rs.next()){
                
                ProyInfo pi = new ProyInfo();
                
                pi.setRespuestas(rs.getString("respuesta"));
                
                
                proyInfo.add(pi);
                
                
            }
            
            
        } catch (Exception e) {
            System.out.println("ERROR: "+e.getMessage());
        }finally{
            
            cone.close();
            
        }
        
        return proyInfo;
    }

}
