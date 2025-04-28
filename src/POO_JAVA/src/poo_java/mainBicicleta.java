/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poo_java;

import Clases.Bicicleta;

/**
 *
 * @author raul
 */
public class mainBicicleta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //En el programa principal: 
        //1. Crea dos objetos de la clase bicicleta: miBicicleta y tuBicicleta 
        Bicicleta miBicicleta = new Bicicleta("prueba1");
        Bicicleta tuBicicleta = new Bicicleta("prueba2");
        
        //2. Pedalea dos veces con miBici y cambia al piñón 2. 
        miBicicleta.pedalear();
        miBicicleta.pedalear();
        miBicicleta.cambiarPinon(2);
           
        //3. Pedalea tres veces con tuBici y cambia al piñón 6.
        tuBicicleta.pedalear();
        tuBicicleta.pedalear();
        tuBicicleta.pedalear();
        tuBicicleta.cambiarPinon(6);
        //4. Pedalea tres veces con tuBici y cambia al piñón 5. 
        tuBicicleta.pedalear();
        tuBicicleta.pedalear();
        tuBicicleta.pedalear();
        tuBicicleta.cambiarPinon(5);
        
        //5. Muestra ambas velocidades 
        System.out.println("LAS VELOCIDADES SON: ");
        miBicicleta.mostrarVelocidad();
        tuBicicleta.mostrarVelocidad();
        
        Bicicleta otraBicicleta = new Bicicleta("RAUL");
        otraBicicleta.mostrarVelocidad();
    }
    
}
