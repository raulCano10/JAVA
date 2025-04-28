/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author raul
 */
public class Director extends Empleado{
    private int numDespacho;
    private double plusSalario;

    public Director(String dni, String nombre,int numDespacho) {
        super(dni, nombre);
        this.numDespacho= numDespacho;
        this.plusSalario = 400;
        this.setPrecioHoraExtra(20);
    }
    

    @Override
    public double calcularSueldo() {
        return super.calcularSueldo() + this.plusSalario;
    }

    public void analizarDatos(){
        System.out.println("Estoy analizando datos...");
    }
    
    
}
