/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ups.ejercicio_03_03.Controller;

import java.time.LocalDate;
import java.time.LocalDateTime;

import java.util.List;
import ups.ejercicio_03_03.Model.Departamento;
import ups.ejercicio_03_03.Model.Empresa;
import ups.ejercicio_03_03.Service.EmpresaService;

/**
 *
 * @author Diego
 */
public class EmpresaController {
    private final EmpresaService empresaService = new EmpresaService();
    
    public Empresa crearEmpresa(int codigo,String nombre, String nombreFundador, String pais, String direccion, int anio, int mes, int dia ){
        LocalDate fechaFundacion = LocalDate.of(anio, mes, dia);
        return empresaService.crearEmpresa(new Empresa(codigo, nombre, nombreFundador, pais, direccion, fechaFundacion));
    }
    
    public List<Empresa> listarEmpresas(){
        return empresaService.listarEmpresas();
    }
    
    public Empresa getEmpresaByCode(int code){
        if(code > 0){
            return empresaService.getEmpresaByCode(code);
        }
        return null;
        
    }
    
    // Metodos validacion
    
    // valida que solo se ingresen numeros en el campo "codigo"
    public boolean validarSoloNumeros(char codigo){
        boolean flag = false;
        if(Character.isDigit(codigo)){
            flag = true;
        }
        return flag;
    }
    
    // valida que solo se ingrese texto en el campo "fundador"
    public boolean validarSoloTexto(char texto){
        boolean flag = false;
        if(Character.isLetter(texto) || Character.isSpaceChar(texto) || Character.isUpperCase(texto)){
            flag = true;
        }
        return flag;
                
    }
   
}
