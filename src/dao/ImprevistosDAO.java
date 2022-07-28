/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import bd.Conexion;
import entidades.GastosInversion;
import entidades.GastosOperacion;
import entidades.Imprevistos;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Cactus
 */
public class ImprevistosDAO {
    
    private Conexion conexion = new Conexion();

    public boolean consultaDatos(Imprevistos imprevistos) throws SQLException {

        boolean consultaCorrecta = false;
        Connection conn = conexion.conectar();

        try {

            String sql = "insert into imprevistos(imprevistos, monto_soli_conadi, id_persona) values (?,?,?)";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, imprevistos.getItem());
            stmt.setInt(2, imprevistos.getMontoSoliConadi());
            stmt.setInt(3, imprevistos.getIdPersonaF());

            int cantidad = stmt.executeUpdate();

            if (cantidad > 0) {
                
                consultaCorrecta = true;
                
            }

        } catch (Exception e) {
            
            System.out.println("ERROR: " + e.getMessage());
            
        }

        return consultaCorrecta;
    }
    
    
    public ArrayList<Imprevistos> listarImprevistosPorId(int id) throws SQLException{
        
        ArrayList<Imprevistos> imprevistos = new ArrayList<>();
        Connection cone = conexion.conectar();
        
        try {
            
            
            
            String sql = "select imprevistos, monto_soli_conadi from imprevistos "
                    + "where id_persona=(?)";
            PreparedStatement stmt = cone.prepareStatement(sql);
            stmt.setInt(1, id);
            
            ResultSet rs = stmt.executeQuery();
            
            while(rs.next()){
                
                Imprevistos imp = new Imprevistos();
                imp.setItem(rs.getString("imprevistos"));
                imp.setMontoSoliConadi(Integer.parseInt(rs.getString("monto_soli_conadi")));
                

                imprevistos.add(imp);
                
                
            }
            
            
            
        } catch (Exception e) {
            System.out.println("ERROR dao: "+e.getMessage());
        }finally{
            
            cone.close();
            
        }
        
        return imprevistos;
    }
    
}
