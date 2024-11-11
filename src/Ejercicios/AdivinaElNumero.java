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
        
        Random random = new Random();
        int numeroAleatorio = random.nextInt(100);
        
        System.out.println(numeroAleatorio);
    }
    
}
