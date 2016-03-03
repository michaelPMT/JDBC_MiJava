/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.egcc.prueba;

import aprendiendojdbc.AccesoDB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Alumno
 */
public class Prueba04 {

    public static void main(String[] args) {
        Connection cn = null;
        try {
            cn = AccesoDB.getConnection();
            String param = "C";
            String sql = "select CHR_CLIECODIGO,"
                    + "VCH_CLIEPATERNO, VCH_CLIEMTERNO, "
                    + "VCH_CLIENOMBRE, CHR_CLIEDNI "
                    + "from cliente"
                    + "where vch_clientepaterno like ? "
                    + param;
            
            Statement stm = cn.createStatement();
            ResultSet rs = pstm.executeQuery();
            System.out.println("Lista De CLientes");

            while (rs.next()) {
                String codigo = rs.getString("CHR_CLIECODIGO");
                String paterno = rs.getString("VCH_CLIEPATERNO");
                String materno = rs.getString("VCH_CLIEMTERNO");
                String nombre = rs.getString("VCH_CLIENOMBRE");
                String dni = rs.getString("CHR_CLIEDNI");

                System.out.println(codigo + "|" + paterno + "|"
                        + materno + "|" + nombre + "|" + dni);
            }
            rs.close();
            pstm.close();

        } catch (Exception e) {

        } finally {
            try {
                cn.close();
            } catch (Exception e) {
            }

        }
    }
}
