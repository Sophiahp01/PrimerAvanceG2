/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package primeravance.g2;

/**
 *
 * @author fapis
 */
public class VentanaPrincipal {
    private Parqueo parqueo;
    private Empleado[] empleadosPreCargados;
    
    public VentanaPrincipal(){
        parqueo = new Parqueo();
        inicializarEmpleados();
    }
    
    private void inicializarEmpleados(){
        empleadosPreCargados = new Empleado[4];
        empleadosPreCargados[0] = new Empleado("E001", "Ana Gómez");
        empleadosPreCargados[1] = new Empleado("E002", "Carlos Pérez");
        empleadosPreCargados[2] = new Empleado("E003", "María Rodríguez");
        empleadosPreCargados[3] = new Empleado("E004", "Luis Soto");
    }
    
    
          
    
}
