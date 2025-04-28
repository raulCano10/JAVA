/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author raul
 */
public class Partido {
    private int id;
    private Equipo equipoLocal;
    private Equipo equipoVisitante;
    private int golesLocal;
    private int golesVisitante;
    
    public Partido(Equipo equipoLocal, Equipo equipoVisitante){
        this.equipoLocal = equipoLocal;
        this.equipoVisitante = equipoVisitante;
        this.golesLocal = 0;
        this.golesVisitante = 0;   
        jugarPartido();
        mostrarResultado();
    }
    
    private void jugarPartido(){
        this.golesLocal = (int)(Math.random()*10);
        this.golesVisitante = (int)(Math.random()*10);
        
        //Gana equipo local --> sumamos 3 puntos al equipo local
        if(this.golesLocal > this.golesVisitante){
            this.equipoLocal.añadirVictoria();
            this.equipoVisitante.añadirDerrota();            
        }else if(this.golesVisitante > this.golesLocal){  //Gana equipo visitante --> sumamos 3 puntos al equipo visitante
            this.equipoVisitante.añadirVictoria();
            this.equipoLocal.añadirDerrota();          
        }else{ //Empate
            this.equipoLocal.añadirEmpate();
            this.equipoVisitante.añadirEmpate();
        }              
    }
    
    private void mostrarResultado(){
         if(this.golesLocal > this.golesVisitante){
            System.out.println("\033[32m" + this.equipoLocal.getNombre() + " " + this.golesLocal + "\033[0m "
                    + "Vs " 
                    + this.golesVisitante + " " + this.equipoVisitante.getNombre());      
            
        }else if(this.golesVisitante > this.golesLocal){  //Gana equipo visitante --> sumamos 3 puntos al equipo visitante
            System.out.println(this.equipoLocal.getNombre() + " " + this.golesLocal + "\033[32m "
                    + "Vs " 
                    + this.golesVisitante + " " + this.equipoVisitante.getNombre() + "\033[0m");      
            
        }else{ //Empate
            System.out.println("\033[35m" + this.equipoLocal.getNombre() + " " + this.golesLocal + " "
                    + "Vs " 
                    + this.golesVisitante + " " + this.equipoVisitante.getNombre()+ "\033[0m");
        }   
    }
    
    @Override
    public String toString(){
        return "Equipo Local: "+ this.equipoLocal.getNombre() + " vs "+ "Equipo Visitante: " + this.equipoVisitante.getNombre();
    }
    
}
