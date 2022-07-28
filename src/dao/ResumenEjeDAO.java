/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import bd.Conexion;
import entidades.DatosPersonaPostulante;
import entidades.DatosProyecto;
import entidades.Direccion;
import entidades.IdentiRepreLegal;
import entidades.Persona;
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
public class ResumenEjeDAO {

    private Conexion conexion = new Conexion();

    public boolean consultaDatos(ResumenEje resumenEje, PersonaJur personaJur, PersonaNat personaNat, DatosProyecto datosProyecto) throws SQLException {

        boolean consultaCorrecta = false;
        Connection conn = conexion.conectar();

        try {

            if (resumenEje.getPersNatF() == 0) {

                String sqlA = "insert into resumen_eje (tipo_postulante, autoridad_tradi_agen_ances, num_cert_indi, "
                        + "pueblo_pertenece, pers_jur, id_datos_proy, id_repr_legal) values (?,?,?,?,?,?,?)";

                PreparedStatement stmtA = conn.prepareStatement(sqlA);
                stmtA.setString(1, resumenEje.getTipoPostulante());
                stmtA.setString(2, resumenEje.getAutoridadTradiAgenAnces());
                stmtA.setInt(3, resumenEje.getNumCertIndi());
                stmtA.setString(4, resumenEje.getPuebloPertenece());
                stmtA.setInt(5, resumenEje.getPersJurF());
                stmtA.setInt(6, resumenEje.getIdDatosProyF());
                stmtA.setInt(7, resumenEje.getIdIdentiRepreLegalF());

                System.out.println("valor getIdDatosProyF desde resumenEejeDAO: " + resumenEje.getIdDatosProyF());

                int cantidadA = stmtA.executeUpdate();

                if (cantidadA > 0) {
                    consultaCorrecta = true;
                }

            } else if (resumenEje.getPersJurF() == 0) {

                String sql = "insert into resumen_eje (tipo_postulante, autoridad_tradi_agen_ances, "
                        + "num_cert_indi, pueblo_pertenece, pers_nat, id_datos_proy, id_repr_legal) values "
                        + "(?,?,?,?,?,?,?)";
                PreparedStatement stmt = conn.prepareStatement(sql);
                stmt.setString(1, resumenEje.getTipoPostulante());
                stmt.setString(2, resumenEje.getAutoridadTradiAgenAnces());
                stmt.setInt(3, resumenEje.getNumCertIndi());
                stmt.setString(4, resumenEje.getPuebloPertenece());
                stmt.setInt(5, resumenEje.getPersNatF());
                stmt.setInt(6, resumenEje.getIdDatosProyF());
                stmt.setInt(7, resumenEje.getIdIdentiRepreLegalF());

                System.out.println("valor getPersNatF desde resumenEejeDAO: " + resumenEje.getPersNatF());

                int cantidad = stmt.executeUpdate();

                if (cantidad > 0) {
                    consultaCorrecta = true;
                }
            }

        } catch (Exception e) {

            System.out.println("Error: " + e.getMessage());
        }

        return consultaCorrecta;
    }

    public ArrayList<ResumenEje> listarResumenEjePorId(int id, ResumenEje resumenEje, PersonaJur personaJur, PersonaNat personaNat) throws SQLException {

        ArrayList<ResumenEje> resumenesEjecutivos = new ArrayList<>();

        Connection cone = conexion.conectar();

        String valor = null;
        int valorId = 0;

        try {

            String sqlA = "select id_datos_proy from datos_proyecto where id_persona=(?)";
            PreparedStatement stmtA = cone.prepareStatement(sqlA);
            stmtA.setInt(1, id);

            ResultSet rsA = stmtA.executeQuery();

            while (rsA.next()) {

                valorId = rsA.getInt("id_datos_proy");

            }

            String sql = "select tipo_postulante, autoridad_tradi_agen_ances, pueblo_pertenece "
                    + "from resumen_eje where id_datos_proy=(?)";
            PreparedStatement stmt = cone.prepareStatement(sql);
            stmt.setInt(1, valorId);

            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {

                ResumenEje re = new ResumenEje();
                re.setTipoPostulante(rs.getString("tipo_postulante"));
                valor = re.getTipoPostulante();
                re.setAutoridadTradiAgenAnces(rs.getString("autoridad_tradi_agen_ances"));
                re.setPuebloPertenece(rs.getString("pueblo_pertenece"));

                resumenesEjecutivos.add(re);
                System.out.println("valor dentro del while: " + valor);
            }

            System.out.println("valor: " + valor);

            

           

        } catch (Exception e) {
            System.out.println("ERROR dao: " + e.getMessage());
        } finally {

            cone.close();

        }

        return resumenesEjecutivos;
    }
    
    
    public boolean consultaDatosPrivados(int id, PersonaJur personaJur, PersonaNat personaNat, IdentiRepreLegal identiRepreLegal) throws SQLException {

        boolean consultaCorrecta = false;
        Connection conn = conexion.conectar();
        
        int valorId = 0;
        
        try {
            
            String sqlA = "select id_datos_proy from datos_proyecto where id_persona=(?)";
            PreparedStatement stmtA = conn.prepareStatement(sqlA);
            stmtA.setInt(1, id);

            ResultSet rsA = stmtA.executeQuery();

            while (rsA.next()) {

                valorId = rsA.getInt("id_datos_proy");

            }
            
             String sql2 = "select pers_jur, id_repr_legal from resumen_eje where id_datos_proy=(?)";
            PreparedStatement stmt1 = conn.prepareStatement(sql2);
            stmt1.setInt(1, valorId);
            
            System.out.println("valor id: " + valorId);

            ResultSet rs1 = stmt1.executeQuery();
            
            int valor = 0;
            int valor2 = 0;

            while (rs1.next()) {

                personaJur.setIdJur(rs1.getInt("pers_jur"));
                identiRepreLegal.setIdRepreLegal(rs1.getInt("id_repr_legal"));
                valor = rs1.getInt("pers_jur");

            }
            System.out.println("valor setIdJur: " + personaJur.getIdJur());

            String sql3 = "select pers_nat from resumen_eje where id_datos_proy=(?)";
            PreparedStatement stmt3 = conn.prepareStatement(sql3);
            stmt3.setInt(1, valorId);

            ResultSet rs3 = stmt3.executeQuery();

            while (rs3.next()) {

                personaNat.setIdNat(rs3.getInt("pers_nat"));
                valor2 = rs3.getInt("pers_nat");
                

            }
            
            if(valor > 0 || valor2 > 0){
                
                consultaCorrecta = true;
                
            }
                
            
   
        }catch (Exception e) {
            
            System.out.println("ERROR: " + e.getMessage());
        }
        
        return consultaCorrecta;
    }
    

}
