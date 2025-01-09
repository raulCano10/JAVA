/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ProgramacionJAVA;

import java.util.Scanner;

/**
 *
 * @author Raúl
 */
public class Matriz3x3 {
    public static void main(String[] args) {
        // Declaración e inicialización de la matriz 3x3
        int[][] matriz = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // Imprimir la matriz
        System.out.println("Matriz 3x3:");
        for (int i = 0; i < matriz.length; i++) { // Recorrer filas
            for (int j = 0; j < matriz[i].length; j++) { // Recorrer columnas
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println(); // Nueva línea después de cada fila
        }
        
        // Declaración e inicialización de la matriz 3x3
        String[][] tablero = {
            {"-", "-", "-"},
            {"-", "-", "-"},
            {"-", "-", "-"}
        };

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Inserte posicion i");
        int pos_i = sc.nextInt();
        System.out.println("Inserte posicion i");
        int pos_j = sc.nextInt();
        
        tablero[pos_i][pos_j] = "X";
        
        // Imprimir la matriz
        System.out.println("Matriz 3x3:");
        for (int i = 0; i < tablero.length; i++) { // Recorrer filas
            for (int j = 0; j < tablero[i].length; j++) { // Recorrer columnas
                System.out.print(tablero[i][j] + " ");
            }
            System.out.println(); // Nueva línea después de cada fila
        }
    }
    
    
    
    
}

