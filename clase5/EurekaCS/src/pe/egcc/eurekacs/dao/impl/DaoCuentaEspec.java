package pe.egcc.eurekacs.dao.impl;

import java.util.List;
import java.util.Map;

/**
 *
 * @author Alumno
 */
public interface DaoCuentaEspec {
    
    List<Map<String,?>> conMovimientos(String cuenta);
    
}
