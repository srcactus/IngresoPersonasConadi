/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import bd.Conexion;
import entidades.Comuna;
import entidades.DatosProyecto;
import entidades.Direccion;
import entidades.IdentiRepreLegal;
import entidades.Persona;
import entidades.PersonaNat;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Cactus
 */
public class DireccionDAO {

    private Conexion conexion = new Conexion();

    public boolean consultaDatos(Direccion direccion, Persona persona, DatosProyecto datosProyecto, IdentiRepreLegal identiRepreLegal) throws SQLException {

        boolean consultaCorrecta = false;
        Connection conn = conexion.conectar();

        try {
            
            System.out.println("valor getDireccionDatosProyecto: "+ direccion.getDireccionDatosProyecto());
            System.out.println("valor getIdComunaDatosProyectoF: "+ direccion.getIdComunaDatosProyectoF());
            String sqlDP = "insert into direccion (direccion, id_comuna) values(?,?)";
            PreparedStatement stmtDP = conn.prepareStatement(sqlDP);
            stmtDP.setString(1, direccion.getDireccionDatosProyecto());
            stmtDP.setInt(2, direccion.getIdComunaDatosProyectoF());
            
            int cantidadDP = stmtDP.executeUpdate();
            
            if(cantidadDP > 0 ){
                
                System.out.println("direccion datos proyecto insertada");
                
                String sqlDP2 = "select id_direccion from direccion where direccion=(?)";
                PreparedStatement stmtDP2 = conn.prepareStatement(sqlDP2);
                stmtDP2.setString(1, direccion.getDireccionDatosProyecto());
                
                ResultSet rsDP2 = stmtDP2.executeQuery();
                
                int valorDP2 = 0;
                
                while(rsDP2.next()){
                    
                    valorDP2 = rsDP2.getInt("id_direccion");
                    
                }
                
                datosProyecto.setIdDireccionF(valorDP2);
                
            }
            
            String sqlP = "insert into direccion (direccion, id_comuna) values(?,?)";
            PreparedStatement stmtP = conn.prepareStatement(sqlP);
            stmtP.setString(1, direccion.getDireccion());
            stmtP.setInt(2, direccion.getIdComunaF());
            
            int cantidadP = stmtP.executeUpdate();
            
            if(cantidadP > 0 ){
                
                System.out.println("direccion persona insertada");
                
                String sqlPER = "select id_direccion from direccion where direccion=(?)";
                PreparedStatement stmtPER = conn.prepareStatement(sqlPER);
                stmtPER.setString(1, direccion.getDireccion());
                
                ResultSet rsPER = stmtPER.executeQuery();
                
                int valorPER = 0;
                
                while(rsPER.next()){
                    
                    valorPER = rsPER.getInt("id_direccion");
                    
                }
                
                persona.setIdDireccionF(valorPER);
                
            }
            
            
            System.out.println("hasta aqui 1");
            String sqlRL = "insert into direccion (direccion, id_comuna) values(?,?)";
            PreparedStatement stmtRL = conn.prepareStatement(sqlRL);
            stmtRL.setString(1, direccion.getDireccionRepreLegal());
            stmtRL.setInt(2, direccion.getIdDireccionRepreLegal());
            
            int cantidadRL = stmtRL.executeUpdate();
            System.out.println("hasta aqui 2");
            if(cantidadRL > 0){
                
                System.out.println("direccion representante legal insertada");
                
                String sqlRL2 = "select id_direccion from direccion where direccion=(?)";
                PreparedStatement stmtRL2 = conn.prepareStatement(sqlRL2);
                stmtRL2.setString(1, direccion.getDireccionRepreLegal());
                
                ResultSet rsRL2 = stmtRL2.executeQuery();
                
                int valorRL2 = 0;
                
                while(rsRL2.next()){
                    
                    valorRL2 = rsRL2.getInt("id_direccion");
                    
                }
                
                identiRepreLegal.setIdDireccionF(valorRL2);
                
                if(valorRL2 != 0 ){
                    consultaCorrecta = true;
                }
                
            }


        } catch (Exception e) {

            System.out.println("Error: " + e.getMessage());
        }
        
        return consultaCorrecta ;

    }

    

