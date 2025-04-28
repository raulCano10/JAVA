/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tpv;

/**
 *
 * @author raul
 */
public class Producto {
    private String ref;
    private String descripcion;
    private Double precioUnitario;
    private int unidades;

    public Producto(String ref, String descripcion, Double precioUnitario, int unidades) {
        this.ref = ref;
        this.descripcion = descripcion;
        this.precioUnitario = precioUnitario;
        this.unidades = unidades;
    }  
    
    @Override
    public String toString(){
        return "";
    }

    public String getRef() {
        return ref;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public Double getPrecioUnitario() {
        return precioUnitario;
    }

    public int getUnidades() {
        return unidades;
    }
    
    
    
}
