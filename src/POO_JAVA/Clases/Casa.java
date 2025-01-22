/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author raul
 */
public class Casa {
    private String propietario;
    private int superficiePlanta1;
    private int superficiePlanta2;
    private double precioVenta;
    
    public Casa(String propietario, int p1, int p2, double precio){
        this.propietario = propietario;
        this.superficiePlanta1 = p1;
        this.superficiePlanta2 = p2;
        this.precioVenta = precio;
    }

    public String getPropietario() {
        return this.propietario;
    }

    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }

    public int getSuperficiePlanta1() {
        return this.superficiePlanta1;
    }

    public void setSuperficiePlanta1(int superficiePlanta1) {
        this.superficiePlanta1 = superficiePlanta1;
    }

    public int getSuperficiePlanta2() {
        return this.superficiePlanta2;
    }

    public void setSuperficiePlanta2(int superficiePlanta2) {
        this.superficiePlanta2 = superficiePlanta2;
    }

    public double getPrecioVenta() {
        return this.precioVenta;
    }

    public void setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
    }
    
    public void imprimirDatos(){
        System.out.println("Casa de " 
                + this.propietario + 
                " | Superficie total: " + this.calcularSuperficie() + "m2 | " +
                " | Precio: " + this.precioVenta + "¤");
    }
    
    private int calcularSuperficie(){
        return this.superficiePlanta1 + this.superficiePlanta2;
    }
}
