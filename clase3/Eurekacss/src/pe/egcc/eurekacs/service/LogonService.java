package pe.egcc.eurekacs.service;

import pe.egcc.eurekacs.domain.Empleado;

/**
 *
 * @author Alumno
 */
public class LogonService {
    
    public Empleado validar(String usuario, String clave){
        Empleado bean;
        if (usuario.equals("gustavo")) {
            bean = new Empleado();
        }
        return new Empleado();
    }
    
}
