/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

import java.util.ArrayList;
import poligonos.Triangulo;
import poligonos.Cuadrado;
import poligonos.Poligono;
import poligonos.Rectangulo;
/**
 *
 * @author raul
 */
public class mainPoligonos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
        Triangulo triangulo = new Triangulo(3.25, 4.55, 2.71);
        Triangulo triangulo2 = new Triangulo(3.25, 4.55, 3);
        Triangulo triangulo3 = new Triangulo(3.25, 4.55, 4);
        Poligono poligono6 = new Triangulo(3.25, 4.55, 2.71);
        //Cuadrado cuadrado6 = (Cuadrado) poligono6;
        //System.out.println(cuadrado6.Area());
                
        Cuadrado cuadrado = new Cuadrado(4, 4);
//        Poligono poligono = new Poligono(5);
        Rectangulo rectangulo = new Rectangulo(5,10);
        
//        System.out.println(triangulo.Area());
//        System.out.println(cuadrado.Area());
        
        
//        System.out.println(triangulo);
//        System.out.println(cuadrado.toString());
//        System.out.println(poligono);
        
        ArrayList<Poligono> listaPoligonos = new ArrayList();
        
//        listaPoligonos.add(poligono);
        listaPoligonos.add(triangulo);
        listaPoligonos.add(cuadrado);
        listaPoligonos.add(rectangulo);
        
        for (int i = 0; i<listaPoligonos.size();i++){
            Poligono p=listaPoligonos.get(i);
            System.out.println(p.Area());
        }
    }
    
}
