/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package figuras;

/**
 *
 * @author raul
 */
public class Cuadrado extends Figura {

    private int lado;

    public Cuadrado(int lado) {
        this.lado = lado;
    }

    @Override
    public double area() {
        return this.lado * this.lado;
    }

    @Override
    public double perimetro() {
        return 4 * this.lado;
    }

    @Override
    public void pintar() {
        for (int i = 0; i < this.lado; i++) {
            System.out.println(this.colorRelleno + "* ".repeat(this.lado));
        }
    }

}
