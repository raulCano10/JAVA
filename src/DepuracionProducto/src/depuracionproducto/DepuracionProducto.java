/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package depuracionproducto;

/**
 * ¿Cuantas veces se llama a la funcion aplicarDescuento? R:4
 * ¿Que valor tiene descuento cuando posicion=1? Descuento vale 0.2
 * ¿Que ocurre si cambias el valor de precio en el debugger?
 * */

public class DepuracionProducto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] productos = {"Teclado", "Ratón", "Monitor", "Impresora"};
        double[] precios = {19.99, 9.99, 120.0, 89.5};
        double total = 0;
        for (int i = 0; i < productos.length; i++) {
        System.out.println("Producto: " + productos[i]);
        total += aplicarDescuento(precios[i], i);
        }
        System.out.println("Total con descuentos aplicados: " + total);
        }
        public static double aplicarDescuento(double precio, int posicion) {
        double descuento = 0;
        if (posicion % 2 == 0) {
        descuento = 0.1;
        } else {
        descuento = 0.2;
        }
        double precioFinal = precio - (precio * descuento);
        return precioFinal;
        }
        
    }
    

