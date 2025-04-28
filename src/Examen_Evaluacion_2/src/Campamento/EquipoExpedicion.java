/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Campamento;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author raul
 */
public class EquipoExpedicion {
    private int idExpedicion; //idenfificador unico asignarlo automaticamente 1, 2, 3 etc control global
    //numero tal expediciones
    private ArrayList<Superviviente> supervivientes;
    private String destino;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    
    
    private final int MAX_SUPERVIVIENTES = 20; 
    
    public EquipoExpedicion(String destino, LocalDate fi, LocalDate ff){
        this.destino = destino;
        this.fechaInicio = fi;
        this.fechaFin = ff;
        this.supervivientes = new ArrayList<>();
    }
    
    public long calcularDuracion(){
        //TODO:
        return 0;
    }
    
    public boolean estaEnCurso(){
        //TODO:
        return false;
    }
    
    public void mostrarExpedicion(){
        //TODO:
    }
    
    public boolean añadirSuperviviente(Superviviente s){
        if(this.supervivientes.size() < this.MAX_SUPERVIVIENTES){
           this.supervivientes.add(s);
            return true;
        }
        return false;
    }

    public int getIdExpedicion() {
        return idExpedicion;
    }
    
    
}
