package ejercicio06;

import java.time.LocalDate;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


public class Alquiler {
    
    private Vehiculo vehiculo;
    private int km_inicio;
    private int km_fin;
    private LocalDate fecha_inicio;
    private LocalDate fecha_fin;
    private double importe;

    public Alquiler(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }
    
    public double calcularImporte(){
        //TODO
        return 0;
    }
    
    public void imprimir(){
        System.out.printf("Vehiculo: %s; Km inicios: %d, Km final: %d, Fecha inicio: %s, Fecha fin: %s, Importe total: %f",
                this.vehiculo.toString(), this.km_inicio, this.km_fin, this.fecha_inicio, this.fecha_fin, calcularImporte());
    }
    
    public int calcularDias(){
        return 0;
        //TODO
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }
    
            
            
    
}
