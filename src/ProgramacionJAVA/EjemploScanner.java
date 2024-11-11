/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ProgramacionJAVA;

import java.util.Scanner;

/**
 *
 * @author raul
 */
public class EjemploScanner {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //sc.nextLine()
        //System.out.println("Introduce un numero: ");
        int numero = sc.nextInt();       
        System.out.println("Numero seleccionado: " + numero);
        
        sc.nextLine();
        
        String cadena = sc.nextLine();
        System.out.println("La cadena introducida es: " + cadena);
        
        //Recoger un entero por teclado
        int numeroEntero = Integer.parseInt(sc.nextLine());
        
        //Recoger un Double por teclado
        double numeroDouble = Double.parseDouble(sc.nextLine());
        
       numeroDouble = sc.nextDouble();
       
       //Recoger un caracter por teclado
       char letra = sc.next().charAt(0);
        
        
    }
    
}
