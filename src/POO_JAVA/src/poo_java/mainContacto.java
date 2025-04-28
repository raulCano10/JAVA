/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poo_java;

import Clases.Contacto;
import java.util.Scanner;

/**
 *
 * @author raul
 */
public class mainContacto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {       
       Scanner sc = new Scanner(System.in);
       Contacto[] listaContactos = new Contacto[100];
       
       listaContactos[0] = new Contacto("Juan", "juan@gmail.com", "612345678");
       listaContactos[1] = new Contacto("Alicia", "alicia@gmail.com", "555222111");
       listaContactos[2] = new Contacto("Manolo", "manolo@yahoo.com", "854113366");
       
       //Error ArrayIndexOutOfBoundsException: Index 100 out of bounds for length 100
       //contactos[100] = new Contacto("Pepe", "pepe@yahoo.com", "444555666");
       //int opcion;
       boolean continuar = true;
       do{
          System.out.println("=======================");
        System.out.println("        CONTACTOS      ");
        System.out.println("=======================");
        System.out.println("1. Nuevo Contacto");
        System.out.println("2. Listar Contactos");
        System.out.println("3. Modificar contactos");
        System.out.println("4. salir");     
        System.out.print("Elige una opcion:");
        int opcion = Integer.parseInt(sc.nextLine());
        
        switch(opcion){
            case 1:
                añadirContacto(listaContactos);
                break;
            case 2:
                listarContactos(listaContactos);
                break;
            case 3:
                listarContactos(listaContactos);
                modificarContactos(listaContactos);
                break;
            case 4:
                System.out.println("Saliendo...");
                continuar = false;
                break;
            default:
                System.out.println("Opcion no válida");
                break;             
        } 
       }while(continuar);
           
    }
    
    public static void añadirContacto(Contacto[] listaContactos){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nombre: ");
        String nombre = sc.nextLine();
        
        boolean isValidoEmail = false;
        String email = "";
        do{
            System.out.print("Email: ");
            email = sc.nextLine(); 
            if(Utilidades.Utilidades.validarEmail(email)){
                isValidoEmail = true;
            } 
        }while(!isValidoEmail);
       
        
        System.out.print("Telefono: ");
        String telefono = sc.nextLine();        
        
        listaContactos[Contacto.getContadorId()] = new Contacto(nombre, email, telefono);
        
        System.out.println("Contacto añadido correctamente");
    }
    
    public static void listarContactos(Contacto[] contactos){
        
        System.out.println("=".repeat(24) + "LISTA DE CONTACTOS" + "=".repeat(24));
        
        String cabecera = String.format("%-5s %-15s %-30s %-15s", "ID", "NOMBRE", "EMAIL", "TELEFONO");
        System.out.println(cabecera);
        
        System.out.println("-".repeat(68));
        
        for(int i=0; i < Contacto.getContadorId(); i++ ){
            String fila = String.format("%-5s %-15s %-30s %-15s", 
                    contactos[i].getId(),
                    contactos[i].getNombre(), 
                    contactos[i].getEmail(),
                    contactos[i].getTelefono());
            System.out.println(fila);
        }
        
        System.out.println("=".repeat(68));
        
    }
    
    public static void modificarContactos(Contacto[] contactos){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introduce el ID del contacto que quiere modificar: ");
        int ID = Integer.parseInt(sc.nextLine());
        
        System.out.println("Si no deseas modificar algun campo PULSA ENTER sin introducirlo");
        
        System.out.print("Editar Nombre:");
        String nombre = sc.nextLine();
        
        if(!nombre.equals("")){
            contactos[ID].setNombre(nombre); 
        }
        
        
        
        
    }
}
