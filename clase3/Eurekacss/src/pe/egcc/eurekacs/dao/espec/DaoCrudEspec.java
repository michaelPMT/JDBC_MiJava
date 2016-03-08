package pe.egcc.eurekacs.dao.espec;

import java.util.List;



/**
 *
 * @author Alumno
 */
public interface DaoCrudEspec <T>{
    
    T readForId(String codigo);
    
    List<T> readAll();
    
    List<T> readForCtritearia(T bean);
    
    void insert(T bean);
    
    void update (T bean);
    
    void delete(String codigo);
    
    
}
