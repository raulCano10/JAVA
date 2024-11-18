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
public class VerificarPalindromo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Crea un programa que determine si una cadena de texto introducida por teclado
        // se lee igual hacia delante que hacia atrás (Palindromo).
        
        Scanner sc = new Scanner(System.in);
        String cadena = sc.nextLine();
        cadena = cadena.toLowerCase();
        boolean esPalindromo = true; 
        
        for(int i=0; i < cadena.length()/2; i++){
            if(cadena.charAt(i) != cadena.charAt(cadena.length()- (i+1))){
                esPalindromo = false;
                break;
            }
        }
        
        
        
        if(esPalindromo){
            System.out.println("La palabra SI es un palindromo");
        }else{
            System.out.println("La palabra NO es un palindromo");
        }
        
         if(!esPalindromo){
            System.out.println("La palabra NO es un palindromo");
        }else{
            System.out.println("La palabra SI es un palindromo");
        }
        
    }
    
}
