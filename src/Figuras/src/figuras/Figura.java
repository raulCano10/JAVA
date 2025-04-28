/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package figuras;

import figuras.Constantes.TipoColor;

/**
 *
 * @author raul
 */
public abstract class Figura {

    protected String colorRelleno;
    public static final String NEGRO = "\033[30m";
    public static final String ROJO = "\033[31m";
    public static final String VERDE = "\033[32m";
    public static final String AZUL = "\033[34m";

    public Figura() {
        this.colorRelleno = NEGRO;
    }

    public void setColor(TipoColor color) {
        //TODO
        switch (color) {
            case TipoColor.NEGRO:
                this.colorRelleno = NEGRO;
                break;
            case TipoColor.AZUL:
                this.colorRelleno = AZUL;
                break;
            case TipoColor.ROJO:
                this.colorRelleno = ROJO;
                break;
            case TipoColor.VERDE:
                this.colorRelleno = VERDE;
                break;
        }

    }

    public abstract double area();

    public abstract double perimetro();

    public abstract void pintar();
}
