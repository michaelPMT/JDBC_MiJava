package pe.egcc.eurekacs.controller;

import pe.egcc.eurekacs.domain.Empleado;
import pe.egcc.eurekacs.service.LogonService;
import pe.egcc.eurekacs.util.Memoria;

/**
 *
 * @author Alumno
 */
public class LogonController {
    
    public void validar(String usario,String clave){
        LogonService service = new LogonService();
        Empleado empleado = service.validar(usario, clave);
        if(empleado == null){
            throw new RuntimeException("Datos Incorrectos");
        }else{
            Memoria.put("usuario", empleado);
        }
    }
}
