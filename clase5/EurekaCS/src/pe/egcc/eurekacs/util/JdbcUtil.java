/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.egcc.eurekacs.util;

import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Alumno
 */
public class JdbcUtil {

    private JdbcUtil() {
    }
    
    public static List<Map<String, ?>> rstoList(ResulSet rs) throws SQLException{
        ResultSetMetaData md = rs.getMetaData();
        int columns = md.getColumnCount();
        List<Map<String, ?>> results = new ArrayList<>();
        while(rs.next()){
            Map<String, Objetc> row = new HashMap<String, Objetc>();
            for(int i = 1; i <= columns; i++){
                row.
            }
        }
    }
    
}
