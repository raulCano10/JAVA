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
public class Estructuras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         int c = Funciones.sumar(1,2);
         System.out.println("c vale " + c);
        /*
        Ejercicio 1 
        Calcular la media de tres n�meros pedidos por teclado.       
        */
        Scanner scanner = new Scanner(System.in);
        
        // Pedir los tres n�meros
        System.out.println("Introduce el primer n�mero:");
        double num1 = scanner.nextDouble();
        
        System.out.println("Introduce el segundo n�mero:");
        double num2 = scanner.nextDouble();
        
        System.out.println("Introduce el tercer n�mero:");
        double num3 = scanner.nextDouble();
        
        // Calcular la media
        double media = (num1 + num2 + num3) / 3;
        
        // Mostrar el resultado
        System.out.println("La media de los tres n�meros es: " + media);
        

        /*
        Ejercicio 2 
        Calcular el per�metro y �rea de un rect�ngulo dada su base y su altura.
        */
        Scanner scanner1 = new Scanner(System.in);
        
        // Pedir base y altura
        System.out.println("Introduce la base del rect�ngulo:");
        double base = scanner1.nextDouble();
        
        System.out.println("Introduce la altura del rect�ngulo:");
        double altura = scanner1.nextDouble();
        
        // Calcular per�metro y �rea
        double perimetro = 2 * (base + altura);
        double area = base * altura;
        
        // Mostrar resultados
        System.out.println("El per�metro del rect�ngulo es: " + perimetro);
        System.out.println("El �rea del rect�ngulo es: " + area);
        

        /*
        Ejercicio 3 
        Una tienda ofrece un descuento del 15% sobre el total de la compra y un cliente desea 
        saber cuanto deber� pagar finalmente por su compra. 
        */
        Scanner scanner2 = new Scanner(System.in);
        
        // Pedir el total de la compra
        System.out.println("Introduce el total de la compra:");
        double totalCompra = scanner2.nextDouble();
        
        // Calcular el descuento
        double descuento = totalCompra * 0.15;
        double totalFinal = totalCompra - descuento;
        
        // Mostrar el resultado
        System.out.println("El precio final despu�s del descuento es: " + totalFinal);
        
      
        /*
        Ejercicio 4 
        Escribir un programa que convierta un valor dado en grados Fahrenheit a grados 
        Celsius. Recordar que la f�rmula para la conversi�n es: 
        C = (F-32)*5/9 
        */
        Scanner scanner4 = new Scanner(System.in);

        System.out.println("Seleccione la conversi�n que desea realizar:");
        System.out.println("1. Fahrenheit a Celsius");
        System.out.println("2. Celsius a Fahrenheit");
        int opcion = scanner4.nextInt();

        if (opcion == 1) {
            // Conversi�n de Fahrenheit a Celsius
            System.out.print("Ingrese el valor en grados Fahrenheit: ");
            double fahrenheit = scanner4.nextDouble();
            double celsius = (fahrenheit - 32) * 5 / 9;
            System.out.println("El valor en grados Celsius es: " + celsius);
        } else if (opcion == 2) {
            // Conversi�n de Celsius a Fahrenheit
            System.out.print("Ingrese el valor en grados Celsius: ");
            double celsius = scanner4.nextDouble();
            double fahrenheit = (celsius * 9 / 5) + 32;
            System.out.println("El valor en grados Fahrenheit es: " + fahrenheit);
        } else {
            System.out.println("Opci�n no v�lida.");
        }

        scanner.close();
        

        /*
        Ejercicio 5 
        Un vendedor recibe un sueldo base mas un 10% extra por comisi�n de sus ventas, el 
        vendedor desea saber cuanto dinero obtendr� por concepto de comisiones por las tres 
        ventas que realiza en el mes y el total que recibir� en el mes tomando en cuenta su 
        sueldo base y comisiones. (El algoritmo leer� por teclado el sueldobase y las tres 
        ventas). 
        */
        Scanner scanner5 = new Scanner(System.in);
        
        // Pedir sueldo base y las ventas
        System.out.println("Introduce el sueldo base del vendedor:");
        double sueldoBase = scanner5.nextDouble();
        
        System.out.println("Introduce la primera venta:");
        double venta1 = scanner5.nextDouble();
        
        System.out.println("Introduce la segunda venta:");
        double venta2 = scanner5.nextDouble();
        
        System.out.println("Introduce la tercera venta:");
        double venta3 = scanner5.nextDouble();
        
        // Calcular las comisiones (10% de las ventas)
        double comision1 = venta1 * 0.10;
        double comision2 = venta2 * 0.10;
        double comision3 = venta3 * 0.10;
        
        double totalComisiones = comision1 + comision2 + comision3;
        double sueldoTotal = sueldoBase + totalComisiones;
        
        // Mostrar resultados
        System.out.println("El total de las comisiones es: " + totalComisiones);
        System.out.println("El sueldo total del vendedor es: " + sueldoTotal);
        

        /*
        Ejercicio 6 
        Un alumno desea saber cual ser� su calificaci�n final en la materia de Algoritmos. Dicha 
        calificaci�n se compone de los siguientes porcentajes: 
        ? 55% del promedio de sus tres calificaciones parciales. 
        ? 30% de la calificaci�n del examen final. 
        ? 15% de la calificaci�n de un trabajo final. 
        */
        Scanner scanner6 = new Scanner(System.in);
        
        // Pedir calificaciones parciales, examen final y trabajo final
        System.out.println("Introduce las tres calificaciones parciales:");
        double parcial1 = scanner6.nextDouble();
        double parcial2 = scanner6.nextDouble();
        double parcial3 = scanner6.nextDouble();
        
        System.out.println("Introduce la calificaci�n del examen final:");
        double examenFinal = scanner6.nextDouble();
        
        System.out.println("Introduce la calificaci�n del trabajo final:");
        double trabajoFinal = scanner6.nextDouble();
        
        // Calcular la media de los parciales
        double promedioParciales = (parcial1 + parcial2 + parcial3) / 3;
        
        // Calcular la calificaci�n final
        double calificacionFinal = (promedioParciales * 0.55) + (examenFinal * 0.30) + (trabajoFinal * 0.15);
        
        // Mostrar la calificaci�n final
        System.out.println("La calificaci�n final es: " + calificacionFinal);
        
 
        /*
        Ejercicio 7 
        Dadas dos variables num�ricas A y B, que el usuario debe teclear, se pide realizar un 
        algoritmo que intercambie los valores de ambas variables y muestre cuanto valen al 
        final las dos variables. 
        */
        Scanner scanner7 = new Scanner(System.in);
        
        // Pedir los dos n�meros
        System.out.println("Introduce el valor de A:");
        int A = scanner7.nextInt();
        
        System.out.println("Introduce el valor de B:");
        int B = scanner7.nextInt();
        
        // Intercambiar valores
        int temp = A;
        A = B;
        B = temp;
        
        // Mostrar los valores despu�s del intercambio
        System.out.println("El nuevo valor de A es: " + A);
        System.out.println("El nuevo valor de B es: " + B);
        
        
        /*
        Ejercicio 8 
        Dado un n�mero de dos cifras, dise�e un algoritmo que permita obtener el n�mero 
        invertido. Ejemplo, si se introduce 23 que muestre 32. 
        */
        Scanner scanner8 = new Scanner(System.in);
        
        // Pedir el n�mero de dos cifras
        System.out.println("Introduce un n�mero de dos cifras:");
        int numero = scanner8.nextInt();
        
        // Extraer las cifras
        int decenas = numero / 10;
        int unidades = numero % 10;
        
        // Invertir el n�mero
        int numeroInvertido = unidades * 10 + decenas;
        
        // Mostrar el n�mero invertido
        System.out.println("El n�mero invertido es: " + numeroInvertido);
        

        /*
        Ejercicio 9 
        Pedir el nombre y los dos apellidos de una persona y mostrar las iniciales. 
        */
        Scanner scanner9 = new Scanner(System.in);
        
        // Pedir el nombre y apellidos
        System.out.println("Introduce el nombre:");
        String nombre = scanner9.nextLine();
        
        System.out.println("Introduce el primer apellido:");
        String primerApellido = scanner9.nextLine();
        
        System.out.println("Introduce el segundo apellido:");
        String segundoApellido = scanner9.nextLine();
        
        // Obtener las iniciales
        char inicialNombre = nombre.charAt(0);
        char inicialPrimerApellido = primerApellido.charAt(0);
        char inicialSegundoApellido = segundoApellido.charAt(0);
        
        // Mostrar las iniciales
        System.out.println("Las iniciales son: " + inicialNombre + "." + inicialPrimerApellido + "." + inicialSegundoApellido + ".");
        
        
        /*
        Ejercicio 10 
        Dise�ar un algoritmo que nos diga el dinero que tenemos (en euros y c�ntimos) 
        despu�s de pedirnos cuantas monedas tenemos (de 2euro, 1euro, 50 c�ntimos, 20 c�ntimos o 
        10 c�ntimos). 
        */
        Scanner teclado = new Scanner(System.in);

        // Declaraci�n de las variables
        int monedas2, monedas1, monedas50, monedas20, monedas10;
        double totalEuros;

        // Pedir las cantidades de cada tipo de moneda
        System.out.print("Introduce la cantidad de monedas de 2?: ");
        monedas2 = Integer.parseInt(teclado.nextLine());

        System.out.print("Introduce la cantidad de monedas de 1?: ");
        monedas1 = Integer.parseInt(teclado.nextLine());

        System.out.print("Introduce la cantidad de monedas de 50 c�ntimos: ");
        monedas50 = Integer.parseInt(teclado.nextLine());

        System.out.print("Introduce la cantidad de monedas de 20 c�ntimos: ");
        monedas20 = Integer.parseInt(teclado.nextLine());

        System.out.print("Introduce la cantidad de monedas de 10 c�ntimos: ");
        monedas10 = Integer.parseInt(teclado.nextLine());

        // Calcular el total en euros y c�ntimos
        totalEuros = (monedas2 * 2) + (monedas1 * 1) + (monedas50 * 0.50) + (monedas20 * 0.20) + (monedas10 * 0.10);

        // Mostrar el resultado
        int euros = (int) totalEuros; // Parte entera (euros)
        int centimos = (int) ((totalEuros - euros) * 100); // Parte decimal (c�ntimos)

        System.out.printf("El total es: %d? y %d c�ntimos.\n", euros, centimos);
        
        //Ejercicio 11
        //crear un peque�o programa que pida al usuario ingresar una calificaci�n y, 
        //si no es v�lida (es decir, si no est� entre 0 y 10), 
        //le pedir� que ingrese la calificaci�n nuevamente. 
        //Luego, el programa continuar� preguntando al usuario si desea ingresar otra calificaci�n.
        
    }
    
}
