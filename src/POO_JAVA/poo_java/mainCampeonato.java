/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poo_java;

import Clases.BD_Campeonato;
import Clases.Campeonato;
import Clases.Equipo;
import Clases.Jugador;
import java.util.Scanner;

/**
 *
 * @author raul
 */
public class mainCampeonato {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    Scanner sc = new Scanner(System.in);
    int opcion = 0;
    Campeonato campeonato = new Campeonato("La Liga");
    
    do{
        
        System.out.println("LA LIGA");
        System.out.println("================================");
        System.out.println("1. Alta jugador");
        System.out.println("2. Alta equipo");
        System.out.println("3. Fichajes");
        System.out.println("4. JUGAR CAMPEONATO");
        System.out.println("5. Listar Jugadores");
        System.out.println("6. Listar Equipos");
        System.out.println("7. Listar Partidos");
        System.out.println("8. Salir");
        
        System.out.print("Elige opcion> ");

//        int opcion = sc.nextInt();
//        sc.nextLine();

        opcion = Integer.parseInt(sc.nextLine());
        
        switch(opcion){
            case 1: 
                System.out.print("Nombre Jugador: ");
                String nombreJugador = sc.nextLine();
                System.out.println("Dorsal: ");
                int dorsal = Integer.parseInt(sc.nextLine());              
                
                boolean isAltaJugador = campeonato.altaJugador(nombreJugador, dorsal);
                if(isAltaJugador){   
                     System.out.println("Jugador: " + nombreJugador + " "
                            + "con dorsal: " + dorsal + " "
                            + "dado de alta correctamente en La Liga");                
                }else{
                   System.out.println("No se ha podido daar de alta al jugador. El dorsal ya existe");
                }
                break;
            case 2:
                System.out.println("Nombre Equipo");
                String nombreEquipo = sc.nextLine();
                
                boolean isAltaEquipo = campeonato.altaEquipo(nombreEquipo);
                
                 if(isAltaEquipo){   
                     System.out.println("Equipo: " + nombreEquipo
                            + "dado de alta correctamente en La Liga");                
                }else{
                   System.out.println("No se ha podido daar de alta al Equipo. El Equipo ya existe");
                }
                 
                break;
            case 3:
                System.out.print("Nombre equipo a fichar: ");
                String nombreEquipoFichajes = sc.nextLine();
                
                Equipo equipoEncontrado = null;
                
                for(Equipo equipo : BD_Campeonato.obtenerEquipos()){
                    if(equipo.getNombre().equalsIgnoreCase(nombreEquipoFichajes)){
                        equipoEncontrado = equipo;
                    }                      
                }
                
                if(equipoEncontrado == null){
                    System.out.println("Equipo no encontrado");
                    break;
                }
                
                System.out.print("Dorsal del jugador a fichar");
                int dorsalJugadorFichaje = Integer.parseInt(sc.nextLine());   
                
                Jugador jugadorEncontrado = null;
                
                for(Jugador jugador : BD_Campeonato.obtenerJugadores()){
                    if(jugador.getDorsal() == dorsalJugadorFichaje){
                        jugadorEncontrado = jugador;
                    }                      
                }
                
                if(jugadorEncontrado == null){
                    System.out.println("Jugador no encontrado");
                    break;
                }
                
                equipoEncontrado.fichar(jugadorEncontrado);
                           
                break;
            case 4:
                campeonato.jugarCampeonato();
                break;
            case 5:
                BD_Campeonato.listarJugadores();
                break;
            case 6:
                BD_Campeonato.listarEquipos();
                break;
            case 7:
                BD_Campeonato.listarPartidos();
                break;
            case 8:
                System.out.println("Saliendo del menu del Campeonato");
                break;
            default:
                System.out.println("Debe seleccionar una opcion entre 1 - 8");
                break;
        }      
        }while(opcion != 8);
        
    }
    
}
