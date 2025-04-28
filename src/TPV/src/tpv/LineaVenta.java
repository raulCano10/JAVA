/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tpv;

/**
 *
 * @author raul
 */
public class LineaVenta {
    private Producto producto;
    private int cantidad;
    
    public LineaVenta(Producto p, int cantidad){
        this.producto = p;
        this.cantidad = cantidad;
    }
    
    public void imprimirLinea(){
        System.out.println(this.producto.getRef() + " - " + this.producto.getDescripcion() + " - " + this.producto.getPrecioUnitario() + " - " + this.producto.getUnidades() + " - " + this.cantidad);
    }
}
