/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package figuras;

/**
 *
 * @author raul
 */
public class Rectangulo extends Figura {

    private int ladoLargo;
    private int ladoCorto;

    public Rectangulo(int lar, int cor) {
        this.ladoLargo = lar;
        this.ladoCorto = cor;
    }

    @Override
    public double area() {
        return this.ladoCorto * this.ladoLargo;
    }

    @Override
    public double perimetro() {
        return 2 * (this.ladoCorto + this.ladoLargo);
    }

    @Override
    public void pintar() {
        for (int i = 0; i < this.ladoCorto; i++) {
            System.out.println(this.colorRelleno + "* ".repeat(this.ladoLargo));
        }
    }
}
