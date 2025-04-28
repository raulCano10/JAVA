/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author raul
 */
public class Empleado {
    private String dni;
    private String nombre;
    private String email;
    private double salarioBase;
    private int horaExtras ;
    private double precioHoraExtra;

    public Empleado(String dni, String nombre) {
        this.dni = dni;
        this.nombre = nombre;
        this.precioHoraExtra= 10;
        this.salarioBase = 1000;
        this.horaExtras = 0;
    }

    public int getHoraExtras() {
        return horaExtras;
    }

    public void setHoraExtras(int horaExtras) {
        this.horaExtras = horaExtras;
    }

    public double getPrecioHoraExtra() {
        return precioHoraExtra;
    }

    public void setPrecioHoraExtra(double precioHoraExtra) {
        this.precioHoraExtra = precioHoraExtra;
    }
      
    
    public double calcularSueldo(){
        return this.salarioBase + (this.horaExtras*this.precioHoraExtra);
    }
    
    
    @Override
    public String toString(){
        return this.nombre +" (" + this.dni + ")" ;
    }
    
    
}
