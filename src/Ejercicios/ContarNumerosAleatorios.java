/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicios;

import java.util.Random;

/**
 *
 * @author Ra�l
 */
public class ContarNumerosAleatorios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Generar un numero aleatorio del 1 al 5
        // 10 veces y que cuente las veces que se repite cada numero
        // y las pinte por pantalla
        Random random = new Random();
        int[] contador = new int[5]; // Array para contar las repeticiones de los n�meros 1-5

        // Generar 10 n�meros aleatorios y contar las repeticiones
        for (int i = 0; i < 10; i++) {
            int numero = random.nextInt(5) + 1; // Genera un n�mero entre 1 y 5
            System.out.println("N�mero generado: " + numero);
            contador[numero - 1]++; // Incrementar el contador correspondiente
        }

        // Mostrar cu�ntas veces se repite cada n�mero
        System.out.println("\nRepeticiones de cada n�mero:");
        for (int i = 0; i < 5; i++) {
            System.out.println("N�mero " + (i + 1) + ": " + contador[i] + " veces");
        }
        
        //2� forma
        random = new Random();
        int[] numeros = new int[10]; // Array para guardar los n�meros generados
        contador = new int[5]; // Array para contar las repeticiones de los n�meros 1-5

        // Generar 10 n�meros aleatorios y guardarlos en el array
        for (int i = 0; i < 10; i++) {
            numeros[i] = random.nextInt(5) + 1; // Genera un n�mero entre 1 y 5
        }

        // Contar las repeticiones de cada n�mero en el array
        for (int numero : numeros) {
            contador[numero - 1]++; // Incrementar el contador correspondiente
        }

        // Mostrar los n�meros generados
        System.out.println("N�meros generados:");
        for (int numero : numeros) {
            System.out.print(numero + " ");
        }

        // Mostrar cu�ntas veces se repite cada n�mero
        System.out.println("\n\nRepeticiones de cada n�mero:");
        for (int i = 0; i < 5; i++) {
            System.out.println("N�mero " + (i + 1) + ": " + contador[i] + " veces");
        }
        
        
        //3� forma
        random = new Random();
        numeros = new int[10]; // Array para guardar los n�meros generados

        // Variables para contar las repeticiones de cada n�mero
        int contador1 = 0;
        int contador2 = 0;
        int contador3 = 0;
        int contador4 = 0;
        int contador5 = 0;

        // Generar 10 n�meros aleatorios y guardarlos en el array
        for (int i = 0; i < 10; i++) {
            numeros[i] = random.nextInt(5) + 1; // Genera un n�mero entre 1 y 5
        }

        // Contar las repeticiones de cada n�mero en el array
        for (int numero : numeros) {
            switch (numero) {
                case 1 -> contador1++;
                case 2 -> contador2++;
                case 3 -> contador3++;
                case 4 -> contador4++;
                case 5 -> contador5++;
            }
        }
        //Esto es lo mismo que esto
        // Contar las repeticiones de cada n�mero en el array
        //for (int numero : numeros) {
        //    contador[numero - 1]++; // Incrementar el contador correspondiente
        //}
        
        // Mostrar los n�meros generados
        System.out.println("N�meros generados:");
        for (int numero : numeros) {
            System.out.print(numero + " ");
        }

        // Mostrar cu�ntas veces se repite cada n�mero
        System.out.println("\n\nRepeticiones de cada n�mero:");
        System.out.println("N�mero 1: " + contador1 + " veces");
        System.out.println("N�mero 2: " + contador2 + " veces");
        System.out.println("N�mero 3: " + contador3 + " veces");
        System.out.println("N�mero 4: " + contador4 + " veces");
        System.out.println("N�mero 5: " + contador5 + " veces");
    
    }
    
}
