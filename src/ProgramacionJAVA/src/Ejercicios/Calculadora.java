/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicios;

import java.util.Scanner;

/**
 *
 * @author raul
 */
public class Calculadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        /**
         * DECLARACION DE VARIABLES
         */
        double num1;
        double num2;     
        char operacion;
        Scanner sc = new Scanner(System.in);  
        
        try{
            //----------------------------------------------------     
            System.out.println("CALCULADORA BÁSICA");   
            System.out.println("Introduzca el primer número");
            num1 = sc.nextDouble();

            System.out.println("Introduzca el segundo número");
            num2 = sc.nextDouble();

            System.out.println("Introduzca la operacion");
            operacion = sc.next().charAt(0);
        }catch(Exception ex){
            System.out.println("ERROR CUIDADO!!!!!!");
            System.out.println("" + ex.getMessage());
            System.out.println("" + ex.toString());
        }
        
        
        
        
        
    }
    
}
