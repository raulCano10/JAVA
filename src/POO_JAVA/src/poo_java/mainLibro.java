/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poo_java;

import Clases.Libro;

/**
 *
 * @author raul
 */
public class mainLibro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Libro libro1 = new Libro("1984","G.Oswell",1948);
        Libro libro2 = new Libro("L001","Moby Dick","Mervill.H",1851);
        Libro libro3 = new Libro("50 Sombras","Mike M.",2010);
        
        System.out.println("LIBRO 1");
        libro1.citaBibliografica();
        System.out.println("LIBRO 2");
        libro2.citaBibliografica();
        System.out.println("LIBRO 3");
        libro3.citaBibliografica();
        
        System.out.println("ISBN Libro 1: " + libro1.getIsbn());
        System.out.println("ISBN Libro 2: " + libro2.getIsbn());
        System.out.println("ISBN Libro 3: " + libro3.getIsbn());
        
        System.out.println("");
                System.out.println("");
                        System.out.println("");
        libro1=libro2;
        
        System.out.println("LIBRO 1");
        libro1.citaBibliografica();
        System.out.println("LIBRO 2");
        libro2.citaBibliografica();
        
         System.out.println("");
                System.out.println("");
                        System.out.println("");
                        
        libro1.setAutor("MONOLO");
        
        System.out.println("LIBRO 1");
        libro1.citaBibliografica();
        System.out.println("LIBRO 2");
        libro2.citaBibliografica();
    }
    
}
