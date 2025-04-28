/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poligonos;

/**
 *
 * @author raul
 */
public class Rectangulo extends Poligono{
    private double ancho;
    private double alto;
    
    public Rectangulo(double ancho, double alto){
        super(4);
        this.ancho = ancho;
        this.alto = alto;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }
    
    public double Area(){
        System.out.println("AREA DE UN RECTANGULO: ");
        return ancho*alto;
    }
    
    @Override
    public String toString(){
        String cadena;
        
        cadena = String.format("La anchura es de: %f y la altura es de: %f",this.ancho,this.alto);
        return cadena;
    }
}
