/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tpv;

import java.util.ArrayList;


public class Venta {
    private int numero;
    private ArrayList<LineaVenta> lineas;
    private int IVA;
    private double importe;
    
    public Venta(){
        this.lineas = new ArrayList();
    }
    
    public void addLinea(Producto p, int cantidad){
        LineaVenta nuevaLineaVenta = new LineaVenta(p,cantidad);
        lineas.add(nuevaLineaVenta);
    }
    
    public void imprimirVenta(){
        
    }
    
    @Override
    public String toString(){
        return "";
    }
}
