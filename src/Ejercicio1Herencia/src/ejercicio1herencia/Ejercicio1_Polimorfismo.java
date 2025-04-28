/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio1herencia;

import Clases.Contable;
import Clases.Director;
import Clases.Empleado;
import java.util.ArrayList;

/**
 *
 * @author raul
 */
public class Ejercicio1_Polimorfismo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        ArrayList<Empleado> listaTrabajadores =  new ArrayList<>();
        Empleado empleado = new Empleado("12345678A", "Silvia");
        Contable contable =  new  Contable("58798322Y", "Angeles");
        Director director = new Director("34567890T", "David", 1);
        Director director2 = new Director("34567890T", "Ferran Torres", 1);
        Director director3 = new Director("34567890T", "Juanico", 1);
        
        listaTrabajadores.add(empleado);
        listaTrabajadores.add(contable);
        listaTrabajadores.add(director);
        listaTrabajadores.add(director2);
        listaTrabajadores.add(director3);
        
        
        
        for(int i = 0; i <listaTrabajadores.size(); i++) {
            Empleado e = listaTrabajadores.get(i);
            
            e.setHoraExtras(5);
            
            System.out.println("Sueldo: " + e.calcularSueldo());
            
            if (e instanceof Director){
                Director d = (Director) e;
                d.analizarDatos(); 
            }else if(e instanceof Contable){
                Contable c = (Contable) e;
                c.contabilizar();
            }
            
        }
      
    }
    
}
