/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import bd.Conexion;
import entidades.DesaProy;
import entidades.DesarrolloProy;
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
public class DesaProyDAO {

    private Conexion conexion = new Conexion();
    int contadorF = 34;

    public boolean consultaDatos(DesarrolloProy desarrolloProy) throws SQLException {

        boolean consultaCorrecta = false;
        Connection conn = conexion.conectar();

        try {

            if (contadorF <= 41) {

                String sql1 = "insert into desa_proy(respuesta, id_persona, id_pregunta) "
                        + "values(?,?,?)";
                PreparedStatement stmt1 = conn.prepareStatement(sql1);
                stmt1.setString(1, desarrolloProy.getR1());
                stmt1.setInt(2, desarrolloProy.getIdPersonaF());
                stmt1.setInt(3, contadorF);

                stmt1.executeUpdate();
                contadorF++;

                if (contadorF <= 41) {

                    String sql2 = "insert into desa_proy(respuesta, id_persona, id_pregunta) "
                            + "values(?,?,?)";
                    PreparedStatement stmt2 = conn.prepareStatement(sql2);
                    stmt2.setString(1, desarrolloProy.getR2());
                    stmt2.setInt(2, desarrolloProy.getIdPersonaF());
                    stmt2.setInt(3, contadorF);

                    stmt2.executeUpdate();
                    contadorF++;

                    if (contadorF <= 41) {

                        String sql3 = "insert into desa_proy(respuesta, id_persona, id_pregunta) "
                                + "values(?,?,?)";
                        PreparedStatement stmt3 = conn.prepareStatement(sql3);
                        stmt3.setString(1, desarrolloProy.getR3());
                        stmt3.setInt(2, desarrolloProy.getIdPersonaF());
                        stmt3.setInt(3, contadorF);

                        stmt3.executeUpdate();
                        contadorF++;

                        if (contadorF <= 41) {

                            String sql4 = "insert into desa_proy(respuesta, id_persona, id_pregunta) "
                                    + "values(?,?,?)";
                            PreparedStatement stmt4 = conn.prepareStatement(sql4);
                            stmt4.setString(1, desarrolloProy.getR4());
                            stmt4.setInt(2, desarrolloProy.getIdPersonaF());
                            stmt4.setInt(3, contadorF);

                            stmt4.executeUpdate();
                            contadorF++;

                            if (contadorF <= 41) {

                                String sql5 = "insert into desa_proy(respuesta, id_persona, id_pregunta) "
                                        + "values(?,?,?)";
                                PreparedStatement stmt5 = conn.prepareStatement(sql5);
                                stmt5.setString(1, desarrolloProy.getR5());
                                stmt5.setInt(2, desarrolloProy.getIdPersonaF());
                                stmt5.setInt(3, contadorF);

                                stmt5.executeUpdate();
                                contadorF++;

                                if (contadorF <= 41) {

                                    String sql6 = "insert into desa_proy(respuesta, id_persona, id_pregunta) "
                                            + "values(?,?,?)";
                                    PreparedStatement stmt6 = conn.prepareStatement(sql6);
                                    stmt6.setString(1, desarrolloProy.getR6());
                                    stmt6.setInt(2, desarrolloProy.getIdPersonaF());
                                    stmt6.setInt(3, contadorF);

                                    stmt6.executeUpdate();
                                    contadorF++;

                                    if (contadorF <= 41) {

                                        String sql7 = "insert into desa_proy(respuesta, id_persona, id_pregunta) "
                                                + "values(?,?,?)";
                                        PreparedStatement stmt7 = conn.prepareStatement(sql7);
                                        stmt7.setString(1, desarrolloProy.getR7());
                                        stmt7.setInt(2, desarrolloProy.getIdPersonaF());
                                        stmt7.setInt(3, contadorF);

                                        stmt7.executeUpdate();
                                        contadorF++;

                                        if (contadorF <= 41) {

                                            String sql8 = "insert into desa_proy(respuesta, id_persona, id_pregunta) "
                                                    + "values(?,?,?)";
                                            PreparedStatement stmt8 = conn.prepareStatement(sql8);
                                            stmt8.setString(1, desarrolloProy.getR8());
                                            stmt8.setInt(2, desarrolloProy.getIdPersonaF());
                                            stmt8.setInt(3, contadorF);

                                            stmt8.executeUpdate();
                                            contadorF++;
                                            
                                            consultaCorrecta = true;
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
    
    
    public ArrayList<DesaProy> listarRespuestaDesaProyPorId(int id) throws SQLException{
        
        ArrayList<DesaProy> desaProy = new ArrayList<>();
        Connection cone = conexion.conectar();
        
        try {
            
            String sql = "select respuesta from desa_proy where id_persona=(?)";
            PreparedStatement stmt = cone.prepareStatement(sql);
            stmt.setInt(1, id);
            
            ResultSet rs = stmt.executeQuery();
            
            while(rs.next()){
                
                DesaProy dp = new DesaProy();
                
                dp.setRespuestas(rs.getString("respuesta"));
                
                desaProy.add(dp);
                
            }

            
        } catch (Exception e) {
            System.out.println("ERROR: "+e.getMessage());
        }finally{
            
            cone.close();
            
        }
        
        return desaProy;
    }

}
