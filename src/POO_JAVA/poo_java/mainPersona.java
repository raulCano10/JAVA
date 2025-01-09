/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poo_java;

import Clases.Persona;
import Utilidades.Utilidades;
import java.util.Scanner;

/**
 *
 * @author raul
 */
public class mainPersona {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
                
        //Persona yo = new Persona("Raúl", "raul@gmail.com");
        
        //yo.mostrarDatos();
        
        Persona[] personas = new Persona[10];
        String email = "";
        for(int i = 0; i < 3; i++){
            System.out.print("Dime tu nombre: ");
            String nombre = sc.nextLine();
            
            boolean esEmailValido = false;
            do{
                          
                System.out.print("Dime tu email: ");
                email = sc.nextLine();

                if(Utilidades.validarEmail(email)){
                    esEmailValido = true;
                }
                /*
                //Compruebo si el email esta bien formateado o no
                //1. Si contiene una @
                //2. Si contiene un "."
                //3. Si el ultimo punto es posterior a la @

                int indexArroba = email.indexOf('@');
                int indexPunto = email.indexOf('.');

                if(indexArroba > 0 && indexPunto > 0
                        && indexPunto > indexArroba + 1){
                    esEmailValido = true;
                }else{
                    System.out.println("--> ERROR. Email incorrecto");
                }
                */
                
            }while(!esEmailValido);
            
            personas[i] = new Persona(nombre,email);
            System.out.println("------------------añadida. " + (i+1) + " en la lista.");
        }
        
        System.out.println("=====================================");
        //Una vez introducidas 3 personas, mostrar sus datos, recorriendo el array con un bucle.
        for(int i = 0; i <= 2 ; i++){
            personas[i].mostrarDatos();
        }
        System.out.println("=====================================");
        
        
        System.out.println("Numero de personas creadas: " + Persona.getTotalPersonas());
        
        
        
    }
    
}