    public boolean consultaDatosPersNat(Direccion direccion, PersonaNat personaNat) throws SQLException {

        boolean consultaCorrecta = false;
        Connection conn = conexion.conectar();

        try {

            String sqlPN = "insert into direccion (direccion, id_comuna) values (?,?)";
            PreparedStatement stmtPN = conn.prepareStatement(sqlPN);
            stmtPN.setString(1, direccion.getDireccionPersonaNat());
            stmtPN.setInt(2, direccion.getIdComunaPersonaNat());

            int cantidadPN = stmtPN.executeUpdate();

            if (cantidadPN > 0) {

                

                String sqlPN2 = "select id_direccion from direccion where direccion=(?)";
                PreparedStatement stmtPN2 = conn.prepareStatement(sqlPN2);
                stmtPN2.setString(1, direccion.getDireccionPersonaNat());

                ResultSet rsPN2 = stmtPN2.executeQuery();

                int valorPN2 = 0;

                while (rsPN2.next()) {
                    valorPN2 = rsPN2.getInt("id_direccion");
                }

                personaNat.setIdDireccionF(valorPN2);
                System.out.println("valor getIdDireccionF: "+personaNat.getIdDireccionF());
                
                consultaCorrecta = true;

            }

        } catch (Exception e) {

            System.out.println("Error: " + e.getMessage());
        }
        System.out.println("direccion 3 insertada con exito");
        return consultaCorrecta;
    }
    
    
    public ArrayList<Direccion> listarDireccionPorId(Direccion direccion, Comuna comuna) throws SQLException{
        
        ArrayList<Direccion> direcc = new ArrayList<>();
        Connection cone = conexion.conectar();
        
        try {
            
            String sql = "select direccion, id_comuna from direccion where id_direccion=(?)";
            PreparedStatement stmt = cone.prepareStatement(sql);
            stmt.setInt(1, direccion.getIdDireccion());
            
            ResultSet rs = stmt.executeQuery();
            
            while(rs.next()){
                
                Direccion d = new Direccion();
                
                
                d.setDireccion(rs.getString("direccion"));
                comuna.setIdComuna(rs.getInt("id_comuna"));
                
                
                direcc.add(d);
                
            }
            
            
            
        } catch (Exception e) {
            System.out.println("ERROR: "+e.getMessage());
        }finally{
            
            cone.close();
            
        }
        
        return direcc;
    }
    
    
    public ArrayList<Direccion> listarDireccionDatosProyPorId(Direccion direccion, Comuna comuna) throws SQLException{
        
        ArrayList<Direccion> direccDatosProy = new ArrayList<>();
        Connection cone = conexion.conectar();
        
        try {
            
            String sql = "select direccion, id_comuna from direccion where id_direccion=(?)";
            PreparedStatement stmt = cone.prepareStatement(sql);
            stmt.setInt(1, direccion.getIdDatosProyecto());
            
            ResultSet rs = stmt.executeQuery();
            
            while(rs.next()){
                
                Direccion d = new Direccion();
                
                
                d.setDireccionDatosProyecto(rs.getString("direccion"));
                comuna.setIdComuna(rs.getInt("id_comuna"));
                
                
                direccDatosProy.add(d);
                
            }
            
            
            
        } catch (Exception e) {
            System.out.println("ERROR: "+e.getMessage());
        }finally{
            
            cone.close();
            
        }
        
        return direccDatosProy;
    }
    
    
    public ArrayList<Direccion> listarDireccionPersNatPorId(Direccion direccion, Comuna comuna) throws SQLException{
        
        ArrayList<Direccion> direccPersNat = new ArrayList<>();
        Connection cone = conexion.conectar();
        
        try {
            
            String sql = "select direccion, id_comuna from direccion where id_direccion=(?)";
            PreparedStatement stmt = cone.prepareStatement(sql);
            stmt.setInt(1, direccion.getIdDireccionPersNat());
            
            ResultSet rs = stmt.executeQuery();
            
            while(rs.next()){
                
                Direccion d = new Direccion();
                
                
                d.setDireccionPersonaNat(rs.getString("direccion"));
                comuna.setIdComPersNat(rs.getInt("id_comuna"));
                
                
                direccPersNat.add(d);
                
            }
            
            
            
        } catch (Exception e) {
            System.out.println("ERROR: "+e.getMessage());
        }finally{
            
            cone.close();
            
        }
        
        return direccPersNat;
    }
    
    
    public ArrayList<Direccion> listarDireccionIdentiRepreLegalPorId(Direccion direccion, Comuna comuna) throws SQLException{
        
        ArrayList<Direccion> direccIdentiRepreLegal = new ArrayList<>();
        Connection cone = conexion.conectar();
        
        try {
            
            String sql = "select direccion, id_comuna from direccion where id_direccion=(?)";
            PreparedStatement stmt = cone.prepareStatement(sql);
            stmt.setInt(1, direccion.getIdDireccionRepreLegal());
            
            ResultSet rs = stmt.executeQuery();
            
            while(rs.next()){
                
                Direccion d = new Direccion();
                
                
                d.setDireccionRepreLegal(rs.getString("direccion"));
                comuna.setIdComRepreLegal(rs.getInt("id_comuna"));
                
                
                direccIdentiRepreLegal.add(d);
                
            }
            
            
            
        } catch (Exception e) {
            System.out.println("ERROR: "+e.getMessage());
        }finally{
            
            cone.close();
            
        }
        
        return direccIdentiRepreLegal;
    }

}

