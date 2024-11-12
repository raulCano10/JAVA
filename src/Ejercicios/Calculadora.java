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
public class Calculadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        try{
            Scanner scanner = new Scanner(System.in);
            double num1, num2;
            char operacion;

            System.out.println("Calculadora b�sica en Java");
            System.out.print("Ingresa el primer n�mero: ");
            num1 = scanner.nextDouble();

            System.out.print("Ingresa el segundo n�mero: ");
            num2 = scanner.nextDouble();

            System.out.print("Ingresa la operaci�n (+, -, *, /): ");
            operacion = scanner.next().charAt(0);

            double resultado = 0;
            boolean operacionValida = true;

            switch (operacion) {
                case '+':
                    resultado = num1 + num2;
                    break;
                case '-':
                    resultado = num1 - num2;
                    break;
                case '*':
                    resultado = num1 * num2;
                    break;
                case '/':
                    if (num2 != 0) {
                        resultado = num1 / num2;
                    } else {
                        System.out.println("Error: No se puede dividir entre cero.");
                        operacionValida = false;
                    }
                    break;
                default:
                    System.out.println("Operaci�n no v�lida.");
                    operacionValida = false;
            }

            if (operacionValida) {
                System.out.println("El resultado es: " + resultado);
            }

            scanner.close();
        }catch(Exception ex){
            System.out.println("ERROR CUIDADO!!!!!!");
            System.out.println("" + ex.getMessage());
            System.out.println("" + ex.toString());
        }
            
        
        
    }
    
}
