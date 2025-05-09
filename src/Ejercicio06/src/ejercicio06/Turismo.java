package ejercicio06;


import java.time.LocalDate;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author raul
 */
public class Turismo extends Vehiculo{
    private double precioDia;

    public Turismo(String matricula, String marca_modelo, int km) {
        super(matricula, marca_modelo, km);
    }
    
    public void alquilar(LocalDate fecha_alquiler, int km){
        this.alquilado = true;
    }
    
    public void devolver(LocalDate fecha_alquiler, int km){
        this.alquilado = false;
    }
    
    
    
}
