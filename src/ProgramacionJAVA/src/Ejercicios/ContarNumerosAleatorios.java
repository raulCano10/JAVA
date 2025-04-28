/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicios;

import java.util.Random;

/**
 *
 * @author raul
 */
public class ContarNumerosAleatorios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random random = new Random();
        int[] numeros = new int[5];
        int contador1 = 0;
        int contador2 = 0;
        int contador3 = 0;
        int contador4 = 0;
        int contador5 = 0;
        
        for(int i = 0; i<10; i++){
            numeros[i] = random.nextInt(5) + 1;
        }
        
        for(int numero : numeros){
            switch(numero){
                    case 1 -> contador1++;
                    case 2 -> contador2++;
                    case 3 -> contador3++;
                    case 4 -> contador4++;
                    case 5 -> contador5++;
            }
        }
        
        //Mostrar los numeros generados
        for(int numero : numeros){
            System.out.print(numero + " ");
        }
        
        //Mostrar los numeros generados
        for(int numero : numeros){
            System.out.println(numero + " ");
        }
        
        System.out.println("Contador 1 es igual a " + contador1);
        System.out.println("Contador 2 es igual a " + contador2);
        System.out.println("Contador 3 es igual a " + contador3);
        System.out.println("Contador 4 es igual a " + contador4);
        System.out.println("Contador 5 es igual a " + contador5);
        
    }
    
}
