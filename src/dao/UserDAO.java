/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import bd.Conexion;
import entidades.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Cactus
 */
public class UserDAO {
    
    
    private Conexion conexion = new Conexion();
    String valor1;
    String valor2;
    
    public boolean consultaDatosLogin(User user) throws SQLException {
        
        boolean consultaCorrecta = false;
        Connection conn = conexion.conectar();
        
        try {
            
            
            
            System.out.println("name user que viene para la consulta: "+user.getUser());
            System.out.println("pass user que viene para la consulta: "+user.getPass());
            
            String sql = "select name, pass from users where "
                    + "name=(?) and pass=(?)";
            
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, user.getUser());
            stmt.setString(2, user.getPass());
            
            
            
            ResultSet rs = stmt.executeQuery();
            
            
            while(rs.next()){
                valor1 = rs.getString("name");
                valor2 = rs.getString("pass");
            }
            
            System.out.println("name user que toma de la bd: "+ valor1 );
            System.out.println("pass user que toma de la bd: "+ valor2 );
            
            if(user.getUser().equals(valor1)){
                if(user.getPass().equals(valor2)){
                    consultaCorrecta = true;
                    System.out.println("Logeado correctamente");
                }
            }else{
                System.out.println("Error compruebe los datos e intentelo nuevamente");
            }
            
            
            
         
            
            
        } catch (Exception e) {
            
            System.out.println("Error de logeo: " + e.getMessage());
            
        }
        
        
        return consultaCorrecta;
    }
    
    
    
    
}
