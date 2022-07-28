/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import bd.Conexion;
import entidades.DatosPersonaPostulante;
import entidades.DatosProyecto;
import entidades.Direccion;
import entidades.IdentiRepreLegal;
import entidades.Persona;
import entidades.PersonaNat;
import entidades.ResumenEje;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Cactus
 */
public class IdentiRepreLegalDAO {
    
    private Conexion conexion = new Conexion();

    public boolean consultaDatos(IdentiRepreLegal identiRepreLegal, ResumenEje resumenEje) throws SQLException { 
        
        boolean consultaCorrecta = false;
        Connection conn = conexion.conectar();
        
        try {
            
            String sql = "insert into identi_repre_legal(nombres, apellido_pat, apellido_mat, rut, estado_civil, "
                    + "correo, telefono, telefono_recados, fecha_naci, id_direccion)"
                    + "values(?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, identiRepreLegal.getNombres());
            stmt.setString(2, identiRepreLegal.getApePat());
            stmt.setString(3, identiRepreLegal.getApeMat());
            stmt.setString(4, identiRepreLegal.getRut());
            stmt.setString(5, identiRepreLegal.getEstadoCivil());
            stmt.setString(6, identiRepreLegal.getCorreo());
            stmt.setString(7, identiRepreLegal.getTelefono());
            stmt.setString(8, identiRepreLegal.getTelefonoRecados());
            stmt.setString(9, identiRepreLegal.getFechaNacimiento());
            stmt.setInt(10, identiRepreLegal.getIdDireccionF());
            
            int cantidad = stmt.executeUpdate();

            
            if (cantidad > 0) {

                String sql2 = "select id_repr_legal from identi_repre_legal where rut=(?)";
                PreparedStatement stmt2 = conn.prepareStatement(sql2);
                stmt2.setString(1, identiRepreLegal.getRut());
                
                
                ResultSet rs = stmt2.executeQuery();

                int valor = 0;

                while (rs.next()) {
                    valor = rs.getInt("id_repr_legal");
                }

                
                //setear llaves foraneas a las tablas correspondientes:
                
                resumenEje.setIdIdentiRepreLegalF(valor);
                
                
                //respuesta.setIdPersonaF(valor);
                //proyecto.setIdPersonaF(valor);
                //empresa.setIdPersonaF(valor);
                
                
                
                

                

                if (valor != 0) {
                    consultaCorrecta = true;
                }

            }
            
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        
        
        return consultaCorrecta;
    }
    
    
    public ArrayList<IdentiRepreLegal> listarIdentiRepreLegalPorId(IdentiRepreLegal identiRepreLegal, Direccion direccion) throws SQLException {

        ArrayList<IdentiRepreLegal> identiReprLegal = new ArrayList<>();
        Connection cone = conexion.conectar();

        try {
            
            //System.out.println("valor getIdJur: "+ personaJur.getIdJur());

            String sql3 = "select nombres, apellido_pat, apellido_mat, rut, estado_civil, correo, telefono, telefono_recados, fecha_naci, id_direccion from identi_repre_legal"
                    + " where id_repr_legal=(?)";
            PreparedStatement stmt3 = cone.prepareStatement(sql3);
            stmt3.setInt(1, identiRepreLegal.getIdRepreLegal());
            
            ResultSet rs3 = stmt3.executeQuery();
            
            while(rs3.next()){
                
                IdentiRepreLegal irl = new IdentiRepreLegal();
                
                irl.setNombres(rs3.getString("nombres"));
                irl.setApePat(rs3.getString("apellido_pat"));
                irl.setApeMat(rs3.getString("apellido_mat"));
                irl.setRut(rs3.getString("rut"));
                irl.setEstadoCivil(rs3.getString("estado_civil"));
                irl.setCorreo(rs3.getString("correo"));
                irl.setTelefono(rs3.getString("telefono"));
                irl.setTelefonoRecados(rs3.getString("telefono_recados"));
                irl.setFechaNacimiento(rs3.getString("fecha_naci"));
                
                direccion.setIdDireccionRepreLegal(rs3.getInt("id_direccion"));
                
                identiReprLegal.add(irl);
                
            }
            

        } catch (Exception e) {
            System.out.println("ERROR aqui: " + e.getMessage());
        } finally {

            cone.close();

        }

        return identiReprLegal;
    }
    
    
    
}
