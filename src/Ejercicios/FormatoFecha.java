/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicios;

import java.util.Scanner;

/**
 *
 * @author Ra�l
 */
public class FormatoFecha {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       /*
            Solicita al usuario que introduzca una fecha en formato decimal como una cadena de texto. 
            La fecha decimal debe tener el siguiente formato: YYYY-MM-DD (por ejemplo, 2024.11.20).

            Usa el m�todo split para separar el a�o, mes y d�a.

            Convierte los valores separados en enteros y valida:

            El a�o debe ser mayor que 1900 y menor que 2100.
            El mes debe estar entre 1 y 12.
            El d�a debe ser v�lido para el mes indicado (considera a�os bisiestos).
            Imprime la fecha en un formato m�s legible: DD/MM/YYYY.
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

            // Validar rango de a�o, mes y d�a
            if (anio < 1900 || anio > 2100) {
                System.out.println("Error: A�o fuera de rango.");
                return;
            }

            if (mes < 1 || mes > 12) {
                System.out.println("Error: Mes fuera de rango.");
                return;
            }

            if (!esDiaValido(anio, mes, dia)) {
                System.out.println("Error: D�a fuera de rango.");
                return;
            }

            // Formatear la fecha
            System.out.printf("Fecha formateada: %02d/%02d/%04d\n", dia, mes, anio);

        } catch (NumberFormatException e) {
            System.out.println("Error: La fecha debe contener n�meros.");
        }
    }

        // M�todo para validar los d�as del mes (incluye a�os bisiestos)
        private static boolean esDiaValido(int anio, int mes, int dia) {
            int[] diasPorMes = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

            // Comprobar a�o bisiesto
            if (mes == 2 && esBisiesto(anio)) {
                diasPorMes[1] = 29;
            }

            return dia > 0 && dia <= diasPorMes[mes - 1];
        }

        // M�todo para comprobar si un a�o es bisiesto
        /*
        Un a�o es bisiesto si cumple las siguientes condiciones:

        Es divisible entre 4:

        Si un a�o puede dividirse exactamente entre 4, entonces es un candidato para ser bisiesto.
        No es divisible entre 100, a menos que tambi�n sea divisible entre 400:

        Los a�os que son m�ltiplos de 100 no son bisiestos, excepto si tambi�n son m�ltiplos de 400.
        */
        private static boolean esBisiesto(int anio) {
            return (anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0);
        }
    
    
}
