/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicios;

import java.util.Scanner;

/**
 *
 * @author Raúl
 */
public class FormatoFecha {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       /*
            Solicita al usuario que introduzca una fecha en formato decimal como una cadena de texto. 
            La fecha decimal debe tener el siguiente formato: YYYY-MM-DD (por ejemplo, 2024.11.20).

            Usa el método split para separar el año, mes y día.

            Convierte los valores separados en enteros y valida:

            El año debe ser mayor que 1900 y menor que 2100.
            El mes debe estar entre 1 y 12.
            El día debe ser válido para el mes indicado (considera años bisiestos).
            Imprime la fecha en un formato más legible: DD/MM/YYYY.
        */
        
        Scanner scanner3 = new Scanner(System.in);

        System.out.println("Introduce una fecha en formato YYYY-MM-DD: ");
        String fechaDecimal = scanner3.nextLine();
        //System.out.println(fechaDecimal);

        // Separar los componentes usando split
        String[] partes = fechaDecimal.split("-");

        //System.out.println(partes.length);
        // Validar el formato
        if (partes.length != 3) {
            System.out.println("Error: Formato incorrecto.");
            return;
        }

        try {
            int anio = Integer.parseInt(partes[0]);
            int mes = Integer.parseInt(partes[1]);
            int dia = Integer.parseInt(partes[2]);

            // Validar rango de año, mes y día
            if (anio < 1900 || anio > 2100) {
                System.out.println("Error: Año fuera de rango.");
                return;
            }

            if (mes < 1 || mes > 12) {
                System.out.println("Error: Mes fuera de rango.");
                return;
            }

            if (!esDiaValido(anio, mes, dia)) {
                System.out.println("Error: Día fuera de rango.");
                return;
            }

            // Formatear la fecha
            System.out.printf("Fecha formateada: %02d/%02d/%04d\n", dia, mes, anio);

        } catch (NumberFormatException e) {
            System.out.println("Error: La fecha debe contener números.");
        }
    }

        // Método para validar los días del mes (incluye años bisiestos)
        private static boolean esDiaValido(int anio, int mes, int dia) {
            int[] diasPorMes = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

            // Comprobar año bisiesto
            if (mes == 2 && esBisiesto(anio)) {
                diasPorMes[1] = 29;
            }

            return dia > 0 && dia <= diasPorMes[mes - 1];
        }

        // Método para comprobar si un año es bisiesto
        /*
        Un año es bisiesto si cumple las siguientes condiciones:

        Es divisible entre 4:

        Si un año puede dividirse exactamente entre 4, entonces es un candidato para ser bisiesto.
        No es divisible entre 100, a menos que también sea divisible entre 400:

        Los años que son múltiplos de 100 no son bisiestos, excepto si también son múltiplos de 400.
        */
        private static boolean esBisiesto(int anio) {
            return (anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0);
        }
    
    
}
