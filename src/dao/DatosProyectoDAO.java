/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import bd.Conexion;
import entidades.DatosProyecto;
import entidades.Direccion;
import entidades.Persona;
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
public class DatosProyectoDAO {
    
    private Conexion conexion = new Conexion();

    public boolean consultaDatos(DatosProyecto datosProyecto, Persona persona, Direccion direccion, ResumenEje resumenEje) throws SQLException { 
        
        boolean consultaCorrecta = false;
        Connection conn = conexion.conectar();
        
        try {
            
            
            System.out.println("valor getIdPersonaF en DAO:"+datosProyecto.getIdPersonaF());
            
            String sql = "insert into datos_proyecto (nombre_proy, sector_comunidad,"
                    + " prop_impl_proy, sit_prop_inm, id_direccion, id_persona) values"
                    + "(?,?,?,?,?,?)";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, datosProyecto.getNombreProy());
            stmt.setString(2, datosProyecto.getSectorComunidad());
            stmt.setString(3, datosProyecto.getPropImplProy());
            stmt.setString(4, datosProyecto.getSitPropInm());
            stmt.setInt(5, datosProyecto.getIdDireccionF());
            stmt.setInt(6, datosProyecto.getIdPersonaF());
            
            int cantidad = stmt.executeUpdate();
            
            
            
            if(cantidad > 0){
                
                System.out.println("inserto correctamente datos de proyecto!!!");
                
                String sqlA = "select id_datos_proy from datos_proyecto where id_direccion=(?)";
                PreparedStatement stmtA = conn.prepareStatement(sqlA);
                stmtA.setInt(1, datosProyecto.getIdDireccionF());
                
                ResultSet rsA = stmtA.executeQuery();
                
                int valorA = 0;
                
                while(rsA.next()){
                    
                    valorA=rsA.getInt("id_datos_proy");
                    
                }
                
                
                
                resumenEje.setIdDatosProyF(valorA);
                
                System.out.println("valor de getIdDatosProyF " + resumenEje.getIdDatosProyF());
                
                
                
                
                consultaCorrecta = true;
            }
            
        } catch (Exception e) {
            
            System.out.println("Error: " + e.getMessage());
        }
        
        
        return consultaCorrecta;
    }
    
    
    public ArrayList<DatosProyecto> listarDatosProyectoPorId(Direccion direccion, int id) throws SQLException{
        
        ArrayList<DatosProyecto> datosProyectos = new ArrayList<>();
        Connection cone = conexion.conectar();
        
        try {
            
            String sql = "select id_datos_proy, nombre_proy, sector_comunidad, prop_impl_proy, sit_prop_inm, "
                    + "id_direccion from datos_proyecto "
                    + "where id_persona=(?)";
            PreparedStatement stmt = cone.prepareStatement(sql);
            stmt.setInt(1, id);
            
            ResultSet rs = stmt.executeQuery();
            
            while(rs.next()){
                
                DatosProyecto dp = new DatosProyecto();
                dp.setNombreProy(rs.getString("nombre_proy"));
                dp.setSectorComunidad(rs.getString("sector_comunidad"));
                dp.setPropImplProy(rs.getString("prop_impl_proy"));
                dp.setSitPropInm(rs.getString("sit_prop_inm"));
                
                direccion.setIdDatosProyecto(rs.getInt("id_direccion"));
                
                
                
                
                
                datosProyectos.add(dp);
                
                
            }
            
            
            
        } catch (Exception e) {
            System.out.println("ERROR dao: "+e.getMessage());
        }finally{
            
            cone.close();
            
        }
        
        return datosProyectos;
    }
    
}
