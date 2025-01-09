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
public class calificacionesPorcentajes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       /*
        Ejercicio 6 
        Un alumno desea saber cual será su calificación final en la materia de Algoritmos. Dicha 
        calificación se compone de los siguientes porcentajes: 
        ? 55% del promedio de sus tres calificaciones parciales. 
        ? 30% de la calificación del examen final. 
        ? 15% de la calificación de un trabajo final. 
        */
        Scanner scanner6 = new Scanner(System.in);
        
        // Pedir calificaciones parciales, examen final y trabajo final
        System.out.println("Introduce las tres calificaciones parciales:");
        double parcial1 = scanner6.nextDouble();
        double parcial2 = scanner6.nextDouble();
        double parcial3 = scanner6.nextDouble();
        
        System.out.println("Introduce la calificación del examen final:");
        double examenFinal = scanner6.nextDouble();
        
        System.out.println("Introduce la calificación del trabajo final:");
        double trabajoFinal = scanner6.nextDouble();
        
        // Calcular la media de los parciales
        double promedioParciales = (parcial1 + parcial2 + parcial3) / 3;
        
        // Calcular la calificación final
        double calificacionFinal = (promedioParciales * 0.55) + (examenFinal * 0.30) + (trabajoFinal * 0.15);
        
        // Mostrar la calificación final
        System.out.println("La calificación final es: " + calificacionFinal);
        
        // Mostrar la calificación final redondeada a 3 decimales
        System.out.printf("La calificación final es: %.2f", calificacionFinal);
    }
    
}
