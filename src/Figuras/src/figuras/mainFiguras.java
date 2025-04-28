/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package figuras;

/**
 *
 * @author raul
 */
public class mainFiguras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Piramide piramide = new Piramide(5);
        Cuadrado cuadrado = new Cuadrado(3);
        Rectangulo rectangulo = new Rectangulo(8, 3);


        cuadrado.setColor(Constantes.TipoColor.VERDE);
        cuadrado.pintar();
        
        System.out.println("Area: " + cuadrado.area());
        System.out.println("Perimetro: " + cuadrado.perimetro());
        System.out.println("Area: " + rectangulo.area());
        System.out.println("");
        System.out.println("Perimetro: " + rectangulo.perimetro());
        rectangulo.setColor(Constantes.TipoColor.ROJO);
        rectangulo.pintar();
        System.out.println("");
        System.out.println("Perimetro: " + piramide.perimetro());
        System.out.println("Area: " + piramide.area());
        piramide.setColor(Constantes.TipoColor.AZUL);
        piramide.pintar();

    }

}
