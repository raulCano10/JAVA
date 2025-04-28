/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package figuras;

/**
 *
 * @author raul
 */
public class Piramide extends Figura {

    private int altura;
    private int base;

    public Piramide(int altura) {
        this.altura = altura;
        this.base = altura * 2 - 1;
    }

    @Override
    public double area() {
        return base * altura / 2;
    }

    @Override
    public double perimetro() {
        double h = Math.sqrt(Math.pow(altura, 2) + Math.pow(base / 2, 2));
        return base + h * 2;
    }

    @Override
    public void pintar() {
        for (int i = 0; i < altura; i++) {
            System.out.println(colorRelleno + " ".repeat(altura - i) + "#" + "#".repeat(i * 2));
        }
    }

}
