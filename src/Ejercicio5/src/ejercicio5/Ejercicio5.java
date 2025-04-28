/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio5;

import java.util.ArrayList;

/**
 *
 * @author raul
 */
public class Ejercicio5 {
    
    public static void main(String[] args) {
        // TODO code application logic here
        Camion camion1 = new Camion("3333GGG", "volvo 500");
        Camion camion2 = new Camion("5555BBB", "SCANIA 550", 100000);
        Turismo turismo1 = new Turismo("2222AAA", "seat ibiza", 10000);
        Turismo turismo2 = new Turismo("111aaaa", "peugeot 307");
        ArrayList<Vehiculo> vehiculos = new ArrayList();
        vehiculos.add(turismo1);
        vehiculos.add(turismo2);
        vehiculos.add(camion1);
        vehiculos.add(camion2);
        System.out.println("TURISMOS");
        System.out.println("-------------");
        for (Vehiculo v : vehiculos) {
            if (v instanceof Turismo){
                
            System.out.println(v.toString());
            }
        }
        System.out.println(" ");
        System.out.println("CAMIONES");
        System.out.println("-------------");
        
        for (Vehiculo v : vehiculos) {
            if (v instanceof Camion){
                
            System.out.println(v.toString());
            }
        }
        camion1.avanzar(30000);
        camion2.avanzar(60000);
        turismo1.avanzar(20000);
        turismo2.avanzar(30000);
          System.out.println("TURISMOS");
        System.out.println("-------------");
        for (Vehiculo v : vehiculos) {
            if (v instanceof Turismo){
                
            System.out.println(v.toString());
            }
        }
        System.out.println(" ");
        System.out.println("CAMIONES");
        System.out.println("-------------");
        
        for (Vehiculo v : vehiculos) {
            if (v instanceof Camion){
                
            System.out.println(v.toString());
            }
        }
        
    }
    
}
