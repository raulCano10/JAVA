/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package daw1aleatorio;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author Raúl
 */
public class DAW1Aleatorio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Lista original de nombres en un ArrayList
        ArrayList<String> nombresOriginales = new ArrayList<>(Arrays.asList(
                "FREDDY EDUARDO", "ANGELES", "DAVID AVILA", "ANA CARLOTA", "ANTONIO BELZUNCE",
                "OUALID", "TANNIA", "DANIEL CAMPOS", "ABEL", "JAVIER", "AGUSTIN","ANTONIO JOSE GALERA", "SILVIA", "ANTONIO JESUS B.", "FLORIN", "PABLO",
                "ALVARO G.", "CRISTIAN", "PEDRO JOSE", "DANIEL MOLINA", "ALEJANDRO", "JUAN FRANCISCO", "RAMON", "RUBEN", "JUAN ANTONIO S.", "SEBASTIAN", "DAVID EDGAR", "MARTA"
        ));

        // Copia mutable de la lista original
        ArrayList<String> nombresDisponibles = new ArrayList<>(nombresOriginales);
        Random random = new Random();

//        for (int i = 0; i < 15; i++) { // Simulamos 15 selecciones
//            if (nombresDisponibles.isEmpty()) {
//                // Si ya seleccionamos todos, restauramos la lista original
//                nombresDisponibles = new ArrayList<>(nombresOriginales);
//            }
//
//            // Seleccionar un nombre aleatorio
//            int indice = random.nextInt(nombresDisponibles.size());
//            String seleccionado = nombresDisponibles.remove(indice); // Se elimina temporalmente
//            System.out.println("Nombre seleccionado: " + seleccionado);
//        }

            //Seleccionar un nombre aleatorio
            int indice = random.nextInt(nombresDisponibles.size());
            String seleccionado = nombresDisponibles.get(indice); // Se elimina temporalmente
            System.out.println("SALE A HACER EL EJERCICIO: ");
            System.out.println("\033[1;34m" + "=====================");
            System.out.println("  " + seleccionado.toUpperCase());
            System.out.println("=====================" + "\033[0m");
            System.out.println("!!!ENHORABUENA!!!");
    }
    
}
