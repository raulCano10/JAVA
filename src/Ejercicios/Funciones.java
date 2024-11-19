/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicios;

/**
 *
 * @author Ra�l
 */
public class Funciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                /*
        Hacer un programa que te diga si un n�mero es par o impar. Para realizarlo, crear una 
        funci�n llamada esPar() que te diga si dicho n�mero es par o impar. 
        Par�metros de entrada: el n�mero a verificar 
        Par�metros de salida: verdadero o falso seg�n sea el n�mero par o impar 
        */
        int numero = 8;
        if (esPar(numero)) {
            System.out.println(numero + " es par.");
        } else {
            System.out.println(numero + " es impar.");
        }

         // Crear una funci�n que sume dos n�meros
        int resultado = sumar(5, 7);
        System.out.println("La suma de 5 y 7 es: " + resultado);

        // Crear una funci�n que convierta Celsius a Fahrenheit
        double celsius = 25.0;
        double fahrenheit = celsiusAFahrenheit(celsius);
        System.out.println(celsius + " grados Celsius son " + fahrenheit + " grados Fahrenheit.");
            
        //Calcula el area de un circulo
         double area = calcularAreaCirculo(5.0);
        System.out.println("El �rea del c�rculo con radio 5.0 es: " + area);
        
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
    
    // Definici�n de una funci�n con public static double
    public static double calcularAreaCirculo(double radio) {
        return Math.PI * radio * radio;
    }
    
    
}
