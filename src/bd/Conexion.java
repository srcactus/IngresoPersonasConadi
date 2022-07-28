/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bd;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Cactus
 */
public class Conexion {
    
    private Connection conexion;
    
    private String host = "localhost";
    private String user = "root";
    private String pass = "";
    private String nombreBD = "db_conadi";
    
    private String url = "jdbc:mysql://"+host+"/"+nombreBD;
    
    public Connection conectar(){
        
        try {
            
            Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
            this.conexion = DriverManager.getConnection(this.url, this.user, this.pass);
            
        } catch (Exception e) {
            System.out.println("Error de conexion"+e.getMessage());
        }
        return this.conexion;
    }
    
}
