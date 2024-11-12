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
public class EjemploMenuSimple {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Mostrar un Menú de seleccion de:
        //1.Fruta, 2.Refrescos, 3.Ropa, 4. Salir
        //Pedir un numero por teclado (ENTERO)
        // Si seleccionas 1 mostrar mensaje "Ha seleccionado Fruta". Y vuelve a mostrar el Menu de nuevo
        // Si seleccionas 2 mostrar mensaje "Ha seleccionado Refrescos". Y vuelve a mostrar el Menu de nuevo
        // Si seleccionas 3 mostrar mensaje "Ha seleccionado Ropa". Y vuelve a mostrar el Menu de nuevo
        // Si seleccionas 4 mostrar mensaje "Ha seleccionado Salir" Y finalizamos el programa
        
        
        Scanner scanner = new Scanner(System.in);
        int opcion;

        // Bucle para mostrar el menú hasta que el usuario elija salir
        do {
            // Mostrar el menú
            System.out.println("Seleccione una opción:");
            System.out.println("1. Fruta");
            System.out.println("2. Refrescos");
            System.out.println("3. Ropa");
            System.out.println("4. Salir");

            // Leer la opción seleccionada por el usuario
            opcion = scanner.nextInt();

            // Evaluar la opción seleccionada
            switch (opcion) {
                case 1:
                    System.out.println("Ha seleccionado Fruta.");
                    break;
                case 2:
                    System.out.println("Ha seleccionado Refrescos.");
                    break;
                case 3:
                    System.out.println("Ha seleccionado Ropa.");
                    break;
                case 4:
                    System.out.println("Ha seleccionado Salir.");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, seleccione un número entre 1 y 4.");
                    break;
            }
        } while (opcion != 4);  // Continuar hasta que el usuario seleccione la opción 4

        scanner.close();  // Cerrar el scanner 
    }
    
}
