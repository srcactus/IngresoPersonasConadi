/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import bd.Conexion;
import entidades.DatosPersonaPostulante;
import entidades.DatosProyecto;
import entidades.Direccion;
import entidades.FinanCostoProy;
import entidades.InfoProy;
import entidades.InfoReqProg;
import entidades.Persona;
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
public class PersonaDAO {
    
    private Conexion conexion = new Conexion();

    public boolean consultaDatos(Persona persona, DatosPersonaPostulante datosPersonaPostulante, DatosProyecto datosProyecto) throws SQLException { 
        
        boolean consultaCorrecta = false;
        Connection conn = conexion.conectar();
        
        try {
            
            String sql = "insert into persona(rut, nombres, ape_pat, ape_mat, "
                    + "pueblo_indi, correo, telefono, fecha_post, id_direccion)"
                    + "values(?,?,?,?,?,?,?,?,?)";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, persona.getRut());
            stmt.setString(2, persona.getNombres());
            stmt.setString(3, persona.getApePat());
            stmt.setString(4, persona.getApeMat());
            stmt.setString(5, persona.getPuebloIndigena());
            stmt.setString(6, persona.getCorreo());
            stmt.setInt(7, persona.getTelefono());
            stmt.setString(8, persona.getFechaPostulacion());
            stmt.setInt(9, persona.getIdDireccionF());
            
            int cantidad = stmt.executeUpdate();

            
            if (cantidad > 0) {

                String sql2 = "select id_pers from persona where rut=(?)";
                PreparedStatement stmt2 = conn.prepareStatement(sql2);
                stmt2.setString(1, persona.getRut());
                
                
                ResultSet rs = stmt2.executeQuery();

                int valor = 0;

                while (rs.next()) {
                    valor = rs.getInt("id_pers");
                }

                
                //setear llaves foraneas a las tablas correspondientes:
                
                persona.setIdPersona(valor);
                datosPersonaPostulante.setIdPersonaF(valor);
                datosProyecto.setIdPersonaF(valor);
                
                System.out.println("valor getIdPersonaF par datosPersonaPostulante: "+datosPersonaPostulante.getIdPersonaF());
                
                
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
    
    public ArrayList<Persona> listarPersonaPorId(int id, Direccion direccion) throws SQLException{
        
        ArrayList<Persona> personas = new ArrayList<>();
        Connection cone = conexion.conectar();
        
        try {
            
            String sql = "select rut, nombres, ape_pat, ape_mat, "
                    + "pueblo_indi, correo, telefono, fecha_post, id_direccion  from persona "
                    + "where id_pers=(?)";
            PreparedStatement stmt = cone.prepareStatement(sql);
            stmt.setInt(1, id);
            
            ResultSet rs = stmt.executeQuery();
            
            while(rs.next()){
                
                Persona p = new Persona();
                p.setRut(Integer.toString(rs.getInt("rut")));
                p.setNombres(rs.getString("nombres"));
                p.setApePat(rs.getString("ape_pat"));
                p.setApeMat(rs.getString("ape_mat"));
                p.setPuebloIndigena(rs.getString("pueblo_indi"));
                p.setCorreo(rs.getString("correo"));
                p.setTelefono(Integer.parseInt(rs.getString("telefono")));
                p.setFechaPostulacion(rs.getString("fecha_post"));
                direccion.setIdDireccion(rs.getInt("id_direccion"));
                
                personas.add(p);
                
                
            }
            
            
            
        } catch (Exception e) {
            System.out.println("ERROR dao: "+e.getMessage());
        }finally{
            
            cone.close();
            
        }
        
        return personas;
    }
    
}
