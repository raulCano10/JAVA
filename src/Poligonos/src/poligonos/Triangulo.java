/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poligonos;

/**
 *
 * @author raul
 */
public class Triangulo extends Poligono implements IPpoligono{
    private double lado1;
    private double lado2;
    private double lado3;

    public Triangulo(double lado1, double lado2, double lado3) {
        super(3);
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
        
    }
    
    @Override
    public boolean esMayorQue(int a){
        return false;
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

    
    @Override
    public double Area(){
        String otraCadena = "Hola";
        System.out.println("AREA DE UN TRIANGULO: ");
        otraCadena = "HE CAMBIADO ESTA CADENA";
        double p = (lado1+lado2+lado3)/2;
        int numerador = 7;
        double denominador = 1;
        double num;
        otraCadena = "HE CAMBIADO ESTA CADENA";
        num = (numerador / denominador);
        System.out.println(num);
        return Math.sqrt(p * (p-lado1) * (p-lado2) * (p-lado3));
    }
    
    
    @Override
    public String toString(){
        String cadena;
        
        cadena = String.format("El lado1 mide: %f  el lado2 mide: %f  el lado3 mide: %f",this.lado1,this.lado2,this.lado3);
        return cadena;
    }
}
