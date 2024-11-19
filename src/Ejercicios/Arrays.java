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
public class Arrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Se realizan 3 recorridos sobre el array, 
        // El primero para asignar a cada elemento las notas introducidas por teclado, 
        // El segundo para sumarlas 
        // El tercero para mostrar los alumnos con notas superiores a la media.
        
        double[] notas3 = {2.3, 8.5, 3.2, 9.5, 4, 5.5, 7.0}; //array de 7 elementos
        
        Scanner sc = new Scanner(System.in);
        int numAlum, i;
        double suma = 0, media;
  
        do {
            System.out.print("Número de alumnos de la clase: ");
            numAlum = sc.nextInt();
        } while (numAlum <= 0);
  
        double[] notas = new double[numAlum]; //se crea el array
  
        // Entrada de datos. Se asigna a cada elemento del array
        // la nota introducida por teclado
        for (i = 0; i < notas.length; i++) {
            System.out.print("Alumno " + (i + 1) + " Nota final: ");                                              
            notas[i] = sc.nextDouble();
        }
  
        // Sumar todas las notas
        for (i = 0; i < notas.length; i++) {
            suma = suma + notas[i];
        }
  
        // Calcular la media
        media = suma / notas.length;
  
        // Mostrar la media
        System.out.printf("Nota media del curso: %.2f %n", media);
  
        // Mostrar los valores superiores a la media
        System.out.println("Listado de notas superiores a la media: ");
        for (i = 0; i < notas.length; i++) {
            if (notas[i] > media) {
                System.out.println("Alumno numero " + (i + 1)+ " Nota final: " + notas[i]);                       
            }
        }
        
        
    
    
    }
    
}
