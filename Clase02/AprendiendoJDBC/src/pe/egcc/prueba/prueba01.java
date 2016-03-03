/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.egcc.prueba;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Alumno
 */
public class prueba01 {
        public static Connection main(String[] args) {
        Connection cn = null;
        try {
            // --------------------------------------------------
            // Paso 1: Cargar el driver a memoria
           // Class.forName("oracle.jdbc.OracleDriver").newInstance();
           Class.forName("oracle.jdbc.OracleDriver").newInstance();
            // Paso 2: Obtener el objeto Connection
            String url = "jdbc:oracle:thin:@localhost:1521:XE";
            cn = DriverManager.getConnection(url, "eureka", "admin");
            // Mensaje
            System.out.println("Conexion ok.");
            // Cerrar conexion
            cn.close();
            System.out.println("Conexion cerrada");
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        } catch(ClassNotFoundException e){
            System.out.println("No se encontro el drive ");
        } catch(Exception e){
            System.out.println("--------------");
        }
        return cn;
    }
    }

