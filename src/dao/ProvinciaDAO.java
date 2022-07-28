/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import bd.Conexion;
import entidades.Comuna;
import entidades.Provincia;
import entidades.Region;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Cactus
 */
public class ProvinciaDAO {
    
    private Conexion conexion = new Conexion();
    
    public boolean consultaDatos(Provincia provincia, Comuna comuna) throws SQLException {
        
        boolean consultaCorrecta = false;
        Connection conn = conexion.conectar();
        
        
        
        try {
            
            String sql = "select id_provincia from provincia where nombre_prov=(?)";
            
            PreparedStatement stmt = conn.prepareStatement(sql);
            
            stmt.setString(1, provincia.getNombreProv());
            
            ResultSet rs = stmt.executeQuery();
            
            //System.out.println("***valor getIdRegionF:--> "+provincia.getIdRegionF());
            
            
            int valor = 0;
            
            while(rs.next()){
                valor = rs.getInt("id_provincia");
            }
            
    
            comuna.setIdProvinciaF(valor);
            
            if(valor != 0){
                consultaCorrecta = true;
            }
            
            //System.out.println("valor del getIdProvinciaF: "+ comuna.getIdProvinciaF());
            
            /*if(valor != 0){
                
                String sql2 = "select id_provincia from provincia where nombre_prov=(?)";
                PreparedStatement stmt2 = conn.prepareStatement(sql2);
                
                stmt2.setString(1, provincia.getNombreProvinciaEmp());
                
                ResultSet rs2 = stmt2.executeQuery();
                
                int valor2 = 0;
                while(rs2.next()){
                    valor2 = rs2.getInt("id_provincia");
                }
                
                comuna.setIdProvinciaFEmp(valor2);
                
                System.out.println("valor del getIdProvinciaFEmp: "+ comuna.getIdProvinciaFEmp());
                
                consultaCorrecta = true;
            }*/
            
        } catch (Exception e) {
            
            System.out.println("Error: " + e.getMessage());
            
        }
        
        return consultaCorrecta;
        
    }
    
    
    public ArrayList<Provincia> listarProvinciaPorId(Provincia provincia, Region region) throws SQLException{
        
        ArrayList<Provincia> provi = new ArrayList<>();
        Connection cone = conexion.conectar();
        
        try {
            
            String sql = "select nombre_prov, id_region from provincia where id_provincia=(?)";
            PreparedStatement stmt = cone.prepareStatement(sql);
            stmt.setInt(1, provincia.getIdProvincia());
            
            ResultSet rs = stmt.executeQuery();
            
            while(rs.next()){
                
                Provincia p = new Provincia();
                
                p.setNombreProv(rs.getString("nombre_prov"));
                region.setIdRegion(rs.getInt("id_region"));
                
                provi.add(p);
                
            }
            
            
            
        } catch (Exception e) {
            System.out.println("ERROR: "+e.getMessage());
        }finally{
            
            cone.close();
            
        }
        
        return provi;
    }
    
    
    public ArrayList<Provincia> listarProvinciaDatosProyectoPorId(Provincia provincia, Region region) throws SQLException{
        
        ArrayList<Provincia> proviDatosProy = new ArrayList<>();
        Connection cone = conexion.conectar();
        
        try {
            
            String sql = "select nombre_prov, id_region from provincia where id_provincia=(?)";
            PreparedStatement stmt = cone.prepareStatement(sql);
            stmt.setInt(1, provincia.getIdProvincia());
            
            ResultSet rs = stmt.executeQuery();
            
            while(rs.next()){
                
                Provincia p = new Provincia();
                
                p.setNombreProvDatosProyecto(rs.getString("nombre_prov"));
                region.setIdRegion(rs.getInt("id_region"));
                
                proviDatosProy.add(p);
                
            }
            
            
            
        } catch (Exception e) {
            System.out.println("ERROR: "+e.getMessage());
        }finally{
            
            cone.close();
            
        }
        
        return proviDatosProy;
    }
    
    
    public ArrayList<Provincia> listarProvinciaPersNatPorId(Provincia provincia, Region region) throws SQLException{
        
        ArrayList<Provincia> proviPersNat = new ArrayList<>();
        Connection cone = conexion.conectar();
        
        try {
            
            String sql = "select nombre_prov, id_region from provincia where id_provincia=(?)";
            PreparedStatement stmt = cone.prepareStatement(sql);
            stmt.setInt(1, provincia.getIdProvPersNat());
            
            ResultSet rs = stmt.executeQuery();
            
            while(rs.next()){
                
                Provincia p = new Provincia();
                
                p.setNombreProvPersNat(rs.getString("nombre_prov"));
                region.setIdRegPersNat(rs.getInt("id_region"));
                
                proviPersNat.add(p);
                
            }
            
            
            
        } catch (Exception e) {
            System.out.println("ERROR: "+e.getMessage());
        }finally{
            
            cone.close();
            
        }
        
        return proviPersNat;
    }
    
    
    public ArrayList<Provincia> listarProvinciaIdentiRepreLegalPorId(Provincia provincia, Region region) throws SQLException{
        
        ArrayList<Provincia> proviIdentiRepreLegal = new ArrayList<>();
        Connection cone = conexion.conectar();
        
        try {
            
            String sql = "select nombre_prov, id_region from provincia where id_provincia=(?)";
            PreparedStatement stmt = cone.prepareStatement(sql);
            stmt.setInt(1, provincia.getIdProvRepreLegal());
            
            ResultSet rs = stmt.executeQuery();
            
            while(rs.next()){
                
                Provincia p = new Provincia();
                
                p.setNombreProvRepreLegal(rs.getString("nombre_prov"));
                region.setIdRegRepreLegal(rs.getInt("id_region"));
                
                proviIdentiRepreLegal.add(p);
                
            }
            
            
            
        } catch (Exception e) {
            System.out.println("ERROR: "+e.getMessage());
        }finally{
            
            cone.close();
            
        }
        
        return proviIdentiRepreLegal;
    }
    
}
