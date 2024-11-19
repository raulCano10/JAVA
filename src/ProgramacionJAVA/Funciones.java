/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ProgramacionJAVA;

import java.util.Scanner;

/**
 *
 * @author raul
 */
public class Funciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          //EJEMPLO METODO SUMAR   
        Scanner sc = new Scanner(System.in);
        int numero1, numero2, resultado;
        System.out.print("Introduce primer número: ");                                             
        numero1 = sc.nextInt();
        System.out.print("Introduce segundo número: ");
        numero2 = sc.nextInt();       
        resultado = numero1 + numero2;           
        System.out.println("Suma: " + resultado);
        
        //METODO QUE SI DEVUELVE VALORES
        resultado = sumar(numero1, numero2);
        System.out.println("Suma: " + resultado);
    
        //METODO QUE NO DEVUELVA VALORES
        resultado = sumar(numero1, numero2);
        Consola("Suma: " + resultado);
    }
    //Metodo que se llame sumar que reciba como parámetros a y b, sume los numeros y duvuelva (return) el resultado.
     public static int sumar(int a, int b){
           int c;
           c = a + b;
           return c;
    }
     
	 //metodo Consola que escribe por consola el texto que le pasamos por parámetro.
     public static void Consola(String cadena){
         System.out.println(cadena);
     }
    
    
}
