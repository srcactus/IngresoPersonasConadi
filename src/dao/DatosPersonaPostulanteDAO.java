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
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Cactus
 */
public class DatosPersonaPostulanteDAO {
    
    private Conexion conexion = new Conexion();

    public boolean consultaDatos(Persona persona, DatosPersonaPostulante datosPersonaPostulante) throws SQLException { 
        
        boolean consultaCorrecta = false;
        Connection conn = conexion.conectar();
        
        try {
            
            System.out.println("valor getIdPersonaF en DatosPersonaPostulanteDAO: " + datosPersonaPostulante.getIdPersonaF());
            
            String sql = "insert into datos_persona_postulante (telefono_dos, sector, num_cert_indigena, id_persona)"
                    + "values (?,?,?,?)";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, datosPersonaPostulante.getTelefonoDos());
            stmt.setString(2, datosPersonaPostulante.getSector());
            stmt.setInt(3, datosPersonaPostulante.getNumCertIndigena());
            stmt.setInt(4, datosPersonaPostulante.getIdPersonaF());
            
            int cantidad = stmt.executeUpdate();
            
            if(cantidad > 0 ){
                consultaCorrecta = true;
            }
            
        } catch (Exception e) {
            
            System.out.println("Error: " + e.getMessage());
            
        }
        
        
        return consultaCorrecta;
    }
    
    
    public ArrayList<DatosPersonaPostulante> listarDatosPersonaPostulantePorId(int id) throws SQLException{
        
        ArrayList<DatosPersonaPostulante> datosPersonasPostulantes = new ArrayList<>();
        Connection cone = conexion.conectar();
        
        try {
            
            String sql = "select telefono_dos, sector, num_cert_indigena "
                    + "from datos_persona_postulante where id_persona=(?);";
            
            PreparedStatement stmt = cone.prepareStatement(sql);
            stmt.setInt(1, id);
            
            ResultSet rs = stmt.executeQuery();
            
            while(rs.next()){
                
                DatosPersonaPostulante dpp = new DatosPersonaPostulante();
                dpp.setTelefonoDos(Integer.toString(rs.getInt("telefono_dos")));
                dpp.setSector(rs.getString("sector"));
                dpp.setNumCertIndigena(Integer.parseInt(rs.getString("num_cert_indigena")));
              
                
                datosPersonasPostulantes.add(dpp);
                
                
            }
            
            
            
        } catch (Exception e) {
            System.out.println("ERROR dao dpp: "+e.getMessage());
        }finally{
            
            cone.close();
            
        }
        
        return datosPersonasPostulantes;
    }
    
}
