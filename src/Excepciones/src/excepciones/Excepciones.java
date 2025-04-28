/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Excepciones {

    
    public static void main(String[] args) {
        try{
            Scanner sc = new Scanner(System.in);
            System.out.print("Introduce un numero:");
            try{
                int n1 = sc.nextInt();
               
            }catch(Exception e){
                System.out.println("MINI TRY CACTH GENERICO PARA NEXT INT");
            }
            
            
             int n1 = sc.nextInt();
             
            int[] array = new int[5];
            array[5] = 1;
            
            int a = 4;
            int b = 0;
            System.out.println(a/b);
        }
        catch(ArithmeticException ex){ //operaciones artmeticas
            System.out.println("ERROR AL DIVIDIR ENTRE 0");
            System.out.println(ex.getMessage());           
        }
        catch(InputMismatchException ex){ //Tipos diferentes
            System.out.println("ERROR DEBES SELECCIONAR UN NUMERO VALIDO");
            System.out.println(ex.getMessage()); 
        }
        catch(ArrayIndexOutOfBoundsException ex){
            System.out.println("ERROR en el ARRAY");
            System.out.println(ex.getMessage()); 
        }
        catch(Exception ex){ //Errores genericos
            System.out.println("ERROR EN LA FUNCION MAIN");
            System.out.println(ex.getMessage()); 
                 
        }
        finally{
            System.out.println("SE EJECUTA SIEMPRE");
        }
        
    }
    
}
