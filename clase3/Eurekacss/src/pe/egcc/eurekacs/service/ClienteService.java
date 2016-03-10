package pe.egcc.eurekacs.service;

import java.util.List;
import pe.egcc.eurekacs.dao.espec.DaoClienteEspec;
import pe.egcc.eurekacs.dao.impl.DaoClieImpl;

/**
 *
 * @author Alumno
 */
public class ClienteService {
    
    private DaoClienteEspec dao ;

    public ClienteService() {
    dao = new DaoClieImpl();
    }
    
    
    public List<Cliente> getClientes(Cliente bean){
        
    }
    
}
