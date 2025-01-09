/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicios;

import java.util.Scanner;

/**
 *
 * @author Raúl
 */
public class IntercambioVariables {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       /*
        Ejercicio 7 
        Dadas dos variables numéricas A y B, que el usuario debe teclear, se pide realizar un 
        algoritmo que intercambie los valores de ambas variables y muestre cuanto valen al 
        final las dos variables. 
        */
        Scanner scanner7 = new Scanner(System.in);
        
        // Pedir los dos números
        System.out.println("Introduce el valor de A:");
        int A = scanner7.nextInt();
        
        System.out.println("Introduce el valor de B:");
        int B = scanner7.nextInt();
        
        // Intercambiar valores
        int temp = A;
        A = B;
        B = temp;
        
        // Mostrar los valores después del intercambio
        System.out.println("El nuevo valor de A es: " + A);
        System.out.println("El nuevo valor de B es: " + B);
    }
    
}
