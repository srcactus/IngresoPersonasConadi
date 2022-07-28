/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import bd.Conexion;
import entidades.InfoProy;
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
public class InfoProyDAO {

    private Conexion conexion = new Conexion();
    int contadorF = 21;

    public boolean insertarRespuesta(InfoProy infoProy) throws SQLException {

        boolean consultaCorrecta = false;
        Connection conn = conexion.conectar();

        try {

            if (contadorF <= 31) {

                String sql = "insert into info_proy(respuesta, id_pregunta, id_persona) "
                        + "values(?,?,?)";
                PreparedStatement stmt = conn.prepareStatement(sql);
                stmt.setString(1, infoProy.getR1());
                stmt.setInt(2, contadorF);
                stmt.setInt(3, infoProy.getIdPersonaF());
                stmt.executeUpdate();
                contadorF++;

                if (contadorF <= 31) {

                    String sql2 = "insert into info_proy(respuesta, id_pregunta, id_persona) "
                            + "values(?,?,?)";
                    PreparedStatement stmt2 = conn.prepareStatement(sql2);
                    stmt2.setString(1, infoProy.getR2());
                    stmt2.setInt(2, contadorF);
                    stmt2.setInt(3, infoProy.getIdPersonaF());
                    stmt2.executeUpdate();
                    contadorF++;

                    if (contadorF <= 31) {

                        String sql3 = "insert into info_proy(respuesta, id_pregunta, id_persona) "
                                + "values(?,?,?)";
                        PreparedStatement stmt3 = conn.prepareStatement(sql3);
                        stmt3.setString(1, infoProy.getR3());
                        stmt3.setInt(2, contadorF);
                        stmt3.setInt(3, infoProy.getIdPersonaF());
                        stmt3.executeUpdate();
                        contadorF++;

                        if (contadorF <= 31) {

                            String sql4 = "insert into info_proy(respuesta, id_pregunta, id_persona) "
                                    + "values(?,?,?)";
                            PreparedStatement stmt4 = conn.prepareStatement(sql4);
                            stmt4.setString(1, infoProy.getR4());
                            stmt4.setInt(2, contadorF);
                            stmt4.setInt(3, infoProy.getIdPersonaF());
                            stmt4.executeUpdate();
                            contadorF++;
                            
                            if (contadorF <= 31) {

                                String sql5 = "insert into info_proy(respuesta, id_pregunta, id_persona) "
                                        + "values(?,?,?)";
                                PreparedStatement stmt5 = conn.prepareStatement(sql5);
                                stmt5.setString(1, infoProy.getR5());
                                stmt5.setInt(2, contadorF);
                                stmt5.setInt(3, infoProy.getIdPersonaF());
                                stmt5.executeUpdate();
                                contadorF++;

                                if (contadorF <= 31) {

                                    String sql6 = "insert into info_proy(respuesta, id_pregunta, id_persona) "
                                            + "values(?,?,?)";
                                    PreparedStatement stmt6 = conn.prepareStatement(sql6);
                                    stmt6.setString(1, infoProy.getR6());
                                    stmt6.setInt(2, contadorF);
                                    stmt6.setInt(3, infoProy.getIdPersonaF());
                                    stmt6.executeUpdate();
                                    contadorF++;

                                    if (contadorF <= 31) {

                                        String sql7 = "insert into info_proy(respuesta, id_pregunta, id_persona) "
                                                + "values(?,?,?)";
                                        PreparedStatement stmt7 = conn.prepareStatement(sql7);
                                        stmt7.setString(1, infoProy.getR7());
                                        stmt7.setInt(2, contadorF);
                                        stmt7.setInt(3, infoProy.getIdPersonaF());
                                        stmt7.executeUpdate();
                                        contadorF++;

                                        if (contadorF <= 31) {

                                            String sql8 = "insert into info_proy(respuesta, id_pregunta, id_persona) "
                                                    + "values(?,?,?)";
                                            PreparedStatement stmt8 = conn.prepareStatement(sql8);
                                            stmt8.setString(1, infoProy.getR8());
                                            stmt8.setInt(2, contadorF);
                                            stmt8.setInt(3, infoProy.getIdPersonaF());
                                            stmt8.executeUpdate();
                                            contadorF++;

                                            if (contadorF <= 31) {

                                                String sql9 = "insert into info_proy(respuesta, id_pregunta, id_persona) "
                                                        + "values(?,?,?)";
                                                PreparedStatement stmt9 = conn.prepareStatement(sql9);
                                                stmt9.setString(1, infoProy.getR9());
                                                stmt9.setInt(2, contadorF);
                                                stmt9.setInt(3, infoProy.getIdPersonaF());
                                                stmt9.executeUpdate();
                                                contadorF++;

                                                if (contadorF <= 31) {

                                                    String sql10 = "insert into info_proy(respuesta, id_pregunta, id_persona) "
                                                            + "values(?,?,?)";
                                                    PreparedStatement stmt10 = conn.prepareStatement(sql10);
                                                    stmt10.setString(1, infoProy.getR10());
                                                    stmt10.setInt(2, contadorF);
                                                    stmt10.setInt(3, infoProy.getIdPersonaF());
                                                    stmt10.executeUpdate();
                                                    contadorF++;

                                                    if (contadorF <= 31) {

                                                        String sql11 = "insert into info_proy(respuesta, id_pregunta, id_persona) "
                                                                + "values(?,?,?)";
                                                        PreparedStatement stmt11 = conn.prepareStatement(sql11);
                                                        stmt11.setString(1, infoProy.getR11());
                                                        stmt11.setInt(2, contadorF);
                                                        stmt11.setInt(3, infoProy.getIdPersonaF());
                                                        stmt11.executeUpdate();
                                                        
                                                        consultaCorrecta = true;

                                                    }

                                                }

                                            }

                                        }

                                    }

                                }

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
    
    
    public ArrayList<InfoProy> listarRespuestaInfoProyPorId(int id) throws SQLException{
        
        ArrayList<InfoProy> infoProy = new ArrayList<>();
        Connection cone = conexion.conectar();
        
        try {
            
            String sql = "select respuesta from info_proy where id_persona=(?)";
            PreparedStatement stmt = cone.prepareStatement(sql);
            stmt.setInt(1, id);
            
            ResultSet rs = stmt.executeQuery();
            
            while(rs.next()){
                
                InfoProy ip = new InfoProy();
                
                ip.setRespuestas(rs.getString("respuesta"));
                
                
                infoProy.add(ip);
                
                
            }
            
            
        } catch (Exception e) {
            System.out.println("ERROR: "+e.getMessage());
        }finally{
            
            cone.close();
            
        }
        
        return infoProy;
    }

}
