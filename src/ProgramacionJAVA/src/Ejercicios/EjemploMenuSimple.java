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
        
        
        System.out.println("1. Fruta.");
        System.out.println("2. Refrescos.");
        System.out.println("3. Ropa.");
        System.out.println("4. Salir.");
        
        System.out.println("Estoy esperando a que selecciones una opcion. Date prisa!!");
        Scanner sc = new Scanner(System.in);
        int opcionSeleccionada = sc.nextInt();
          
        System.out.println("He seleccionado la opcion " + opcionSeleccionada);        
        
    }
    
}
