/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import bd.Conexion;
import entidades.DatosPersonaPostulante;
import entidades.DatosProyecto;
import entidades.Direccion;
import entidades.Persona;
import entidades.PersonaJur;
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
public class PersonaNatDAO {
    
    private Conexion conexion = new Conexion();

    public boolean consultaDatos(PersonaNat personaNat, Direccion direccion, ResumenEje resumenEje) throws SQLException { 
        
        boolean consultaCorrecta = false;
        Connection conn = conexion.conectar();
        
        try {
            
            String sql = "insert into persona_nat(nombres, apellido_pat, apellido_mat, "
                    + "rut, estado_civil, correo, telefono, telefono_dos, fecha_nac, "
                    + "id_direccion)"
                    + "values(?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, personaNat.getNombres());
            stmt.setString(2, personaNat.getApellidoPat());
            stmt.setString(3, personaNat.getApellidoMat());
            stmt.setString(4, personaNat.getRut());
            stmt.setString(5, personaNat.getEstadoCivil());
            stmt.setString(6, personaNat.getCorreo());
            stmt.setString(7, personaNat.getTelefono());
            stmt.setString(8, personaNat.getTelefonoDos());
            stmt.setString(9, personaNat.getFechaNac());
            stmt.setInt(10, personaNat.getIdDireccionF());
            
            int cantidad = stmt.executeUpdate();

            
            if (cantidad > 0) {

                String sql2 = "select id_nat from persona_nat where rut=(?)";
                PreparedStatement stmt2 = conn.prepareStatement(sql2);
                stmt2.setString(1, personaNat.getRut());
                
                
                ResultSet rs = stmt2.executeQuery();

                int valor = 0;

                while (rs.next()) {
                    valor = rs.getInt("id_nat");
                }

                
                //setear llaves foraneas a las tablas correspondientes:
                
                resumenEje.setPersNatF(valor);
                
                //respuesta.setIdPersonaF(valor);
                //proyecto.setIdPersonaF(valor);
                //empresa.setIdPersonaF(valor);
                
                
                
                

                

                if (valor != 0) {
                    consultaCorrecta = true;
                }

            }
            
        } catch (Exception e) {
            
            System.out.println("Error aqui 2: " + e.getMessage());
            
        }
        
        
        
        return consultaCorrecta;
    }
    
    
    public ArrayList<PersonaNat> listarPersonaNaturalPorId(PersonaNat personaNat, Direccion direccion) throws SQLException {

        ArrayList<PersonaNat> persNat = new ArrayList<>();
        Connection cone = conexion.conectar();

        try {
            
            //System.out.println("valor getIdJur: "+ personaJur.getIdJur());

            String sql3 = "select nombres, apellido_pat, apellido_mat, rut, estado_civil, correo, telefono, telefono_dos, fecha_nac, id_direccion from persona_nat where id_nat=(?)";
            PreparedStatement stmt3 = cone.prepareStatement(sql3);
            stmt3.setInt(1, personaNat.getIdNat());
            
            ResultSet rs3 = stmt3.executeQuery();
            
            while(rs3.next()){
                
                PersonaNat pn = new PersonaNat();
                
                pn.setNombres(rs3.getString("nombres"));
                pn.setApellidoPat(rs3.getString("apellido_pat"));
                pn.setApellidoMat(rs3.getString("apellido_mat"));
                pn.setRut(rs3.getString("rut"));
                pn.setEstadoCivil(rs3.getString("estado_civil"));
                pn.setCorreo(rs3.getString("correo"));
                pn.setTelefono(rs3.getString("telefono"));
                pn.setTelefonoDos(rs3.getString("telefono_dos"));
                pn.setFechaNac(rs3.getString("fecha_nac"));
                
                direccion.setIdDireccionPersNat(rs3.getInt("id_direccion"));
                
                persNat.add(pn);
                
            }
            

        } catch (Exception e) {
            System.out.println("ERROR aqui: " + e.getMessage());
        } finally {

            cone.close();

        }

        return persNat;
    }
    
}
