/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicios;

/**
 *
 * @author Raúl
 */
public class Funciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                /*
        Hacer un programa que te diga si un número es par o impar. Para realizarlo, crear una 
        función llamada esPar() que te diga si dicho número es par o impar. 
        Parámetros de entrada: el número a verificar 
        Parámetros de salida: verdadero o falso según sea el número par o impar 
        */
        int numero = 8;
        if (esPar(numero)) {
            System.out.println(numero + " es par.");
        } else {
            System.out.println(numero + " es impar.");
        }

         // Crear una función que sume dos números
        int resultado = sumar(5, 7);
        System.out.println("La suma de 5 y 7 es: " + resultado);

        // Crear una función que convierta Celsius a Fahrenheit
        double celsius = 25.0;
        double fahrenheit = celsiusAFahrenheit(celsius);
        System.out.println(celsius + " grados Celsius son " + fahrenheit + " grados Fahrenheit.");
            
        //Calcula el area de un circulo
         double area = calcularAreaCirculo(5.0);
        System.out.println("El área del círculo con radio 5.0 es: " + area);
        
    }

    /**
     * 
     * @param a valor numero 1
     * @param b valor numero 2
     * @return devuelve la suma de dos numeros. Devuelve un numero Entero.
     */
    public static int sumar(int a, int b) {
            return a + b;
    }
    
    public static boolean esPar(int numero) {
        return numero % 2 == 0;
    }
    
    public static double celsiusAFahrenheit(double celsius) {
        return (celsius * 9/5) + 32;
    }
    
    // Definición de una función con public static double
    public static double calcularAreaCirculo(double radio) {
        return Math.PI * radio * radio;
    }
    
    
}
