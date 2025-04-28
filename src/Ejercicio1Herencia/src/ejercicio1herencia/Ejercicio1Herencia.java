/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio1herencia;

import Clases.Contable;
import Clases.Director;
import Clases.Empleado;

/**
 *
 * @author raul
 */
public class Ejercicio1Herencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Empleado empleado = new Empleado("12345678A", "Silvia");
        Contable contable =  new  Contable("58798322Y", "Angeles");
        Director director = new Director("34567890T", "David", 1);
        
        System.out.println("Sueldo de Empleado: "+empleado.calcularSueldo());
        System.out.println("Empleado:" +empleado.toString());
        
        System.out.println("Sueldo de Conatable: " + contable.calcularSueldo());
        contable.contabilizar();
        System.out.println("Contable: "+ contable.toString());
        
        System.out.println("Sueldo de Director:"+director.calcularSueldo());
        director.analizarDatos();    
        System.out.println("Director: " + director.toString());
        
        
    }
    
}
