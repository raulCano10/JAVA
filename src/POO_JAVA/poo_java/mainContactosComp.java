/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poo_java;

import Clases.ContactoComp;

/**
 *
 * @author raul
 */
public class mainContactosComp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ContactoComp primerContacto = new ContactoComp(1, "Raul", "raul@gmail.com", "658445566");
        ContactoComp segundoContacto = new ContactoComp(2, "Rafa", "rafa@gmail.com", "555444111");
        
        System.out.println(primerContacto.aCadena());
        
        System.out.println(segundoContacto.aCadena());
    }
    
}
