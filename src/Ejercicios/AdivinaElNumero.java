/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicios;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author raul
 */
public class AdivinaElNumero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //obtener numero aleatorio entre 1 y 100
        //Pedir por consola adivinar numero
        //Te ira pidiendo que lo adivines continuamente hasta que aciertes
        //Mientras no aciertes te seguira pregunta y introduzcas un numero       
        //En cada intento tenemos que dar una pista de 
        //si el numero introducido es MAYOR o MENOR que el numero que hay que adivinar
        
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int numero = random.nextInt(100) + 1; // Genera un número entre 1 y 100
        int adivinanza = 0;

        System.out.println("Adivina el número entre 1 y 100:");

        
        // Bucle para adivinar el número
        while (adivinanza != numero) {
            System.out.print("Introduce tu adivinanza: ");
            adivinanza = scanner.nextInt();

            if (adivinanza < numero) {
                System.out.println("El número es mayor.");
            } else if (adivinanza > numero) {
                System.out.println("El número es menor.");
            } else {
                System.out.println("¡Felicidades! Adivinaste el número " + numero);
            }
        }

        scanner.close();
    }
    
}
