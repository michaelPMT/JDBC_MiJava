/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.egcc.eurekacs.dao.impl;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;
import pe.egcc.eurekacs.db.AccesoDB;

public class DaoCuentaImplImpl implements DaoCuentaEspec {

    @Override
    public List<Map<String, ?>> conMovimientos(String cuenta) {
        
        Connection cn = null;
        try {
            cn = AccesoDB.getConnection();
            String sql = "select CUENCODIGO, MONENOMBRE, CUANSALDO,"
                    + "CUENESTADO, MOVINUMERO, MOVIFECHA, "
                    + "from v_movimiento "
                    + "where CUENCODIGO = ?";
            

        } catch (SQLException e) {
            throw new RuntimeException(e.getMessage());
        } catch (Exception e) {
            String mensaje = "Se ha producido un error, intentelo mas tarde.";
            if (e.getMessage() != null && !e.getMessage().isEmpty()) {
                mensaje += (" " + e.getMessage());
            }
            throw new RuntimeException(mensaje);
        } finally {
            try {
                cn.close();
            } catch (Exception e) {
            }
        }

    


