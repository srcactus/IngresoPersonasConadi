/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import bd.Conexion;
import entidades.Comuna;
import entidades.Direccion;
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
public class PersonaJurDAO {

    private Conexion conexion = new Conexion();

    public boolean consultaDatos(PersonaJur personaJur, ResumenEje resumenEje) throws SQLException {

        boolean consultaCorrecta = false;
        Connection conn = conexion.conectar();

        try {

            String sql = "insert into persona_jur(nombre_pers_jur, rut, razon_social, "
                    + "fecha_const_pj, numero_pj)"
                    + "values(?,?,?,?,?)";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, personaJur.getNombrePersJur());
            stmt.setString(2, personaJur.getRut());
            stmt.setString(3, personaJur.getRazonSocial());
            stmt.setString(4, personaJur.getFechaConstPj());
            stmt.setString(5, personaJur.getNumeroPj());

            int cantidad = stmt.executeUpdate();

            if (cantidad > 0) {

                String sql2 = "select id_jur from persona_jur where rut=(?)";
                PreparedStatement stmt2 = conn.prepareStatement(sql2);
                stmt2.setString(1, personaJur.getRut());

                ResultSet rs = stmt2.executeQuery();

                int valor = 0;

                while (rs.next()) {
                    valor = rs.getInt("id_jur");
                }

                //setear llaves foraneas a las tablas correspondientes:
                resumenEje.setPersJurF(valor);

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

    public ArrayList<PersonaJur> listarPersonaJuridicaProyPorId(PersonaJur personaJur) throws SQLException {

        ArrayList<PersonaJur> persJur = new ArrayList<>();
        Connection cone = conexion.conectar();

        try {
            
            System.out.println("valor getIdJur: "+ personaJur.getIdJur());

            String sql3 = "select nombre_pers_jur, rut, razon_social, fecha_const_pj, numero_pj from persona_jur where id_jur=(?)";
            PreparedStatement stmt3 = cone.prepareStatement(sql3);
            stmt3.setInt(1, personaJur.getIdJur());
            
            ResultSet rs3 = stmt3.executeQuery();
            
            while(rs3.next()){
                
                PersonaJur pj = new PersonaJur();
                
                pj.setNombrePersJur(rs3.getString("nombre_pers_jur"));
                pj.setRut(rs3.getString("rut"));
                pj.setRazonSocial(rs3.getString("razon_social"));
                pj.setFechaConstPj(rs3.getString("fecha_const_pj"));
                pj.setNumeroPj(Integer.toString(rs3.getInt("numero_pj")));
                
                persJur.add(pj);
                
            }
            

        } catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage());
        } finally {

            cone.close();

        }

        return persJur;
    }

}
