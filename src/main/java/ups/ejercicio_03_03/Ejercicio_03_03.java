/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package ups.ejercicio_03_03;

import ups.ejercicio_03_03.View.VentanaDepartamento;
import ups.ejercicio_03_03.View.VentanaEmpresa;

/**
 *
 * @author Diego
 */
public class Ejercicio_03_03 {

    public static void main(String[] args) {
        VentanaEmpresa ventanaEmpresa = new VentanaEmpresa();
        ventanaEmpresa.setVisible(true);
        VentanaDepartamento ventanaDepartamento = new VentanaDepartamento();
        ventanaDepartamento.setVisible(true);
    }
}
