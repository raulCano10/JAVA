/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ProgramacionJAVA;

/**
 *
 * @author Ra�l
 */
import java.util.Scanner;

public class ValidarPatrones {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce la cadena:");
        String entrada = sc.nextLine();

        String patron = "TuPatronAqui"; // Cambia el patr�n seg�n el ejercicio
        if (entrada.matches(patron)) {
            System.out.println("La cadena cumple con el patr�n.");
        } else {
            System.out.println("La cadena NO cumple con el patr�n.");
        }
    }
}

