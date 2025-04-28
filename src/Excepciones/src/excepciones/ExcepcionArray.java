/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author raul
 */
public class ExcepcionArray {
  
    public static void main(String[] args) {
        try{
            muestraArray2();
        }catch(InputMismatchException ex){
            System.out.println("EXCEPCION TIPO VARIABLE");
        }catch(ArrayIndexOutOfBoundsException ex){
            System.out.println("ExcepcionArray.main()- ERROR TRATADO EN MAIN " + ex.getMessage());
        }catch(Exception ex){
            System.out.println("ERROR GENERICO TRATADO EN MAIN " + ex.getMessage());
        }
    }
    
    public static void muestraArray(){
        Scanner sc = new Scanner(System.in);
        int[] array = {4, 2 ,6};
        int n;
        
        try{
            System.out.print("Introduce la posicion a mostrar:");
            n = sc.nextInt();
            System.out.println("Valor de la posicion: " + array[n]);
        }catch(ArrayIndexOutOfBoundsException ex){
            System.out.println("ExcepcionArray.muestraArray()- VOY A LANZAR LA EXCEPCION AL MAIN " + ex.getMessage());
            throw ex;
        }
    }
    
     public static void muestraArray2(){
        Scanner sc = new Scanner(System.in);
        int[] array = {4, 2 ,6};
        int n;
        
        try{
            System.out.print("Introduce la posicion a mostrar:");
            n = sc.nextInt();
            System.out.println("Valor de la posicion: " + array[n]);
        }catch(ArrayIndexOutOfBoundsException ex){
            throw ex;
            //throw new ArrayIndexOutOfBoundsException("Posición de array fuera de rango");
        }
    }
    
}
