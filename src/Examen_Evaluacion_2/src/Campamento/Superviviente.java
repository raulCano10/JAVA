/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Campamento;

import Campamento.Constantes.Habilidad;
import java.util.ArrayList;

        
public class Superviviente {
    private String nombre;
    private int edad;
    private Habilidad habilidad;
    private ArrayList<String> objetos;
    
    
    public Superviviente(String nombre, int edad, Habilidad hab){
        this.nombre = nombre;
        this.edad = edad;
        this.habilidad = hab;
        this.objetos = new ArrayList<>();
    }
    
    public void añadirObjeto(String objeto){
        this.objetos.add(objeto);
    }
    
    public void mostrarInfo(){
        System.out.println("Supervivientes:");
        String cadena1 = String.format("- %s (%d anios, %s)", this.nombre, this.edad, this.habilidad);        
        System.out.println(cadena1);
        System.out.println("");
        System.out.print(" Objetos: [");
        for(String objeto : this.objetos){
            System.out.print(" " + objeto + ",");
        }
        System.out.print("]");
    }

    public String getNombre() {
        return nombre;
    }
    
    
    
}
