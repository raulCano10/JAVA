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
public class Cadenas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          
        /**
         * EJERCICIO 1: Pedir por teclado una cadena de texto y mostrarla caracter a caracter
         * Hacerlo de dos formas utilizando la funcion charAt() y substring()
         */
        //1. Pedir una cadena de texto por teclado
        //2. Recorrer la cadena de texto con un FOR
        //3. Dentro del FOR imprimir por pantalla caracter a caracter con charAt()
        //4. hacer otro FOR pero imprimiendo por pantalla cada caracter utilizando Substring()
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce una cadena de texto:");
        String cadena = sc.nextLine();
        
        //FOR - charAt()
        for(int i = 0; i < cadena.length(); i++){
            System.out.println(cadena.charAt(i));
        }
        
        //FOR - substring
        for(int i = 0; i < cadena.length(); i++){
            System.out.println(cadena.substring(i, i+1));
        }
        
        
        /**
         * EJERCICIO 2: 
         * PARTE 1: Contar las veces que aparece una letra en una cadena
         * Pide una cadena por teclado y un caracter despues cuenta
         * las veces que se repite ese caracter en la cadena
         * 
         * PARTE 2: Contar cuantas palabras tiene la cadena (Usar SPLIT)
         */
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Introduce una cadena de texto:");
        String cadena1 = scan.nextLine();

        System.out.println("Introduce un caracter");
        char caracter = scan.next().charAt(0);
        
        int contador = 0;
        for(int i = 0; i < cadena1.length(); i++){
            char otroCaracter = cadena.charAt(i);
            //¿La letra de la cadena es igual a la letra que pedi por teclado?
            if(otroCaracter == caracter){
                contador++;
            }
        }
        System.out.println("La letra " + caracter + " aparece " + contador + " veces");
        
         //PARTE 2
        String[] miCadenaArray = cadena1.split(" ");
        int numeroPalabras = miCadenaArray.length;      
        System.out.println("La cadena tiene " + numeroPalabras + "palabras");
          
        //String cadena2 = "Cadena de texto";
        //int logitudCadena = cadena2.length();
        
        //Dada la sigueinte frase "el covid19 es lo peor"
        //Contar las vocales y las consonantes que tiene esa frase
        //Ayuda. Hay que utilizar la funcion indexOf()     
        
        String frase = "El covid 19 es lo peor";
        
        //TODO: declarar variables para contar vocales y consonantes
        int contadorVocales = 0;
        int contadorConsonantes = 0;
        
        for(int i=0; i < frase.length();i++){
            char unCaracterDeLaFrase = frase.charAt(i);
            
            String vocales = "aeiouAEIOU";
        
            //Comprobar si es una vocal o una consonante
            if(vocales.indexOf(unCaracterDeLaFrase) >= 0 ){
                contadorVocales++;
            }else{
                contadorConsonantes++;
            }
        }
        
        System.out.println("Vocales: " + contadorVocales);
        System.out.println("Consonantes: " + contadorConsonantes);
        
        //REPASO INDEXOF
        
        String texto = "Hola como estas";
        int indice = texto.indexOf('W');
        System.out.println("La letra C esta en la posicion" + indice);
        
        int indice1 = texto.indexOf("estas");
        System.out.println("La posicion donde empieza la palabra \"estas\" " + indice1);
        
        //EJERCICIO
        String frase1 = "Este es un ejemplo de como se puede extraer la decimocuarta y la"
                + "trigesima octava palabra de una cadena de texto que tiene exactamente sesenta"
                + " palabras distribuidas en varias frases que van separadas por espacios"
                + " entre ellas. Lo que nos facilita la separacion de palabras usando split";
        
        //Dato esta frase dime que palabra 
        
        //PARTE 1: Imprime por consola la palabra que aparece en la posicion 
        // decimocuarta y trigesima octava
        // (Usa la funcion Split).
        String arrayPartesFraseEspacios[] = frase1.split(" ");
        System.out.println(arrayPartesFraseEspacios[13]);
        System.out.println(arrayPartesFraseEspacios[37]);
        
        //PARTE 2:
        //MAYUSCULAS              
        System.out.println("Mayúsculas: " + frase1.toUpperCase()); // Convertir a mayúsculas
        
        //MINUSCULAS
        System.out.println("Minúsculas: " + frase1.toLowerCase()); // Convertir a minúsculas
        //PARTE 3:
        //Reemplaceis los espaciones por barra baja "_";
        System.out.println("Minúsculas: " + frase1.replace(" ", "_")); // Convertir a minúsculas
        
        
    }
    
   
    
}
