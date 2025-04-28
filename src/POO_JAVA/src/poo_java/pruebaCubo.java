/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poo_java;

import Clases.Cubo;

/**
 *
 * @author raul
 */
public class pruebaCubo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cubo miCubo = new Cubo(5);
        miCubo.pintarCubo();
        miCubo.rellenarCubo(4);
        miCubo.pintarCubo();
        miCubo.rellenarCubo(2);
         miCubo.pintarCubo();
         miCubo.vaciarCubo();
          miCubo.pintarCubo();
    }
    
}
