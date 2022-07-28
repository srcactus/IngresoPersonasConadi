/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import bd.Conexion;
import entidades.Comuna;
import entidades.Direccion;
import entidades.Provincia;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Cactus
 */
public class ComunaDAO {

    private Conexion conexion = new Conexion();

    public boolean consultaDatos(Comuna comuna, Direccion direccion) throws SQLException {

        boolean consultaCorrecta = false;
        Connection conn = conexion.conectar();

        try {

            String sql = "select id_comuna from comuna where nombre_com=(?)";

            PreparedStatement stmt = conn.prepareStatement(sql);

            stmt.setString(1, comuna.getNombreCom());

            ResultSet rs = stmt.executeQuery();

            int valor = 0;

            while (rs.next()) {
                valor = rs.getInt("id_comuna");
            }

            direccion.setIdComunaF(valor);

            //System.out.println("valor del getIdComunaF: " + direccion.getIdComunaF());
            if (valor != 0) {

                consultaCorrecta = true;

            }

            //System.out.println("valor del getIdComunaF: " + localidad.getIdComunaF());
            if (valor != 0) {

                String sql2 = "select id_comuna from comuna where nombre_com=(?)";

                PreparedStatement stmt2 = conn.prepareStatement(sql2);

                stmt2.setString(1, comuna.getNombreComDatosProyecto());

                ResultSet rs2 = stmt2.executeQuery();

                int valor2 = 0;

                while (rs2.next()) {
                    valor2 = rs2.getInt("id_comuna");
                }

                direccion.setIdComunaDatosProyectoF(valor2);

                //System.out.println("valor del getIdComunaFEmp: " + localidad.getIdComunaFEmp());
                consultaCorrecta = true;

                if (valor2 != 0) {

                    String sql4 = "select id_comuna from comuna where nombre_com=(?)";

                    PreparedStatement stmt4 = conn.prepareStatement(sql4);

                    stmt4.setString(1, comuna.getNombreComRepreLegal());
                    System.out.println("valor del getNombreComRepreLegal en comunaDAO: " + comuna.getNombreComRepreLegal());

                    ResultSet rs4 = stmt4.executeQuery();

                    int valor4 = 0;

                    while (rs4.next()) {
                        valor4 = rs4.getInt("id_comuna");
                    }

                    direccion.setIdDireccionRepreLegal(valor4);
                    System.out.println("valor del setIdDireccionRepreLegal en comunaDAO: " + direccion.getIdDireccionRepreLegal());

                    consultaCorrecta = true;

                }
            }

        } catch (Exception e) {

            System.out.println("Error: " + e.getMessage());

        }

        return consultaCorrecta;

    }

