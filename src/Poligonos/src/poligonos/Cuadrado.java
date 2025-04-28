/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poligonos;

/**
 *
 * @author raul
 */
public class Cuadrado  extends Poligono {
    private double lado1;
    private double lado2;
    private double lado3;
    private double lado4;
    

    public Cuadrado(int num_lados, double lado) {
        super(num_lados);
        this.lado1 = lado;
        this.lado2 = lado;
        this.lado3 = lado;
        this.lado4 = lado;
        
    }

    public double getLado1() {
        return lado1;
    }

    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }

    public double getLado3() {
        return lado3;
    }

    public void setLado3(double lado3) {
        this.lado3 = lado3;
    }

    public double getLado4() {
        return lado4;
    }

    public void setLado4(double lado4) {
        this.lado4 = lado4;
    }

    public double Area(){
        System.out.println("AREA DE UN CUADRADO: ");
        return lado1*lado2;
    }
    
    @Override
    public String toString(){
        String cadena;
        
        cadena = String.format("El lado1 mide: %f  el lado2 mide: %f  el lado3 mide: %f el lado4 mide: %f",this.lado1,this.lado2,this.lado3,this.lado4);
        return cadena;
    }
}
