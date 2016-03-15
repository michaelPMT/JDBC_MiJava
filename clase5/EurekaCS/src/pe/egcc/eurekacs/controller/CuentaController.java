/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.egcc.eurekacs.controller;

import java.util.List;
import java.util.Map;
import pe.egcc.eurekacs.service.CuentaService;

/**
 *
 * @author Alumno
 */
public class CuentaController {

    private CuentaService cuentaService;
    
    public CuentaController(){
        cuentaService = new CuentaService();
    }
    
    public List<Map<String, ?>> traerMovimientos(String cuenta){
        return cuentaService.traerMovimientos(cuenta);
    }
    
}
