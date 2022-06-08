/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ups.ejercicio_03_03.Controller;

import java.time.LocalDate;
import java.util.List;
import ups.ejercicio_03_03.Model.Departamento;
import ups.ejercicio_03_03.Model.Empleado;
import ups.ejercicio_03_03.Service.EmpleadoService;

/**
 *
 * @author Diego
 */
public class EmpleadoController {
    private final EmpleadoService empleadoService = new EmpleadoService();
    
    public Empleado crearEmpleado(String cedula, String nombre, int anioNacimiento, int mesNacimiento, int diaNacimiento, 
            String nacionalidad, String direccion, String cargo, float salario, Departamento departamento){
        
        var fechaNacimiento = LocalDate.of(anioNacimiento, mesNacimiento, diaNacimiento);
        // fecha de entrada = fecha del sistema
        var fechaEntrada = LocalDate.now();
        
        var nuevoEmpleado =  new Empleado(cedula,nombre,fechaNacimiento,nacionalidad,direccion,cargo,salario,fechaEntrada,departamento);
        return empleadoService.crearEmpleado(nuevoEmpleado);
                
    }
    
    
    public List<Empleado> listarEmpleados(){
        return empleadoService.listarEmpleados();
    }
    
    public Empleado getEmpladoByCedula(String cedula){
        return empleadoService.getEmpleadoByCedula(cedula);
    }
    
     public void cambiarDepartamento(String cedula, Departamento departamento){
        empleadoService.cambiarDepartamento(cedula, departamento);
    }
}
