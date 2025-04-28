/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poo_java;

import Clases.Autor;
import Clases.Libro2;
import java.util.ArrayList;

/**
 *
 * @author raul
 */
public class mainLibro2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Autor> listaAutores = new ArrayList();
        ArrayList<Libro2> listaLibros = new ArrayList();
        
        Autor autor1 = new Autor("Jorge", "Javier", "Vazquez", "jorge@gmail.com");
        Autor autor2 = new Autor("Alicia", "Cano", "Medina", "alicia@gmail.com");
        
        Libro2 libro1 = new Libro2 (Utilidades.Utilidades.generarCodigoAleatorio(), "El hobbinton", autor1, 2020);
        Libro2 libro2 = new Libro2 (Utilidades.Utilidades.generarCodigoAleatorio(), "Mi vida es bella", autor2, 2021);
        
        String codigo = Utilidades.Utilidades.generarCodigoAleatorio();
        System.out.println(codigo);
        
        //INCLUIR LOS DOS AUTORES EN LA LISTA DE AUTORES
        listaAutores.add(autor1);
        listaAutores.add(autor2);
        //MOSTRAR TODOS LOS AUTORES
        for(Autor nuevoAutor : listaAutores){
            System.out.println(nuevoAutor.getNombrecita());
        }
        //MOSTRAR TODOS LOS LIBROS CON SUS AUTORES
        listaLibros.add(libro1);
        listaLibros.add(libro2);
        
        for(Libro2 libro : listaLibros){
            System.out.println(libro.getCitaBibliografica());
        }
    }
    
}