    public boolean consultaDatosPersonaNat(Comuna comuna, Direccion direccion) throws SQLException {

        boolean consultaCorrecta = false;
        Connection conn = conexion.conectar();

        try {

            String sql3 = "select id_comuna from comuna where nombre_com=(?)";

            PreparedStatement stmt3 = conn.prepareStatement(sql3);

            stmt3.setString(1, comuna.getNombreComPersNat());
            System.out.println("valor del getNombreComPersNat en comunaDAO: " + comuna.getNombreComPersNat());

            ResultSet rs3 = stmt3.executeQuery();

            int valor3 = 0;

            while (rs3.next()) {
                valor3 = rs3.getInt("id_comuna");
            }

            direccion.setIdComunaPersonaNat(valor3);
            System.out.println("toma el valor3 en comunaDAO? " + valor3);
            System.out.println("valor del setIdComunaPersonaNat en comunaDAO: " + direccion.getIdComunaPersonaNat());

            consultaCorrecta = true;

        } catch (Exception e) {

            System.out.println("Error: " + e.getMessage());

        }

        return consultaCorrecta;
    }
    
    
    public ArrayList<Comuna> listarComunaPorId(Provincia provincia, Comuna comuna) throws SQLException{
        
        ArrayList<Comuna> comun = new ArrayList<>();
        Connection cone = conexion.conectar();
        
        try {
            
            String sql = "select nombre_com, id_provincia from comuna where id_comuna=(?)";
            PreparedStatement stmt = cone.prepareStatement(sql);
            stmt.setInt(1, comuna.getIdComuna());
            
            ResultSet rs = stmt.executeQuery();
            
            while(rs.next()){
                
                Comuna c = new Comuna();
                
                
                c.setNombreCom(rs.getString("nombre_com"));
                provincia.setIdProvincia(rs.getInt("id_provincia"));
                
                
                comun.add(c);
                
            }
            
            
            
        } catch (Exception e) {
            System.out.println("ERROR: "+e.getMessage());
        }finally{
            
            cone.close();
            
        }
        
        return comun;
    }
    
    
    public ArrayList<Comuna> listarComunaDatosProyectoPorId(Provincia provincia, Comuna comuna) throws SQLException{
        
        ArrayList<Comuna> comunDatosProy = new ArrayList<>();
        Connection cone = conexion.conectar();
        
        try {
            
            String sql = "select nombre_com, id_provincia from comuna where id_comuna=(?)";
            PreparedStatement stmt = cone.prepareStatement(sql);
            stmt.setInt(1, comuna.getIdComuna());
            
            ResultSet rs = stmt.executeQuery();
            
            while(rs.next()){
                
                Comuna c = new Comuna();
                
                
                c.setNombreComDatosProyecto(rs.getString("nombre_com"));
                provincia.setIdProvincia(rs.getInt("id_provincia"));
                
                
                comunDatosProy.add(c);
                
            }
            
            
            
        } catch (Exception e) {
            System.out.println("ERROR: "+e.getMessage());
        }finally{
            
            cone.close();
            
        }
        
        return comunDatosProy;
    }
    
    
    public ArrayList<Comuna> listarComunaPersNatPorId(Provincia provincia, Comuna comuna) throws SQLException{
        
        ArrayList<Comuna> comunPersNat = new ArrayList<>();
        Connection cone = conexion.conectar();
        
        try {
            
            String sql = "select nombre_com, id_provincia from comuna where id_comuna=(?)";
            PreparedStatement stmt = cone.prepareStatement(sql);
            stmt.setInt(1, comuna.getIdComPersNat());
            
            ResultSet rs = stmt.executeQuery();
            
            while(rs.next()){
                
                Comuna c = new Comuna();
                
                
                c.setNombreComPersNat(rs.getString("nombre_com"));
                provincia.setIdProvPersNat(rs.getInt("id_provincia"));
                
                
                comunPersNat.add(c);
                
            }
            
            
            
        } catch (Exception e) {
            System.out.println("ERROR: "+e.getMessage());
        }finally{
            
            cone.close();
            
        }
        
        return comunPersNat;
    }
    
    
    public ArrayList<Comuna> listarComunaIdentiRepreLegalPorId(Provincia provincia, Comuna comuna) throws SQLException{
        
        ArrayList<Comuna> comunIdentiRepreLegal = new ArrayList<>();
        Connection cone = conexion.conectar();
        
        try {
            
            String sql = "select nombre_com, id_provincia from comuna where id_comuna=(?)";
            PreparedStatement stmt = cone.prepareStatement(sql);
            stmt.setInt(1, comuna.getIdComRepreLegal());
            
            ResultSet rs = stmt.executeQuery();
            
            while(rs.next()){
                
                Comuna c = new Comuna();
                
                
                c.setNombreComRepreLegal(rs.getString("nombre_com"));
                provincia.setIdProvRepreLegal(rs.getInt("id_provincia"));
                
                
                comunIdentiRepreLegal.add(c);
                
            }
            
            
            
        } catch (Exception e) {
            System.out.println("ERROR: "+e.getMessage());
        }finally{
            
            cone.close();
            
        }
        
        return comunIdentiRepreLegal;
    }
    
    

}
