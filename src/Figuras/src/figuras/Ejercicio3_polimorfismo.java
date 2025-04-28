package figuras;

import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author raul
 */
public class Ejercicio3_polimorfismo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Figura> listaFiguras = new ArrayList();
        
        Piramide piramide = new Piramide(5);
        Cuadrado cuadrado = new Cuadrado(3);
        Rectangulo rectangulo = new Rectangulo(8, 3);
        
        piramide.setColor(Constantes.TipoColor.ROJO);
        cuadrado.setColor(Constantes.TipoColor.VERDE);
        rectangulo.setColor(Constantes.TipoColor.AZUL);
        
        listaFiguras.add(piramide);
        listaFiguras.add(rectangulo);
        listaFiguras.add(cuadrado);
        
        for (Figura f : listaFiguras) {
            f.pintar();
            System.out.printf("Area:%7.2f Perimetro %.2f\n",
        f.area(),f.perimetro());
        }
    }
    
}
