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
import java.sql.Statement;

/**
 *
 * @author Alumno
 */
public class Prueba04 {

    public static void main(String[] args) {
        
    Connection cn = null;
    try {
      cn = AccesoDB.getConnection();
      String param = "' OR '1'='1";
      String sql = "select CHR_CLIECODIGO, "
              + "VCH_CLIEPATERNO, VCH_CLIEMATERNO, "
              + "VCH_CLIENOMBRE, CHR_CLIEDNI "
              + "from cliente "
              + "where vch_cliepaterno = '" 
              + param + "'";

      System.err.println("SQL: " + sql);
      
      Statement stm = cn.createStatement();
      ResultSet rs = stm.executeQuery(sql);
      System.out.println("LISTA DE CLIENTES");
      while(rs.next()){
        String codigo = rs.getString("CHR_CLIECODIGO");
        String paterno = rs.getString("VCH_CLIEPATERNO");
        String materno = rs.getString("VCH_CLIEMATERNO");
        String nombre = rs.getString("VCH_CLIENOMBRE");
        String dni = rs.getString("CHR_CLIEDNI");
        System.out.println(codigo + " | " + paterno + " | " 
                + materno + " | " + nombre + " | " + dni);
      }
      rs.close();
      stm.close();
    } catch (Exception e) {
      e.printStackTrace();
    } finally {
      try {
        cn.close();
      } catch (Exception e) {
      }
    }
  }
}
