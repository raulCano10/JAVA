/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ProgramacionJAVA;

/**
 *
 * @author Raúl
 */
import java.util.Scanner;

public class ValidarPatrones {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce la cadena:");
        String entrada = sc.nextLine();

        String patron = "TuPatronAqui"; // Cambia el patrón según el ejercicio
        if (entrada.matches(patron)) {
            System.out.println("La cadena cumple con el patrón.");
        } else {
            System.out.println("La cadena NO cumple con el patrón.");
        }
    }
}

