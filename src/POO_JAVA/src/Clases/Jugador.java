/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author raul
 */
public class Jugador {
    private String nombre;
    private int dorsal;
    private boolean fichado;
    
    public Jugador(String n, int d){
        this.nombre = n;
        this.dorsal = d;
        this.fichado = false;
    } 
    
    @Override
    public String toString(){
        if (this.fichado) {
//          return "["+this.dorsal+"]" + "    " + this.nombre +"\\u001[31m" +" Fichado"+"\\u001[0m";
            return String.format("[%2s] %20s\033[31m %10s \033[0m",this.dorsal ,this.nombre ,"FICHADO");
        }else{
//            return "["+this.dorsal+"]" + "    " + this.nombre +"\\u001[32m" +" Libre"+"\\u001[0m";
              return String.format("[%2s] %20s\033[32m %10s \033[0m",this.dorsal ,this.nombre ,"LIBRE");
        }
        
    }

    public boolean isFichado() {
        return this.fichado;
    }

    public void setFichado(boolean fichado) {
        this.fichado = fichado;
    }

    public int getDorsal() {
        return dorsal;
    }
    
    
    
    
}
