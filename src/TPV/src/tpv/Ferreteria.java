/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tpv;

import java.util.ArrayList;


public class Ferreteria {
    private String nombre;
    private ArrayList<Producto> listadoProductos;
    private ArrayList<Venta> listadoVentas;
    
    public Ferreteria(String nombre){
        this.nombre = nombre;
        this.listadoProductos = new ArrayList<Producto>();
        this.listadoVentas = new ArrayList<Venta>();
    }

    public String getNombre() {
        return nombre;
    }
    
    
    
    public void nuevoProducto(){
        
    }
    
    public boolean añadirStock(String ref, int unidades){
        return false;    
    }
    
    public Producto buscar(String ref){
        return null;
    }
    
    public Venta nuevaVenta(){
        
        //return venta;
        return null;
    }
}
