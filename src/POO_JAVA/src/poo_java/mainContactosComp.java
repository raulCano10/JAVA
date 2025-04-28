/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poo_java;

import Clases.Agenda;
import Clases.ContactoComp;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author raul
 */
public class mainContactosComp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        ContactoComp primerContacto = new ContactoComp(1, "Raul", "raul@gmail.com", "658445566");
//        ContactoComp segundoContacto = new ContactoComp(2, "Rafa", "rafa@gmail.com", "555444111");
//        
//        System.out.println(primerContacto.aCadena());
//        
//        System.out.println(segundoContacto.aCadena());
        Agenda miAgenda = new Agenda();

        int eleccion = 0;
        
        do {  
            try{
                    
                       System.out.println("""
                              Agenda de contactos
                              ********************
                              1. Añadir contacto
                              2. Lista completa
                              3. Modificar 
                              4. Buscar
                              5. Salir
                              """);
                eleccion = Integer.parseInt(sc.nextLine());
               switch(eleccion){
                   case 1:
                       System.out.println("Dime el nombre");
                       String nombre = sc.nextLine();
                       System.out.println("Dime el email");
                       String email  = sc.nextLine();
                       System.out.println("Dime el telefono");
                       String telefono = sc.nextLine();
                       miAgenda.addContacto(nombre, email, telefono);
                       break;
                   case 2:
                       miAgenda.listarAgenda();
                       break;
                   case 3:
                       System.out.println("Introduce un nombre o ID");
                       String contactoAModificar = sc.nextLine();
                       
                       boolean esEncontrado = miAgenda.modificarContacto(contactoAModificar);
                       if (!esEncontrado) {
                           miAgenda.modificarContacto(Integer.parseInt(contactoAModificar));
                       }
                       break;
                   case 4:
                       System.out.print("Introduce un nombre: ");
                       String nombreABuscar = sc.nextLine();
                       
                       ArrayList<ContactoComp> contactos = miAgenda.buscarContactos(nombreABuscar);
                       
                       for(ContactoComp contacto: contactos){
                           System.out.println(contacto.aCadena());
                       }
                       
                       break;
                   case 5:
                       System.out.println("Finalizando programa...");
                       break;
                   default:
                       System.out.printf("\nERROR: No elijio una de las opciones.\n\nElija una opcion: ");
               }
            }catch(Exception ex){
                System.out.println("ERROR.-" + ex.getMessage());
            }
           
        } while (eleccion != 5);
        
        
        
        
        
    }
    
}
