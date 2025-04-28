/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tpv;

import java.util.Scanner;

/**
 *
 * @author raul
 */
public class mainTPV {

   
    public static void main(String[] args) {
       Ferreteria ferreteria = new Ferreteria("Ferreteria LORCA");
     
       Scanner sc = new Scanner(System.in);
       
       int opcion;
       do {
           String cadena = "=== Ferreteria "+ferreteria.getNombre() + " - TPV ===";
           System.out.println("=== Ferreteria "+ferreteria.getNombre() + " - TPV === ");
           System.out.println("1. Nueva Venta");
           System.out.println("2. Listado de Ventas");
           System.out.println("3. Gestión de Almacén");
           System.out.println("4. Salir");
           System.out.println("=".repeat(cadena.length()));
           System.out.print("Dime tu opcion:");
           
           opcion = Integer.parseInt(sc.nextLine());
           
           switch(opcion){
               case 1:
                   break;
               case 2:
                   break;
               case 3:
                   
                   break;
               case 4:
                   System.out.println("Saliendo del programa...");
                   break;
               default:
                   System.out.println("Debe seleccionar alguna opcion valida entra 1 y 4");
                   break;
               
           }          
       }while(opcion != 4);
        
    }
    
}
