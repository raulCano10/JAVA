/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicios;

/**
 *
 * @author raul
 */
public class Matriz3x3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Declarar la matriz 3x3
        //int[][] matriz = new int[3][3];
        int[][] matriz = {
            {1,2,3},
            {4,5,6},
            {7,8,9},
        };
        
        System.out.println("Matriz de 3x3");
            for(int i=0; i < matriz.length ; i++){
                for(int j=0; j < matriz[i].length; j++ ){
                    System.out.print(matriz[i][j] + " ");
                }
                System.out.println();
            }
    }
    
}
