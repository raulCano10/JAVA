/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import java.util.ArrayList;

/**
 *
 * @author raul
 */
public class BD_Campeonato {
    private static ArrayList<Jugador> listaJugadores = new ArrayList<>();
    private static ArrayList<Equipo> listaEquipos = new ArrayList<>();
    private static ArrayList<Partido> listaPartidos = new ArrayList<>();
    
    public static void addJugador(Jugador jug){
        BD_Campeonato.listaJugadores.add(jug);
    }
    
    public static void addEquipo(Equipo e){
        BD_Campeonato.listaEquipos.add(e);
    }
    
    public static void addPartido(Partido part){
        BD_Campeonato.listaPartidos.add(part);
    }
    
    public static void listarJugadores(){
        try{
            System.out.println("=====BBDD jugadores=====");
            for (Jugador jugador : listaJugadores){
                System.out.println(jugador.toString());
            }
            System.out.println("========================");
        }catch(Exception ex){
            System.out.println("ERROR");
        }
       
        
        System.out.println("=====BBDD jugadores=====");
        for (Jugador jugador : listaJugadores){
            try{
                System.out.println(jugador.toString());
            }catch(Exception ex){
                System.out.println("ERROR");
            }            
        }
        System.out.println("========================");
    }
    
    public static void listarEquipos(){
        for (Equipo team : listaEquipos){
            team.imprimirPlantilla();
        }      
    }
    
    public static void listarPartidos(){
        for(Partido partido : listaPartidos ){
            System.out.println(partido.toString());
        }
    }
    
    public static ArrayList<Jugador> obtenerJugadores(){
        return BD_Campeonato.listaJugadores;
    }
    
    public static ArrayList<Equipo> obtenerEquipos(){
        return BD_Campeonato.listaEquipos;
    }
    
    public static ArrayList<Partido> obtenerPartidos(){
        return BD_Campeonato.listaPartidos;
    }
}
