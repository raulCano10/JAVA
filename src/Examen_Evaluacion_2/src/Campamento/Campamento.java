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
public class Campamento {
    private String nombre;
    private ArrayList<String> zonas;
    private ArrayList<Superviviente> supervivientes;
    private ArrayList<EquipoExpedicion> expediciones;
    
    public Campamento(String nombre){
        this.nombre = nombre;
        this.zonas = new ArrayList<>();
        this.supervivientes = new ArrayList<>();
        this.expediciones = new ArrayList<>();
    }
    
    public void añadirZona(String zona){
        //TODO: Validar que no exista la zona en el arrayList de zonas
        //En caso de que exista no añadir y mostrar un mensaje al usuario
        this.zonas.add(zona);
    }
    
    public void añadirSuperviviente(Superviviente s){
        this.supervivientes.add(s);
    }
    
    public EquipoExpedicion formarExpedicion(String d, LocalDate fi, LocalDate ff){
            EquipoExpedicion expedicion = new EquipoExpedicion(d, fi, ff);
            this.expediciones.add(expedicion);
            return expedicion;
    }
    
    public void mostrarEstadoCampamento(){
        //TODO:
    }

    public ArrayList<Superviviente> getSupervivientes() {
        return this.supervivientes;
    }

    public ArrayList<EquipoExpedicion> getExpediciones() {
        return this.expediciones;
    }
    
    
}
