/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.egcc.eurekacs.dao.espec;

import pe.egcc.eurekacs.domain.Empleado;

/**
 *
 * @author Alumno
 */
public interface DaoEmpleadoEspec extends DaoCrudEspec<Empleado> {
    
    Empleado validar (String usuario, String clave);
}
