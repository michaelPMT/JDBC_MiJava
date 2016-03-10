/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.egcc.eurekacs.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import pe.egcc.eurekacs.dao.espec.DaoEmpleadoEspec;
import pe.egcc.eurekacs.db.AccesoDB;
import pe.egcc.eurekacs.domain.Cliente;
import pe.egcc.eurekacs.domain.Empleado;

/**
 *
 * @author Alumno
 */
public class DaoEmpleadoImpl implements DaoEmpleadoEspec{

    @Override
    public Empleado validar(String usuario, String clave) {
        Connection cn = null;
        try {
            cn = AccesoDB.getConnection();
            String sql = "select chr_emplcodigo, vch_emplpaterno, "
                    + "vch_emplmaterno, vch_emplnombre, vch_emplciudad, "
                    + "vch_empldireccion, vch_emplusuario "
                    + "from empleado "
                    + "where vch_emplusuario = ? "
                    + "and vch_emplclave = ?";
            PreparedStatement pstm = cn.prepareStatement(sql);
            pstm.setString(1, usuario);
            
        } catch (SQLException e) {
            throw new RuntimeException(e.getMessage());
        }catch(Exception e){
            String mensaje = "Se ha producido un error, intenlo.";
            if (e.getMessage() != null && !e.getMessage().isEmpty()) {
                mensaje += (" " + e.getMessage());
            }
            throw new RuntimeException(mensaje);
        }finally{
            try {
                cn.close();
            } catch (Exception e) {
            }
        }
    }

    @Override
    public Empleado readForId(String codigo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Empleado> readAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Empleado> readForCtritearia(Empleado bean) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void insert(Empleado bean) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(Empleado bean) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(String codigo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    private Cliente getBean(ResultSet) throws SQLException{
        Cliente bean = new Cliente();
        bean.setCodigo(rs.getString("chr_cliecodigo"));
        bean.setCodigo(rs.getString("vch_cliepaterno"));
        return bean;
    }
    
}
