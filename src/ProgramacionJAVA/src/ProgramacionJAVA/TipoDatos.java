/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ProgramacionJAVA;

/**
 *
 * @author raul
 */
public class TipoDatos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /**
         * DATOS PRIMITIVOS: Almacenan valores simples directamente en memoria
         * byte     1 byte
         * short    2 bytes
         * int      4 bytes
         * long     8 bytes
         * float    4 bytes    
         * double   8 bytes
         * char     2 byte
         * boolean  1 bit
         */
        
        byte edad = 3;
        System.out.println("Edad:" + edad);
        
        short numeroCorto = 15000;
        System.out.println("NumeroCorto:" + numeroCorto);
        
        int contador = 100000;
        System.out.println("Contador:" + contador);
        
        long distancia = 150000000000L; //Sufijo 'L' long es necesario
        System.out.println("Distancia:" + distancia);
        
        float precio = 19.99F;
        System.out.println("Precio:" + precio);
        
        double peso = 70.65;
        System.out.println("Peso:" + peso);
        
        char letra = 'A';
        System.out.println("Letra:" + letra);
        
        boolean esMayorDeEdad = true; //o bien false
        System.out.println("Es mayor de edad:" + esMayorDeEdad);
        
        /**
         * DATOS NO PRIMITIVOS: Almacenan una referencia al objeto real
         * Cadenas (String)
         * Arreglos (Arrays)
         * Clases
         * Interfaces
         */
        
        String nombre = "Raúl";
        System.out.println("Nombre: " + nombre);
    }
    
}
