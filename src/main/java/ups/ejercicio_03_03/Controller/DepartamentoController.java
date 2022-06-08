/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ups.ejercicio_03_03.Controller;

import java.util.List;
import ups.ejercicio_03_03.Model.Departamento;
import ups.ejercicio_03_03.Model.Empleado;
import ups.ejercicio_03_03.Model.Empresa;
import ups.ejercicio_03_03.Service.DepartamentoService;

/**
 *
 * @author Diego
 */
public class DepartamentoController {
    private final DepartamentoService departamentoService = new DepartamentoService();
    
    public Departamento crearDepartamento(int codigo, String nombre, Empresa empresa, String ubicacion){
        return departamentoService.crearDepartamento(new Departamento(codigo, nombre, empresa, ubicacion));
    }
    
    public List<Departamento> listarDepartamentos(){
        return departamentoService.listarDepartementos();
    }
    
    public Departamento getDepartamentoByCode(int code){
        return departamentoService.getDepartamentoByCode(code);
    }
    
    public void asignarGerenteDepartemento(int codigo, Empleado empleado){
        departamentoService.asignarGerente(codigo, empleado);
        
    }
}
